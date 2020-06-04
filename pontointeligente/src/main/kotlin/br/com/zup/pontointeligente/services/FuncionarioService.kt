package br.com.zup.pontointeligente.services

import br.com.zup.pontointeligente.documents.Funcionario

interface FuncionarioService {

    fun persistir(funcionario: Funcionario): Funcionario

    fun buscarPorCpf(cpf: String): Funcionario?

    fun bucarPorEmail(email: String): Funcionario?

    fun buscarPorId(id: String): Funcionario?
}