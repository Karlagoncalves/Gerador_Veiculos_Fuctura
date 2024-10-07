package frente_Loja;

import java.util.Scanner;

import operacoes.OperacoesCliente;
import operacoes.OperacoesLoja;
import operacoes.OperacoesVeiculo;
import operacoes.OperacoesVenda;
import operacoes.OperacoesVendedor;

public class FrenteDeLoja {

	public static void exibirMenu(Scanner scan) {

		int opcaoFrente = 0;

		while (opcaoFrente != 6) {
			System.out.println("Gerenciamento da Frente de loja:");

			System.out.println("1 - Gerenciar Veículo");
			System.out.println("2 - Gerenciar Loja");
			System.out.println("3 - Gerenciar Vendedor");
			System.out.println("4 - Gerenciar Cliente");
			System.out.println("5 - Gerenciar Venda");
			System.out.println("6 - Voltar para o menu anterior");

			opcaoFrente = scan.nextInt();

			switch (opcaoFrente) {
			case 1:
				gerenciarVeiculos(scan);
				break;
			case 2:
				gerenciarLoja(scan);
				break;
			case 3:
				gerenciarVendedor(scan);
			case 4:
				gerenciarCliente(scan);
				break;
			case 5:
				gerenciarVenda(scan);
				break;
			case 6:
				System.out.println("Voltando ao menu principal...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente!");
				break;
			}

		}
	}

	private static void gerenciarVeiculos(Scanner scan) {
		int opcaoVeiculos = 0;

		while (opcaoVeiculos != 2) {
			System.out.println("Gerenciar Veículos:");
			System.out.println("1 - Consultar Veículos por Placa");
			System.out.println("2 - Voltar ao menu anterior");

			opcaoVeiculos = scan.nextInt();

			switch (opcaoVeiculos) {
			case 1:
				OperacoesVeiculo.scanearPlacaEImprimir(scan);
				break;
			case 2:
				System.out.println("Voltando ao menu anterior...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente!");
				break;
			}

		}
	}

	private static void gerenciarLoja(Scanner scan) {

		int opcaoLoja = 0;
		while (opcaoLoja != 4) {
			System.out.println("Gerenciar Loja:");
			System.out.println("1 - Listar todas as Lojas");
			System.out.println("2 - Listar Veículos disponíveis em uma loja");
			System.out.println("3 - Listar Vendedores de uma loja");
			System.out.println("4 - Voltar ao menu anterior");
			

			opcaoLoja = scan.nextInt();

			switch (opcaoLoja) {
			case 1:
				OperacoesLoja.listarTodasLojas();
				break;
			case 2:
				OperacoesVeiculo.veiculosDisponiveisLoja(scan);
				break;
			case 3:
				OperacoesLoja.listarVendedoresLoja(scan);
				break;
			case 4:
				System.out.println("Voltando ao menu anterior...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente!");
				break;
			}

		}

	}

	private static void gerenciarVendedor(Scanner scan) {

		int opcaoVendedor = 0;
		while (opcaoVendedor != 2) {
			System.out.println("Gerenciar Vendedor:");
			System.out.println("1 - Consultar Vendedor por Nome");
			System.out.println("2 - Voltar ao menu anterior");

			opcaoVendedor = scan.nextInt();

			switch (opcaoVendedor) {
			case 1:
				OperacoesVendedor.scanearCpfEImprimirVendedor(scan);
				break;
			case 2:
				System.out.println("Voltando ao menu anterior...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente!");
				break;
			}

		}

	}

	private static void gerenciarCliente(Scanner scan) {

		int opcaoCliente = 0;
		while (opcaoCliente != 3) {
			System.out.println("Gerenciar Cliente:");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Consultar Cliente por CPF");
			System.out.println("3 - Voltar ao menu anterior");

			opcaoCliente = scan.nextInt();

			switch (opcaoCliente) {
			case 1:
				OperacoesCliente.cadastrarCliente(scan);
				break;
			case 2:
				OperacoesCliente.scanearCpfEImprimirCliente(scan);
				break;
				case 3:
				System.out.println("Voltando ao menu anterior...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente!");
				break;
			}

		}

	}

	private static void gerenciarVenda(Scanner scan) {

		int opcaoVenda = 0;
		while (opcaoVenda != 2) {
			System.out.println("Gerenciar Venda:");
			System.out.println("1 - Cadastrar Venda");
			System.out.println("2 - Voltar ao menu anterior");

			opcaoVenda = scan.nextInt();

			switch (opcaoVenda) {
			case 1:
				OperacoesVenda.cadastrarVenda(scan);
				break;
			case 2:
				System.out.println("Voltando ao menu anterior...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente!");
				break;
			}

		}

	}

}
