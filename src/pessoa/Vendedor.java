package pessoa;

public class Vendedor extends Pessoa{	
	public Vendedor(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;	
	}
	
	public String toString() {
		return "\nVendedor: " + nome + ", CPF: " + cpf + ", Telefone: " + telefone + "\n";
	}
}
