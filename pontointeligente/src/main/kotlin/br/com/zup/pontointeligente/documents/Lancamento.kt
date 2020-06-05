package br.com.zup.pontointeligente.documents

import br.com.zup.pontointeligente.enums.TipoEnum
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document  //O @Document pode ser comparado como o @Entity, porem o document é para mapear o objeto no mongoDB
data class Lancamento(
        val data: Date,
        val tipo: TipoEnum,
        val funcionarioId: String,
        val descricao: String? = "",
        val localizacao: String? = ""
)