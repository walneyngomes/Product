package udemyQuestoes;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		// Intancia a nao pesistência de produto
		Product produto = new Product("Pipoca Karitó");
		// Addiciona a quantidade de produtos
		produto.setQuantidadeEstoque(2000);
		// Addiciona valor
		produto.setValor(1.00);

		System.err.println(" Quantidade Atual=  " + produto.getQuantidadeEstoque() + "  Valor = " + produto.getValor()
				+ "  Nome=   " + produto.getName() + "ValorTotalEstoque" + produto.valorTotalEstoque());
		System.out.println("Quantos comprar ?");

		Scanner teclado = new Scanner(System.in);
		int valor = teclado.nextInt();
		produto.removeQuantidade(valor);
		System.err.println(" Quantidade Atual=  " + produto.getQuantidadeEstoque() + "  Valor = " + produto.getValor()
				+ "Nome=" + produto.getName() + " ValorTotalEstoque = " + produto.valorTotalEstoque());

		teclado.close();
	}

}
