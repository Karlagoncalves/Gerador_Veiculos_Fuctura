package pessoa;

public class Cliente extends Pessoa {
	public Cliente(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "\nCliente: " + nome + ", CPF: " + cpf + ", Telefone: " + telefone + "\n";
	}
}
