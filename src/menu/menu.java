package menu;
import java.util.InputMismatchException;
import model.*;
import produto.controller.ProdutoController;
import java.util.Scanner;
import model.Acessorios;

public class menu {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
	
		ProdutoController produto= new ProdutoController();
		Scanner leia = new Scanner (System.in);	
		
		int opcao, id;
		String nomeProduto, Tipo, material;
		float valor;
		
		Acessorios a1= new Acessorios (1, "Jóia Gana",60.0f,"Brinco","Prata" );
		a1.visualizar();
		
		Acessorios a2= new Acessorios (2, "Jóia Congo",160.0f,"Brinco","Ouro" );
		a2.visualizar();
		
		Acessorios a3= new Acessorios (3, "Adorno Senegal",300.0f,"Colar","Prata" );
		a3.visualizar();
		
		Acessorios a4= new Acessorios (4, "Adorno Mali",500.0f,"Colar","Ouro" );
		a4.visualizar();
		
		while (true) {
			
		
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Camila's Store                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar novo Produto               ");
			System.out.println("            2 - Ver todos os Produtos                ");
			System.out.println("            3 - Buscar Produto por Numero            ");
			System.out.println("            4 - Atualizar Dados do Produto           ");
			System.out.println("            5 - Apagar Produto                        ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite a ");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 0) {
				System.out.println("\n\nCamila's Store agradece o seu acesso!");
				sobre();
				leia.close();
				System.exit(0);
			}
			System.out.println("Cadastrar novo Produto\n\n");
			switch (opcao) {
			case 1:
				
				
				System.out.println("Digite o nome do Produto: ");
				leia.nextLine();
				nomeProduto = leia.nextLine();

				System.out.println("\nDigite o tipo do Produto: ");
				Tipo = leia.nextLine();

				System.out.print("\nDigite o valor do produto: ");
				valor = leia.nextFloat();
				leia.nextLine();

				System.out.println("\nDigite o material do produto:  ");
				material = leia.nextLine();

				produto.cadastrar(new Acessorios(produto.gerarNumero(),nomeProduto, valor, Tipo, material));
				
				
				break;
			
			case 2:
				System.out.println("Ver todos os produtos ");
				
				
				break;
				
			case 3:
				System.out.println( "Buscar produto por número\n\n");
				
				break;
				
			case 4:
				System.out.println( "Atualizar dados do Produto\n\n");
				
				break;
				
			case 5:
				System.out.println("Apagar Produto\n\n");
				
				break;
			
				default:
					System.out.println("Opção inválida!");
					break;
		}

	}
		
	}
		

		public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por: ");
			System.out.println("Camila Andrade - camila.rda@outlook.com");
			System.out.println("https://github.com/camilarandrade/");
			System.out.println("*********************************************************");
		}
}