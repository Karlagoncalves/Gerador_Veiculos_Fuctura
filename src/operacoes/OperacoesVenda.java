package operacoes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Veiculo;
import modelo.Venda;
import pessoa.Cliente;
import pessoa.Vendedor;

public class OperacoesVenda {

	static List<Venda> vendas = new ArrayList<>();

	public static void cadastrarVenda(Scanner scan) {

		Veiculo veiculoVendido = OperacoesVeiculo.getCarroPorPlaca(scan);

		if (veiculoVendido == null) {
			System.out.println("Veículo não encontrado");
			return;
		}

		Vendedor vendedorResponsavel = OperacoesVendedor.scanVendedor(scan);

		if (vendedorResponsavel == null) {
			System.out.println("Vendedor não encontrado");
			return;
		}

		Cliente clienteComprador = OperacoesCliente.scanCliente(scan);

		if (clienteComprador == null) {
			System.out.println("Cliente não encontrado");
			return;
		}

		LocalDate dataVenda = LocalDate.now();

		Venda venda = new Venda(vendas.size() + 1, veiculoVendido, vendedorResponsavel, clienteComprador, dataVenda);

		vendas.add(venda);

		System.out.println("Venda cadastrado(a) com sucesso!");
		System.out.println("Resumo: " + venda);

	}

	public static Veiculo encontrarVeiculo(List<Veiculo> veiculos, Scanner scan) {
		System.out.println("Informe a placa do veículo vendido: ");
		String placa = scan.next();
		for (Veiculo veiculo : veiculos) {
			if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
				System.out.println("Veículo encontrado: " + veiculo);
				return veiculo;
			}
			System.out.println("Veículo não encontrado: " + veiculo);
			return null;
		}
		return null;
	}

	public static void excluirVenda(Scanner scan) {
		System.out.println("Informe o id que deseja cancelar a venda: ");
		int id = scan.nextInt();

		for (Venda venda : vendas) {
			if (venda.getLojaId() == id) {
				vendas.removeIf(vendas -> venda.getLojaId() == id);
			}

		}
	}

}
