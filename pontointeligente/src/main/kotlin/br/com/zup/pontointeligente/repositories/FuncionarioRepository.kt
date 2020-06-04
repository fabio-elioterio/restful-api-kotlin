package br.com.zup.pontointeligente.repositories

import br.com.zup.pontointeligente.documents.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface FuncionarioRepository : MongoRepository<Funcionario, String> {

    override fun findById(id: String): Optional<Funcionario>

    fun findByEmail(email: String): Funcionario?

    fun findByCpf(cpf: String): Funcionario?
}