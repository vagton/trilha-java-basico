package br.com.iphone.model;

import br.com.iphone.interfaces.AparelhoTelefonico;
import br.com.iphone.interfaces.NavegadorInternet;
import br.com.iphone.interfaces.ReprodutorMusical;
import java.util.ArrayList;
import java.util.List;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private double tamanhoTela;
    private String resolucaoTela;
    private String sistemaOperacional;
    private double versaoOS;
    private boolean wifiHabilitado;
    private boolean bluetoothHabilitado;
    private List<String> appsInstalados;

    public IPhone() {
        this.modelo = "iPhone 2007";
        this.tamanhoTela = 3.5;
        this.resolucaoTela = "320x480";
        this.sistemaOperacional = "iPhone OS 1";
        this.versaoOS = 1.0;
        this.wifiHabilitado = true;
        this.bluetoothHabilitado = true;
        this.appsInstalados = new ArrayList<>();
        appsInstalados.add("Safari");
        appsInstalados.add("Mail");
        appsInstalados.add("Fotos");
        appsInstalados.add("YouTube");
        appsInstalados.add("Mapas");
        appsInstalados.add("Calendário");
        appsInstalados.add("Contatos");
        appsInstalados.add("Notas");
        appsInstalados.add("Calculadora");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Telefone");
    }

    @Override
    public void desligar() {
        System.out.println("Desligar Telefone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void chamar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public void exibirFotos() {
        System.out.println("Exibindo fotos...");
    }

    public void tirarFoto() {
        System.out.println("Tirando foto...");
    }

    public void visualizarEmail() {
        System.out.println("Visualizando email...");
    }

    public void acessarMapa() {
        System.out.println("Acessando mapas...");
    }

    // Implementação do método toString para exibir todos os dados do telefone
    @Override
    public String toString() {
        return "IPhone {" +
               "\n  Modelo: '" + modelo + '\'' +
               "\n  Tamanho da Tela: " + tamanhoTela + " polegadas" +
               "\n  Resolução da Tela: '" + resolucaoTela + '\'' +
               "\n  Sistema Operacional: '" + sistemaOperacional + '\'' +
               "\n  Versão do OS: " + versaoOS +
               "\n  WiFi Habilitado: " + (wifiHabilitado ? "Sim" : "Não") +
               "\n  Bluetooth Habilitado: " + (bluetoothHabilitado ? "Sim" : "Não") +
               "\n  Aplicativos Instalados: " + appsInstalados +
               "\n}";
    }
}
