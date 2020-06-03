package br.com.zup.pontointeligente.services.impl

import br.com.zup.pontointeligente.documents.Empresa
import br.com.zup.pontointeligente.repositories.EmpresaRepository
import br.com.zup.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service                 //Injeção de dependências pelo construtor
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {
    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}