package banco;

import java.util.List;

import banco.cliente.Cliente;


public class Banco {

	private String nome;
	private String codigoDoBanco;
	private List<Cliente> clientes;

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected void setCodigoDoBanco(String codigo){
		codigoDoBanco = codigo;
	}

	protected String getCodigoDoBanco(){
		return codigoDoBanco;
	}

	protected List<Cliente> getContas() {
		return clientes;
	}

	protected void addCliente(Cliente novoCliente) {
		clientes.add(novoCliente);
	}

}
