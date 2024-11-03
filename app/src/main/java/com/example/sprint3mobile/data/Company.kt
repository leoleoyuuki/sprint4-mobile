package com.example.sprint3mobile.data

data class Company(
    val id: Long,
    val nome: String,
    val tamanho: String,
    val setor:String,
    val localizacaoGeografica: String,
    val numeroFuncionarios : Int,
    val tipoEmpresa: String,
    val cliente: Boolean

)
