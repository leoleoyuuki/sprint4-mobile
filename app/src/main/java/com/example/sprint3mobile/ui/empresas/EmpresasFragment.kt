package com.example.sprint3mobile.ui.empresas
import CompanyAdapter
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sprint3mobile.R
import com.example.sprint3mobile.RetrofitClient
import com.example.sprint3mobile.data.Company
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class EmpresasFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var companyAdapter: CompanyAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_empresas, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Initialize the adapter with an empty list
        companyAdapter = CompanyAdapter(emptyList())
        recyclerView.adapter = companyAdapter

        // Fetch companies
        fetchCompanies()

        return view
    }

    private fun fetchCompanies() {
        RetrofitClient.instance.getCompanies().enqueue(object : Callback<List<Company>> {
            override fun onResponse(call: Call<List<Company>>, response: Response<List<Company>>) {
                if (response.isSuccessful) {
                    val companies = response.body() ?: emptyList()
                    // Update the adapter with the list of companies
                    companyAdapter.updateCompanies(companies)
                } else {
                    // Handle the error response
                    handleError("Erro na resposta: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<List<Company>>, t: Throwable) {
                // Handle the failure
                handleError("Falha na requisição: ${t.message}")
            }
        })
    }

    private fun handleError(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        Log.i("erro", message)
    }
}
