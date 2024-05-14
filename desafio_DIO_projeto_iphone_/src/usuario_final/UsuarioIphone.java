package usuario_final;
import java.util.Random;
import java.util.Scanner;

import funcoes_iphone.AparelhoTelefonico;
import iphone.Iphone;

public class UsuarioIphone {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		boolean tocandoMusica = false;
		boolean tocarTelefone;
		
		System.out.println("O que deseja fazer?"
				+ "\n1 - Tocar uma música"
				+ "\n2 - Pausar uma música"
				+ "\n3 - Selecionar uma música"
				+ "\n4 - Ligar para alguém"
				+ "\n5 - Telefone está tocando?"
				+ "\n6 - Exibir Página da Internet"
				+ "\n7 - Adicionar Nova Aba"
				+ "\n8 - Atualizar Página"
				+ "\n0 - Desligar");
		int opcao = scan.nextInt();
		
		switch (opcao) {
		case 1: 
			iphone.tocar();
			tocandoMusica = true;
			break;
		case 2:
			if(tocandoMusica = false) {
				System.out.println("Não há nenhuma música tocando");
				break;
			}else {
				iphone.pausar();
				break;
			}
		case 3:
			iphone.selecionarMusica();
			break;
		case 4:
			 AparelhoTelefonico.ligar();
			 break;
		case 5:
			tocarTelefone = random.nextBoolean();
			 if(tocarTelefone) {				 
				 System.out.println("Deseja atender a ligação? (s/n)");
	             scan.nextLine(); 
	             String resposta = scan.nextLine();
	             if (resposta.equalsIgnoreCase("s")) {
	                 AparelhoTelefonico.atender();
	                 break;
	             } else {
	                 AparelhoTelefonico.iniciarCorreioVoz();
	                 break;
	             }
			 }else {
				 System.out.println("VOCÊ NÃO ATENDEU");
				 break;
			 }
		case 6:
			System.out.println("Digite a página da internet que deseja exibir:");
			String pagina = scan.nextLine();
			iphone.exibirPagina(pagina);
			break;
		case 7:
			iphone.adicionarNovaAba();
			break;
		case 8:
			iphone.atualizarPagina();
			break;
		case 0:
			System.out.println("Bye bye...");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcao);
		}
	}
}
