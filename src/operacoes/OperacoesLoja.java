package operacoes;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Loja;
import modelo.LojaVendedor;
import pessoa.Vendedor;

public class OperacoesLoja {

	static ArrayList<Loja> lojas = new ArrayList<Loja>();
	static ArrayList<LojaVendedor> vendedoresLoja = new ArrayList<LojaVendedor>();

	public static boolean verificarLoja(int id) {
		for (Loja loja : lojas) {
			if (loja.getId() == id) {
				return true;
			}
		}
		return false;
	}

	public static void cadastrarLoja(Scanner scan) {
		System.out.println("Informe o id da loja: ");
		int id = scan.nextInt();

		System.out.println("Informe o nome da loja: ");
		String nome = scan.next();
		System.out.println("Informe o endereço da loja: ");
		String endereco = scan.next();
		System.out.println("Informe o telefone da loja: ");
		String telefone = scan.next();

		Loja loja = new Loja(id, nome, endereco, telefone);

		lojas.add(loja);

		System.out.println("Loja cadastrada com sucesso!");

	}

	public static void excluirLoja(Scanner scan) {
		System.out.println("Informe o nome da loja a ser excluída: ");
		String nome = scan.next();

		Boolean encontrado = lojas.removeIf(loja -> loja.getNome().equalsIgnoreCase(nome));

		if (encontrado) {
			System.out.println("Vendedor(a) removido com sucesso!");

		} else {
			System.out.println("Vendedor(a) com o CPF informado não encontrado(a)!");

		}
	}

	public static void alterarDadosLoja(Scanner scan) {
		System.out.println("Informe o nome da loja para ser alterado os dados: ");
		String nome = scan.next();

		Boolean encontrado = false;

		for (Loja loja : lojas) {
			if (loja.getNome().equalsIgnoreCase(nome)) {
				System.out.println("Informe o que deseja alterar:");
				System.out.println("1 - Nome da loja");
				System.out.println("2 - Endereço da loja");
				System.out.println("3 - Telefone da loja");
				int opcao = scan.nextInt();
				encontrado = true;

				switch (opcao) {
				case 1:
					System.out.println("Informe o novo nome da loja: ");
					loja.setNome(scan.next());
					System.out.println("Alteração realizada com sucesso!");

					break;
				case 2:
					System.out.println("Informe o novo endereço: ");
					loja.setEndereco(scan.next());
					System.out.println("Alteração realizada com sucesso!");
					break;
				case 3:
					System.out.println("Informe o novo telefone: ");
					loja.setTelefone(scan.next());
					System.out.println("Alteração realizada com sucesso!");
					break;
				default:
					System.out.println("Opção inválida!");
					break;
				}
			}

		}

		if (!encontrado) {
			System.out.println("Loja não encontrada!");

		}

	}

	public static void listarTodasLojas() {
		for (Loja lojas : lojas) {
			System.out.print(lojas);
		}
	}

	public static void listarVendedoresLoja(Scanner scan) {
		System.out.println("Informe o id da loja: ");
		int lojaId = scan.nextInt();

		for (LojaVendedor lojaVendedor : vendedoresLoja) {
			if (lojaVendedor.getLojaId() == lojaId) {
				OperacoesVendedor.listarVendedorPorCpf(lojaVendedor.getCpf());

			}
		}

	}

	public static void associarVendedor(Scanner scan) {
		System.out.println("Informe o ID da loja que deseja associar o vendedor(a): ");
		int lojaId = scan.nextInt();

		boolean existeLoja = verificarLoja(lojaId);

		if (!existeLoja) {
			System.out.println("Loja não encontrado");
			return;
		}

		Vendedor vendedor = OperacoesVendedor.scanVendedor(scan);

		if (vendedor == null) {
			System.out.println("Vendedor(a) não encontrado!");
			return;
		}

		LojaVendedor addVendedor = new LojaVendedor(lojaId, vendedor.getCpf());

		vendedoresLoja.add(addVendedor);

		System.out.println("Vendedor adicionado a loja!");
	}
}
