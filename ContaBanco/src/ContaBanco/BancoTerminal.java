package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class BancoTerminal {

		public static void main(String[] args) {
		
		    //TODO:Conhecer e importar a classe Scanner
            //Exibir as mensagens para o nosso usúario
			//Obter pela scanner os valores digitados no terminal
			//Exibir a mensagem conta criada
			
	        //Scanner scanner = new scanner(System.in).useLocale(Locale.US);
		
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
			
			System.out.println("Digite seu nome");
			String nome = scanner.next();
			
			System.out.println("Digite seu dobrenome");
			String sobrenome = scanner.next();
			
			System.out.println("Por favor, digite o número da Agência");
			int agencia	 = scanner.nextInt();

			System.out.println("Por favor, digite o número da Conta");
			String conta = scanner.next();

			
				//imprimindo os dados pelo usuario
			System.out.println("Olá " + nome + " " + sobrenome + "!");
			System.out.println("Sua Agência é: " + agencia);
			System.out.println("Conta: " + conta);
			System.out.println("Seu Saldo: " + 237.48  + " Já está disponivel para saque.");
			System.out.println("Conta Criada ");
			
		}
	}

