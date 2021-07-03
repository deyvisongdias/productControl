package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Product> lista = new ArrayList<>();

		int pdt = 0;

		while (pdt >= 1 || pdt <= 4) {
			System.out.println("Adicionar produto (1)");
			System.out.println("Vender produto (2)");
			System.out.println("Remover um produto(3)");
			System.out.println("Imprimir lista de produtos(4)");
			System.out.println("Fechar sistema(5)");
			pdt = sc.nextInt();
			if (pdt == 1) {
				System.out.println("Digite o nome do produto :");
				String nome = sc.next();
				System.out.println("Digite o preco :");
				Double preco = sc.nextDouble();
				System.out.println("Digite a quantidade :");
				int qtd = sc.nextInt();

				Product produto = new Product(nome, preco, qtd);
				lista.add(produto);
			}
			if (pdt == 2) {
				System.out.println("Digite o nome do produto :");
				for (Product product : lista) {
					System.out.println(product.toString());
				}
				String nome = sc.next();
				for (Product product : lista) {
					if (product.getName() == nome) {
						System.out.println("Digite a quantidade :");
						int qtd = sc.nextInt();
						int quantidade = product.getQuantidade() + qtd;
						product.setQuantidade(quantidade);
					} else {
						System.out.println("Produto invalido");
						break;
					}
				}
			}
			if (pdt == 3) {
				System.out.println("Digite o nome do produto da lista para removelo :");
				for (Product product : lista) {
					System.out.println(product.toString());
				}
				String nome = sc.next();
				for (Product product : lista) {
					if (nome == product.getName()) {
						lista.remove(product);
					}
				}

			}
			
			if(pdt==4)
			{
				for (Product product : lista) {
					System.out.println(product.toString());
				}
			}
			

		}

		sc.close();

	}

}
