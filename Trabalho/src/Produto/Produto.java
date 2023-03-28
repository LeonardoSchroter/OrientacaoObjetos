package Produto;

public class Produto {
	public int codigo;
	public String descrição;
	public float preco_custo;
	public float preço_venda;
	public int estoque;

	public Produto(int codigo, String descrição, float preco_custo, float preço_venda, int estoque) {
		this.codigo = codigo;
		this.descrição = descrição;
		this.preco_custo = preco_custo;
		this.preço_venda = preço_venda;
		this.estoque = estoque;
	}

	public void vendeProduto(int qtdItens) {
		estoque -= qtdItens;
	}

	public void baixaEstoque(int qtdItens, int valor) {
		estoque -= qtdItens;
		if (valor == 1) {
			System.out.println("O motivo da diminuicao é por roubo");
		} else if (valor == 2) {
			System.out.println("O motivo da diminuicao foi a perda ou quebra de itens");
		} else if (valor == 3) {
			System.out.println("O motivo da diminuicao foi algum outro não especificado");
		} else {
			System.out.println("Valor invalido");
		}
	}

	public int retornaEstoque() {
		
		return estoque;
	}

	public void entraEstoque(int qtdItens) {
		estoque+= qtdItens;
	}

}
