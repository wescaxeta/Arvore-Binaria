import java.util.Scanner;

class ArvoreBinariaApp {
  public static void main(String[] args) {
    Scanner le = new Scanner(System.in);
    Tree arv = new Tree();
    int opcao;
    long telefone;
    String nome;
    System.out.print("\n Programa Arvore binaria de Pessoas");
    do {
        System.out.print("\n***********************************");
        System.out.print("\nEntre com a opcao:");
	System.out.print("\n ----1: Inserir");
	System.out.print("\n ----2: Excluir");
	System.out.print("\n ----3: Pesquisar");
	System.out.print("\n ----4: Exibir");
	System.out.print("\n ----5: Sair do programa");
	System.out.print("\n***********************************");
	System.out.print("\n-> ");
	opcao = le.nextInt();
	le.nextLine();
	switch(opcao) {
	 	case 1: {
	 		   System.out.print("\n Informe o nome: ");
	 		   nome = le.nextLine();
		       System.out.print("\n Informe o telefone: ");
		       telefone = le.nextLong();
		       arv.inserir(new Pessoa(nome, telefone));
		       break;
		}
		case 2: {
			   System.out.print("\n Informe o nome: ");
	 		   nome = le.nextLine();
		       if ( !arv.remover(nome) )
                          System.out.print("\n Pessoa n�o encontrada!");;
		       break;
		}
		case 3: {
			   System.out.print("\n Informe o nome: ");
	 		   nome = le.nextLine();
	      	       if( arv.buscar(nome) != null )
		          System.out.print("\n Valor Encontrado");
		       else 
		          System.out.print("\n Valor nao encontrado!");
		       break;
		}	 
		case 4: {
		      arv.caminhar();
		      break; 
		}
        } // fim switch
    } while(opcao != 5);

  }
}