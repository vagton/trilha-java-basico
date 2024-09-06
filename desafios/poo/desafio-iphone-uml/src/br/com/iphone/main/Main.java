package br.com.iphone.main;

import br.com.iphone.model.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        // Descrição do telefone
        System.out.println("Informações do iPhone:\n" + meuIPhone.toString());

        
        // Usando funcionalidades do telefone
        meuIPhone.ligar();
        meuIPhone.chamar("21988833333");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Usando funcionalidades do reprodutor musical
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Legião Urbana");

        // Usando funcionalidades do navegador
        meuIPhone.exibirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();

        // Usando outras funcionalidades
        meuIPhone.exibirFotos();
        meuIPhone.tirarFoto();
        meuIPhone.visualizarEmail();
        meuIPhone.acessarMapa();

        // Desligar o aparelho
        meuIPhone.desligar();
    }
}

