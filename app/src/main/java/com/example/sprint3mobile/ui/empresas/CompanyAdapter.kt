import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sprint3mobile.R
import com.example.sprint3mobile.data.Company

class CompanyAdapter(private var companies: List<Company>) :
    RecyclerView.Adapter<CompanyAdapter.CompanyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompanyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_company, parent, false)
        return CompanyViewHolder(view)
    }

    override fun onBindViewHolder(holder: CompanyViewHolder, position: Int) {
        val company = companies[position]
        holder.bind(company)
    }

    override fun getItemCount(): Int = companies.size

    fun updateCompanies(newCompanies: List<Company>) {
        companies = newCompanies
        notifyDataSetChanged()
    }

    class CompanyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        private val sizeTextView: TextView = itemView.findViewById(R.id.sizeTextView)
        private val sectorTextView: TextView = itemView.findViewById(R.id.sectorTextView)
        private val locationTextView: TextView = itemView.findViewById(R.id.locationTextView)
        private val employeesTextView: TextView = itemView.findViewById(R.id.employeesTextView)
        private val typeTextView: TextView = itemView.findViewById(R.id.typeTextView)
        private val clientTextView: TextView = itemView.findViewById(R.id.clientTextView)

        fun bind(company: Company) {
            nameTextView.text = "${company.nome}"
            sizeTextView.text = "Tamanho: ${company.tamanho}"
            sectorTextView.text = "Setor: ${company.setor}"
            locationTextView.text = "Localização: ${company.localizacaoGeografica}"
            employeesTextView.text = "Número de Funcionários: ${company.numeroFuncionarios}"
            typeTextView.text = "Tipo: ${company.tipoEmpresa}"
            clientTextView.text = "Cliente: ${if (company.cliente) "Sim" else "Não"}"
        }
    }
}
