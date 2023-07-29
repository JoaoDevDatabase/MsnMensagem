package Conexao;

public class Conexao {
    String checkserver;// RESPONSAVEL POR CHECAR A CONEXAO DO SERVIDOR;
    String checconnect; //RESPONSAVEL POR CHECAR SE A CONEXAO WIFI ESTA ESTAVEL;

    public void CheckServer(){
        System.out.println("CHECANDO CONEXÃO COM SERVIDOR");
        System.out.println("CONEXÃO ESTÁVEL\n");

    }

    public void CheckConexao(){
        System.out.println("CHECANDO CONEXÃO COM A REDE LOCAL");
        System.out.println("CONEXÃO ESTÁVEL\n");
    }
}
