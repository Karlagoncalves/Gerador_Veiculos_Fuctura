package frente_Loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Loja;
import modelo.Veiculo;
import modelo.Venda;
import operacoes.OperacoesCliente;
import operacoes.OperacoesLoja;
import operacoes.OperacoesVeiculo;
import operacoes.OperacoesVenda;
import operacoes.OperacoesVendedor;
import pessoa.Cliente;
import pessoa.Vendedor;

public class ManutencaoNoCadastro {

	static List<Veiculo> veiculos = new ArrayList<>();
	static List<Loja> lojas = new ArrayList<>();
	static List<Vendedor> vendedores = new ArrayList<>();
	static List<Cliente> clientes = new ArrayList<>();
	static List<Venda> vendas = new ArrayList<>();


	public static void exibirMenu(Scanner scan) {

		int opcaoManutencao = 0;

		while (opcaoManutencao != 6) {
			System.out.println("Gerenciamento Manutenção de Cadastro:");

			System.out.println("1 - Gerenciar Veículo");
			System.out.println("2 - Gerenciar Loja");
			System.out.println("3 - Gerenciar Vendedor");
			System.out.println("4 - Gerenciar Cliente");
			System.out.println("5 - Gerenciar Venda");
			System.out.println("6 - Voltar para o menu anterior");

			opcaoManutencao = scan.nextInt();

			switch (opcaoManutencao) {
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

		while (opcaoVeiculos != 5) {
			System.out.println("Gerenciar Veículos:");
			System.out.println("1 - Cadastrar veículo");
			System.out.println("2 - Excluir veículo");
			System.out.println("3 - Alterar dados do veículo");
			System.out.println("4 - Associar veículo a uma loja");
			System.out.println("5 - Voltar ao menu anterior");

			opcaoVeiculos = scan.nextInt();

			switch (opcaoVeiculos) {
			case 1:
				OperacoesVeiculo.cadastrarVeiculo(scan);
				break;
			case 2:
				OperacoesVeiculo.excluirVeiculo(scan);
				break;
			case 3:
				OperacoesVeiculo.alterarDadosDoVeiculo(scan);
				break;
			case 4:
				OperacoesVeiculo.associarLoja(scan);
				break;
			case 5:
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

		while (opcaoLoja != 5) {
			System.out.println("Gerenciar Loja:");
			System.out.println("1 - Cadastrar loja");
			System.out.println("2 - Excluir loja");
			System.out.println("3 - Alterar dados da loja");
			System.out.println("4 - Associar Vendedor a uma loja");
			System.out.println("5 - Voltar ao menu anterior");

			opcaoLoja = scan.nextInt();

			switch (opcaoLoja) {
			case 1:
				OperacoesLoja.cadastrarLoja(scan);
				break;
			case 2:
				OperacoesLoja.excluirLoja(scan);
				break;
			case 3:
				OperacoesLoja.alterarDadosLoja(scan);
				break;
			case 4:
				OperacoesLoja.associarVendedor(scan);
				break;
			case 5:
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

		while (opcaoVendedor != 4) {
			System.out.println("Gerenciar Vendedor:");
			System.out.println("1 - Cadastrar vendedor");
			System.out.println("2 - Excluir vendedor");
			System.out.println("3 - Alterar dados do vendedor");
			System.out.println("4 - Voltar ao menu anterior");

			opcaoVendedor = scan.nextInt();

			switch (opcaoVendedor) {
			case 1:
				OperacoesVendedor.cadastrarVendedor(scan);
				break;
			case 2:
				OperacoesVendedor.excluirVendedor(scan);
				break;
			case 3:
				OperacoesVendedor.alterarDadosVendedor(scan);
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

	
	private static void gerenciarCliente(Scanner scan) {
		int opcaoCliente = 0;

		while (opcaoCliente != 4) {
			System.out.println("Gerenciar Cliente:");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Excluir cliente");
			System.out.println("3 - Alterar dados do cliente");
			System.out.println("4 - Voltar ao menu anterior");

			opcaoCliente = scan.nextInt();

			switch (opcaoCliente) {
			case 1:
				OperacoesCliente.cadastrarCliente(scan);
				break;
			case 2:
				OperacoesCliente.excluirCliente(scan);
				break;
			case 3:
				OperacoesCliente.alterarDadosCliente(scan);
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

	

	private static void gerenciarVenda(Scanner scan) {

		int opcaoVenda = 0;

		while (opcaoVenda != 3) {
			System.out.println("Gerenciar Venda:");
			System.out.println("1 - Cadastrar venda");
			System.out.println("2 - Excluir venda");
			System.out.println("3 - Voltar ao menu anterior");

			opcaoVenda = scan.nextInt();

			switch (opcaoVenda) {
			case 1:
				OperacoesVenda.cadastrarVenda(scan);
				break;
			case 2:
				OperacoesVenda.excluirVenda(scan);
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

	

	public static List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public static List<Loja> getLojas() {
		return lojas;
	}

	public static List<Vendedor> getVendedores() {
		return vendedores;
	}

	public static List<Cliente> getClientes() {
		return clientes;
	}

	public static List<Venda> getVendas() {
		return vendas;
	}

}
