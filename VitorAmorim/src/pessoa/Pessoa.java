package pessoa;

public class Pessoa {
	private String nome;
	public Telefone telefone;
	public Endereco endereco;
	
	public Pessoa(String nome, Telefone telefone, Endereco endereco) {
	
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	

	
}