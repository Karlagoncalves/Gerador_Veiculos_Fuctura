package modelo;

public class LojaVendedor {
	
	int lojaId;
	String cpf;
	
	public  LojaVendedor(int lojaId, String cpf) {
		this.lojaId = lojaId;
		this.cpf = cpf;
		
	}

	public int getLojaId() {
		return lojaId;
	}

	public void setLojaId(int lojaId) {
		this.lojaId = lojaId;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
