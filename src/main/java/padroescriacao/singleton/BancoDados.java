package padroescriacao.singleton;

public class BancoDados {

    private BancoDados() {};
    private static BancoDados instance = new BancoDados();
    public static BancoDados getInstance() {
        return instance;
    }

    private String usuarioBD;
    private String portaBD;

    public String getUsuarioBD() {
        return usuarioBD;
    }

    public void setUsuarioBD(String usuarioBD) {
        this.usuarioBD = usuarioBD;
    }

    public String getPortaBD() {
        return portaBD;
    }

    public void setPortaBD(String portaBD) {
        this.portaBD = portaBD;
    }
}
