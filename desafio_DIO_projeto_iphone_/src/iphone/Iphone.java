package iphone;

import java.util.Random;

import funcoes_iphone.AparelhoTelefonico;
import funcoes_iphone.NavegadorInternet;
import funcoes_iphone.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	
	@Override
	public void tocar() {
		System.out.println("TOCANDO A MÚSICA...");
	}

	@Override
	public void pausar() {
		System.out.println("MÚSICA PAUSADA.");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO A MUSICA...");
	}

	@Override
	public void exibirPagina(String pagina) {
		System.out.println("EXIBINDO PÁGINA:"+pagina);		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("NOVA ABA ADICIONADA.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO A PÁGINA...");
	}
}
