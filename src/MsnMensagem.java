import Conexao.Conexao;
import EnviarMensagem.EnviarMensagem;
import Server.Servidor;
import TelaApk.TelaApk;

public class MsnMensagem {
    public static void main (String[] args){
        EnviarMensagem e = new EnviarMensagem();
        TelaApk tela = new TelaApk();
        Conexao c = new Conexao();


       System.out.println("\n");
        for(Servidor s: Servidor.values()){
          System.out.println(s.getCodserver() + " - " + s.getLocalserver());
        }
        c.CheckServer();
        c.CheckConexao();
        tela.TelaAplicativo();
        System.out.println("\n");
        e.MensagemEnviada();
        System.out.println("\n");
        c.CheckConexao();
        System.out.println("\n");
        e.MensagemRecebida();




    }
}
