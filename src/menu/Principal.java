package menu;

import java.util.Scanner;

import frente_Loja.FrenteDeLoja;
import frente_Loja.ManutencaoNoCadastro;
import operacoes.OperacoesVeiculo;

public class Principal {
	OperacoesVeiculo opVeiculos;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int opcao = 0;

		while (opcao != 3) {
			System.out.println("Bem vindo ao Gerenciador de Veículos!");
			System.out.println("Escolha a opção desejada:");

			System.out.println("1 - Frente de loja");
			System.out.println("2 - Manutenção no Cadastro");
			System.out.println("3 - Sair");

			opcao = scan.nextInt();

			switch (opcao) {
			case 1: {
				FrenteDeLoja.exibirMenu(scan);
				;
				break;
			}
			case 2: {
				ManutencaoNoCadastro.exibirMenu(scan);
				break;
			}
			case 3: {
				System.out.println("Sair");
				break;
			}
			default:
				throw new IllegalArgumentException("Opção Inválida! Tente novamente.");
			}

		}

	}

}
