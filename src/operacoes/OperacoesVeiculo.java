package operacoes;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.LojaVeiculo;
import modelo.Veiculo;

public class OperacoesVeiculo {

	static ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	static ArrayList<LojaVeiculo> lojaVeiculos = new ArrayList<LojaVeiculo>();

	public static void cadastrarVeiculo(Scanner scan) {
		System.out.println("Informe a Marca: ");
		String marca = scan.next();
		System.out.println("Informe o Modelo: ");
		String modelo = scan.next();
		System.out.println("Informe o Ano: ");
		int ano = scan.nextInt();
		System.out.println("Informe a Placa: ");
		String placa = scan.next();
		System.out.println("Informe o Preço: ");
		double preco = scan.nextDouble();

		Veiculo veiculo = new Veiculo(marca, modelo, ano, placa, preco);

		veiculos.add(veiculo);

		System.out.println("Veículo cadastrado com sucesso!");

	}

	public static void excluirVeiculo(Scanner scan) {
		System.out.println("Informe a Placa do veículo a ser excluído: ");
		String placa = scan.next();

		Boolean encontrado = veiculos.removeIf(veiculo -> veiculo.getPlaca().equalsIgnoreCase(placa));

		if (encontrado) {
			System.out.println("Vendedor(a) removido com sucesso!");

		} else {
			System.out.println("Vendedor(a) com o CPF informado não encontrado(a)!");

		}
	}

	public static void alterarDadosDoVeiculo(Scanner scan) {
		System.out.println("Informe a Placa do veículo para ser alterado os dados: ");
		String placa = scan.next();

		Boolean encontrado = false;

		for (Veiculo veiculo : veiculos) {
			if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
				System.out.println("Informe o que deseja alterar:");
				System.out.println("1 - Marca do veículo");
				System.out.println("2 - Modelo do veículo");
				System.out.println("3 - Ano do veículo");
				System.out.println("4 - Preço do veículo");
				int opcao = scan.nextInt();
				encontrado = true;

				switch (opcao) {
				case 1:
					System.out.println("Informe a nova marca: ");
					veiculo.setMarca(scan.next());
					System.out.println("Alteração realizada com sucesso!");

					break;
				case 2:
					System.out.println("Informe a novo modelo: ");
					veiculo.setModelo(scan.next());
					System.out.println("Alteração realizada com sucesso!");
					break;
				case 3:
					System.out.println("Informe a novo ano: ");
					veiculo.setAno(scan.nextInt());
					System.out.println("Alteração realizada com sucesso!");
					break;
				case 4:
					System.out.println("Informe a novo preco: ");
					veiculo.setPreco(scan.nextDouble());
					System.out.println("Alteração realizada com sucesso!");
					break;

				default:
					System.out.println("Opção inválida!");
					break;
				}
			}

		}

		if (!encontrado) {
			System.out.println("Veículo não encontrado!");

		}

	}

	public static String scanPlaca(Scanner scan) {
		System.out.println("Informe a placa que deseja consultar: ");
		String placa = scan.next();
		return placa;
	}

	public static void scanearPlacaEImprimir(Scanner scan) {
		String placa = scanPlaca(scan);
		imprimirDadosCarro(placa);
	}

	public static Veiculo getCarroPorPlaca(Scanner scan) {
		String placa = scanPlaca(scan);

		for (Veiculo veiculo : veiculos) {
			if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
				return veiculo;
			}
		}

		return null;
	}

	public static void imprimirDadosCarro(String placa) {
		boolean encontrado = false;
		for (Veiculo veiculo : veiculos) {
			if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
				System.out.println("Veículo encontrado: " + veiculo);
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Veículo não encontrado com a placa: " + placa);
		}
	}

	public static void associarLoja(Scanner scan) {
		System.out.println("Informe o ID da loja que deseja associar o veiculo: ");
		int lojaId = scan.nextInt();

		System.out.println("Informe a placa do veiculo: ");
		String placa = scan.next();

		boolean existeLoja = OperacoesLoja.verificarLoja(lojaId);

		if (!existeLoja) {
			System.out.println("Loja não encontrado");
			return;
		}

		boolean veiculoEncontrado = false;
		for (Veiculo veiculo : veiculos) {
			if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
				veiculoEncontrado = true;

			}
		}

		if (!veiculoEncontrado) {
			System.out.println("Veículo não encontrado com a placa: " + placa);
			return;
		}

		LojaVeiculo addVeiculo = new LojaVeiculo(lojaId, placa);

		lojaVeiculos.add(addVeiculo);

		System.out.println("Veiculo adicionado a loja!");

	}

	public static void veiculosDisponiveisLoja(Scanner scan) {
		System.out.println("Informe o id da loja: ");
		int lojaId = scan.nextInt();

		for (LojaVeiculo lojaVeiculo : lojaVeiculos) {
			if (lojaVeiculo.getLojaId() == lojaId) {
				imprimirDadosCarro(lojaVeiculo.getPlaca());

			}
		}

	}

}
