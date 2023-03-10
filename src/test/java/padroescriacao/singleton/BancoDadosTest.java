package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoDadosTest {

    @Test
    public void deveRetornarUsuarioBD() {
        BancoDados.getInstance().setUsuarioBD("SYSDBA");
        assertEquals("SYSDBA", BancoDados.getInstance().getUsuarioBD());
    }

    @Test
    public void deveRetornarPortaBD() {
        BancoDados.getInstance().setPortaBD("3306");
        assertEquals("3306", BancoDados.getInstance().getPortaBD());
    }

}