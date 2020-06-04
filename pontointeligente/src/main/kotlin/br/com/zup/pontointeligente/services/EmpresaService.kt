package br.com.zup.pontointeligente.services

import br.com.zup.pontointeligente.documents.Empresa

interface   EmpresaService {

    fun buscarPorCnpj(cnpj: String): Empresa?

    fun persistir(empresa: Empresa): Empresa
}