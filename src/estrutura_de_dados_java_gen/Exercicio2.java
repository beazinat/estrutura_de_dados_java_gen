package estrutura_de_dados_java_gen;

import java.util.*;

public class Exercicio2 {

	public static void main(String[] args) {
		Stack<String> bookStack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        int option;

        do {
            System.out.println("*******************************************");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Finalizar o programa");
            System.out.println("*******************************************");
            System.out.print("Digite a opção desejada: ");
            option = scan.nextInt();
            scan.nextLine();
            
            switch (option) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String bookName = scan.nextLine();
                    bookStack.push(bookName);
                    System.out.println("Livro adicionado!");
                    break;
                    
                case 2:
                    if (bookStack.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        System.out.println("Lista de livros na pilha:");
                        for (String book : bookStack) {
                            System.out.println(book);
                        }
                    }
                    break;
                    
                case 3:
                    if (bookStack.isEmpty()) {
                        System.out.println("A pilha está vazia. Não há livros para retirar.");
                    } else {
                        String removedBook = bookStack.pop();
                        System.out.println("O livro \"" + removedBook + "\" foi retirado da pilha.");
                    }
                    break;
                    
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (option != 0);

        scan.close();
	}
}
