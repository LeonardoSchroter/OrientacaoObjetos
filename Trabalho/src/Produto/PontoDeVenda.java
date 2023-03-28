package Produto;

import java.util.Scanner;

public class PontoDeVenda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int codigo, estoque,qtd;
		float precoVenda, precoCusto;
		String descricao;
		int op;
		Produto p;

		System.out.println("Qual a descricao do seu produto?");
		descricao = scan.nextLine();

		System.out.println("Qual o codigo do seu produto?");
		codigo = scan.nextInt();
		scan.nextLine();

		System.out.println("Qual o estoque do seu produto?");
		estoque = scan.nextInt();
		scan.nextLine();

		System.out.println("Qual o preco de custo do seu produto?");
		precoCusto = scan.nextFloat();
		scan.nextLine();

		System.out.println("Qual o preco de venda do seu produto?");
		precoVenda = scan.nextInt();
		scan.nextLine();
		
		p = new Produto(codigo,descricao,precoCusto,precoVenda,estoque);

		System.out.println("BEM VINDO AO SISTEMA DE CONTROLE DE ESTOQUE");
		System.out.println("----------------------------");
		do {
			System.out.println(
					"1 - Venda do produto\n2 - Entra estoque\n3 - Baixa estoque\n4 - Retorna estoque\n0 - Sair");
			op = scan.nextInt();
			scan.nextLine();
			switch (op) {
			case 1:
				System.out.println("quantos produtos foram vendidos?");
				p.vendeProduto(scan.nextInt());
				scan.nextLine();
				break;
				
			case 2:
				System.out.println("Quantos produtos entraram no seu estoque?");
				p.entraEstoque(scan.nextInt());
				break;
				
			case 3:
				System.out.println("Em quantos itens foi reduzido o estoque e qual o codigo do motivo?");
				qtd = scan.nextInt();
				scan.nextLine();
				p.baixaEstoque(qtd,scan.nextInt());
				scan.nextLine();
				break;
				
			case 4: 
				System.out.println("Seu estoque atual eh: "+p.retornaEstoque()+" produtos");
				break;
				
			default:
				break;
			}
			
			

		} while (op != 0);

	}

}
