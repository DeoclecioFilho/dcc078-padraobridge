package padroesestruturais;

import org.junit.jupiter.api.Test;
import padroesestruturais.bridge.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgusTest {

    @Test
    void deveRetornarPrecoArgusV10() {
        Versao versao = new V10();
        Argus argus = new Argus(30000.0f);
        argus.setVersao(versao);
        assertEquals(30000.0f,argus.calcularPreco(),0.01f);
    }

    @Test
    void deveRetornarPrecoArgusV13() {
        Versao versao = new V13();
        Argus argus = new Argus(30000.0f);
        argus.setVersao(versao);
        assertEquals(36000.0f,argus.calcularPreco(),0.01f);
    }

    @Test
    void deveRetornarPrecoArgusV15() {
        Versao versao = new V15();
        Argus argus = new Argus(30000.0f);
        argus.setVersao(versao);
        assertEquals(39000.0f,argus.calcularPreco(),0.01f);
    }
}
