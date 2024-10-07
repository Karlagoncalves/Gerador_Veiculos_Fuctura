package modelo;

public class Loja {
	
	private int id;
	
	private String nome;
	private String endereco;
	private String telefone;
	
	public Loja(int id, String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "\n Nome = " + nome + ", Endereço = " + endereco + ", Telefone = " + telefone + "\n";
	}

}
