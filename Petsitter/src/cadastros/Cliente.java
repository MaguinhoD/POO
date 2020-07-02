package cadastros;

import cadastros.Endereco;
import cadastros.Telefone;
import cadastros.Animal;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nome;
	private String cpf;
	public Telefone telefone;
	public Endereco endereco;
	public List<Animal> animais;
	
	public Cliente(String nome, String cpf, Telefone telefone, Endereco endereco, List<Animal> animais) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.animais = animais;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void imprimir() {
		System.out.println("Nome: "+nome);
		System.out.println("CPF: "+cpf);
		endereco.imprimirEnd();
		telefone.imprimirTel();
		for (Animal pet : animais) {
			System.out.println("\nDescrição do Pet\n");
			pet.imprimirPet();
		}
	}
		
	public List<String> imprimiranimal() {
		List<String> gen = new ArrayList<String>();
		for (Animal pet : animais) {
			gen.add(pet.getGenero());
		}
		return gen;
	}

	public List<String> QuantRaca() {
		List<String> rac = new ArrayList<String>();
		for (Animal raca : animais) {
			rac.add(raca.getRaca());
		}
		return rac;
	}
	
		
	

}
