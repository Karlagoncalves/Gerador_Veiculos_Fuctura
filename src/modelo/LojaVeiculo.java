package modelo;


public class LojaVeiculo {
	
	int lojaId;
	String placa;
	
	public  LojaVeiculo(int lojaId, String placa) {
		this.lojaId = lojaId;
		this.placa = placa;
		
	}
	
	public int getLojaId() {
		return lojaId;
	}

	public void setLojaId(int lojaId) {
		this.lojaId = lojaId;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	@Override
	public String toString() {
		return "LojaVeiculo [lojaId=" + lojaId + ", placa=" + placa + "]";
	}
	
	


}
