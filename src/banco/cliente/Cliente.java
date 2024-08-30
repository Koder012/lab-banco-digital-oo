package banco.cliente;

import java.util.ArrayList;
import java.util.List;

import banco.conta.Conta;

public class Cliente {

	private String nome;
	private List<Conta> contas;
	public Cliente(String nome){
		setNome(nome);
		this.contas = new ArrayList<>();
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void addConta(Conta conta){
		contas.add(conta);
	}

}
