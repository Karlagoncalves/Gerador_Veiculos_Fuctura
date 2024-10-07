package operacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pessoa.Vendedor;

public class OperacoesVendedor {

	static List<Vendedor> vendedores = new ArrayList<>();

	public static void cadastrarVendedor(Scanner scan) {
		System.out.println("Informe o nome do vendedor(a): ");
		String nome = scan.next();
		System.out.println("Informe o CPF do vendedor(a): ");
		String cpf = scan.next();
		System.out.println("Informe o telefone do vendedor(a): ");
		String telefone = scan.next();

		Vendedor vendedor = new Vendedor(nome, cpf, telefone);

		vendedores.add(vendedor);

		System.out.println("Vendedor(a) cadastrado(a) com sucesso!");

	}

	public static void excluirVendedor(Scanner scan) {
		System.out.println("Informe o CPF do vendedor(a) a ser excluído(a): ");
		String cpf = scan.next();

		Boolean encontrado = vendedores.removeIf(vendedor -> vendedor.getCpf().equalsIgnoreCase(cpf));

		if (encontrado) {
			System.out.println("Vendedor(a) removido com sucesso!");

		} else {
			System.out.println("Vendedor(a) com o CPF informado não encontrado(a)!");

		}

	}

	public static void alterarDadosVendedor(Scanner scan) {
		System.out.println("Informe o CPF do vendedor(a) para ser alterado os dados: ");
		String cpf = scan.next();

		Boolean encontrado = false;

		for (Vendedor vendedor : vendedores) {
			if (vendedor.getCpf().equalsIgnoreCase(cpf)) {
				System.out.println("Informe o que deseja alterar:");
				System.out.println("1 - Nome do vendedor(a)");
				System.out.println("2 - CPF do vendedor(a)");
				System.out.println("3 - Telefone do Vendedor(a)");
				int opcao = scan.nextInt();
				encontrado = true;

				switch (opcao) {
				case 1:
					System.out.println("Informe o novo nome do vendedor(a): ");
					vendedor.setNome(scan.next());
					System.out.println("Alteração realizada com sucesso!");

					break;
				case 2:
					System.out.println("Informe o CPF: ");
					vendedor.setCpf(scan.next());
					System.out.println("Alteração realizada com sucesso!");
					break;
				case 3:
					System.out.println("Informe o novo telefone: ");
					vendedor.setTelefone(scan.next());
					System.out.println("Alteração realizada com sucesso!");
					break;
				default:
					System.out.println("Opção inválida!");
					break;
				}
			}

		}

		if (!encontrado) {
			System.out.println("Vendedor(a) não encontrada!");

		}

	}

	public static void listarVendedorPorCpf(String cpf) {
		for (Vendedor vendedor : vendedores) {
			if (vendedor.getCpf().equalsIgnoreCase(cpf)) {
				System.out.print(vendedor);
			}
		}
	}
	
	public static String scanCpf(Scanner scan) {
		System.out.println("Informe o CPF do vendedor(a): ");
		String cpfVendedor = scan.next();
		return cpfVendedor;
	}

	public static void scanearCpfEImprimirVendedor(Scanner scan) {
		Vendedor vendedor = scanVendedor(scan);
		if(vendedor != null) {
			System.out.println(vendedor);
		}else{
			System.out.println("Vendedor nao encontrado!");
		}
	}

	
	public static Vendedor scanVendedor(Scanner scan) {
		String cpfVendedor = scanCpf(scan);
		for (Vendedor vendedor : vendedores) {
			if (vendedor.getCpf().equalsIgnoreCase(cpfVendedor)) {
				return vendedor;
			}
		}
		return null;
	}

	

}
