package br.com.zup.pontointeligente

import br.com.zup.pontointeligente.documents.Empresa
import br.com.zup.pontointeligente.documents.Funcionario
import br.com.zup.pontointeligente.enums.PerfilEnum
import br.com.zup.pontointeligente.repositories.EmpresaRepository
import br.com.zup.pontointeligente.repositories.FuncionarioRepository
import br.com.zup.pontointeligente.utils.SenhaUtils
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PontointeligenteApplication(val empresaRepository: EmpresaRepository,
								  val funcionarioRepository: FuncionarioRepository): CommandLineRunner {
	override fun run(vararg args: String?) {
		empresaRepository.deleteAll()
		funcionarioRepository.deleteAll()

		val empresa: Empresa = Empresa("Empresa", "10443887800146", "12")
		empresaRepository.save(empresa)

		val admin: Funcionario = Funcionario("Fabio", "fabio.elioterio@zup.com.br",
		SenhaUtils().geraBcrypt("12345"), "50796694893", PerfilEnum.ROLE_ADMIN, empresa.id!!)
		funcionarioRepository.save(admin)

		val funcionario: Funcionario = Funcionario("Braulio", "braulio@zup.com.br",
		SenhaUtils().geraBcrypt("56789"), "76576654312", PerfilEnum.ROLE_USER, empresa.id!!)
		funcionarioRepository.save(funcionario)

		System.out.println("Empresa ID: ${empresa.id}")
		System.out.println("Admin ID: ${admin.id}")
		System.out.println("Funcionario ID: ${funcionario.id}")
	}
}

fun main(args: Array<String>) {
	runApplication<PontointeligenteApplication>(*args)
}
