package operacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pessoa.Cliente;

public class OperacoesCliente {

	static List<Cliente> clientes = new ArrayList<>();

	public static void cadastrarCliente(Scanner scan) {
		System.out.println("Informe o nome do cliente: ");
		String nome = scan.next();
		System.out.println("Informe o CPF do cliente: ");
		String cpf = scan.next();
		System.out.println("Informe o telefone do cliente: ");
		String telefone = scan.next();

		Cliente cliente = new Cliente(nome, cpf, telefone);

		clientes.add(cliente);

		System.out.println("Cliente cadastrado(a) com sucesso!");
	}

	public static void excluirCliente(Scanner scan) {
		System.out.println("Informe o CPF do cliente a ser excluído(a): ");
		String cpf = scan.next();

		Boolean encontrado = clientes.removeIf(cliente -> cliente.getCpf().equalsIgnoreCase(cpf));

		if (encontrado) {
			System.out.println("Cliente removido com sucesso!");

		} else {
			System.out.println("Cliente com o CPF informado não encontrado(a)!");

		}

	}

	public static void alterarDadosCliente(Scanner scan) {
		System.out.println("Informe o CPF do cliente para ser alterado os dados: ");
		String cpf = scan.next();

		Boolean encontrado = false;

		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equalsIgnoreCase(cpf)) {
				System.out.println("Informe o que deseja alterar:");
				System.out.println("1 - Nome do cliente");
				System.out.println("2 - CPF do cliente");
				System.out.println("3 - Telefone do cliente");
				int opcao = scan.nextInt();
				encontrado = true;

				switch (opcao) {
				case 1:
					System.out.println("Informe o novo nome do cliente: ");
					cliente.setNome(scan.next());
					System.out.println("Alteração realizada com sucesso!");

					break;
				case 2:
					System.out.println("Informe o CPF: ");
					cliente.setCpf(scan.next());
					System.out.println("Alteração realizada com sucesso!");
					break;
				case 3:
					System.out.println("Informe o novo telefone: ");
					cliente.setTelefone(scan.next());
					System.out.println("Alteração realizada com sucesso!");
					break;
				default:
					System.out.println("Opção inválida!");
					break;
				}
			}

		}

		if (!encontrado) {
			System.out.println("Cliente não encontrado!");

		}

	}

	public static String scanCpf(Scanner scan) {
		System.out.println("Informe o CPF do Cliente: ");
		String cpfCliente = scan.next();
		return cpfCliente;
	}

	public static void scanearCpfEImprimirCliente(Scanner scan) {
		Cliente cliente = scanCliente(scan);
		if (cliente != null) {
			System.out.println(cliente);
		} else {
			System.out.println("Cliente com o CPF informado não encontrado!");
		}
	}

	public static Cliente scanCliente(Scanner scan) {
		String cpfCliente = scanCpf(scan);
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equalsIgnoreCase(cpfCliente)) {
				return cliente;
			}
		}
		return null;
	}

}
