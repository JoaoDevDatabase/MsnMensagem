// RESPONSAVEL POR ME DIZER LOCALIDADES DE CONEXAO DE SERVIDOR
package Server;

public enum Servidor {
EUA_1 ("us-east1", "EUA1");

private final String  codserver;
private final String localserver;

    Servidor(String codserver, String localserver) {
        this.codserver = codserver;
        this.localserver = localserver;
    }

    public String getCodserver() {
        return codserver;
    }

    public String getLocalserver() {
        return localserver;
    }
}
