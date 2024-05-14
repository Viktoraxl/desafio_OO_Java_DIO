package funcoes_iphone;

import java.util.Random;

public interface AparelhoTelefonico {
	static void ligar() {
		System.out.println("LIGANDO...");
	}
	
	static void atender() {		
		System.out.println("ALÔ...");
	}
	
	static void iniciarCorreioVoz() {	
		System.out.println("DEIXE SUA MENSAGEM NO CORREIO DE VOZ...");
	}
}
