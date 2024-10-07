package modelo;

import java.time.LocalDate;

import pessoa.Cliente;
import pessoa.Vendedor;

public class Venda {

	private int lojaId;
	private Veiculo veiculoVendido;
	private Vendedor vendedorResponsavel;
	private Cliente clienteComprador;
	private LocalDate dataVenda;

	public Venda(int lojaId, Veiculo veiculoVendido, Vendedor vendedorResponsavel, Cliente clienteComprador,
			LocalDate dataVenda) {
		this.veiculoVendido = veiculoVendido;
		this.vendedorResponsavel = vendedorResponsavel;
		this.clienteComprador = clienteComprador;
		this.dataVenda = dataVenda;
		this.lojaId = lojaId;
	}

	public Veiculo getVeiculoVendido() {
		return veiculoVendido;
	}

	public void setVeiculoVendido(Veiculo veiculoVendido) {
		this.veiculoVendido = veiculoVendido;
	}

	public Vendedor getVendedorResponsavel() {
		return vendedorResponsavel;
	}

	public void setVendedorResponsavel(Vendedor vendedorResponsavel) {
		this.vendedorResponsavel = vendedorResponsavel;
	}

	public Cliente getClienteComprador() {
		return clienteComprador;
	}

	public void setClienteComprador(Cliente clienteComprador) {
		this.clienteComprador = clienteComprador;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public int getLojaId() {
		return lojaId;
	}

	@Override
	public String toString() {
		return "ID =" + lojaId + ", Veiculo Vendido = " + veiculoVendido + ", Vendedor Responsavel = "
				+ vendedorResponsavel + ", Cliente Comprador = " + clienteComprador + ", Data Venda = " + dataVenda;
	}
}
