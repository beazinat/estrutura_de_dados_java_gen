package estrutura_de_dados_java_gen;

import java.util.*;

public class Exercicio1 {

	public static void main(String[] args) {
		Queue<String> clientsQueue = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		int option;

		do {
			System.out.println("*******************************************");
			System.out.println("1: Adicionar um novo Cliente na fila");
			System.out.println("2: Listar todos os Clientes na fila");
			System.out.println("3: Chamar (retirar) uma pessoa da fila");
			System.out.println("0: Finalizar o programa");
			System.out.println("*******************************************");
			System.out.print("Digite a opção desejada: ");
			option = scan.nextInt();
			scan.nextLine();

			switch (option) {
			case 1:
				System.out.print("Digite o nome: ");
				String clientName = scan.nextLine();
				clientsQueue.add(clientName);
				System.out.println("Cliente adicionado!");
				break;

			case 2:
				if (clientsQueue.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Lista de clientes na fila: ");
					for (String client : clientsQueue) {
						System.out.println(client);
					}
				}
				break;
			case 3:
				if (clientsQueue.isEmpty()) {
					System.out.println("A fila já está vazia.");
				} else {
					String calledClient = clientsQueue.poll();
					System.out.println("O cliente foi chamado!");
					System.out.println("\n Fila atualizada: ");
					for (String client : clientsQueue) {
						System.out.println(client);
					}
				}
				break;
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}
		} while (option != 0);
		scan.close();
	}
}
