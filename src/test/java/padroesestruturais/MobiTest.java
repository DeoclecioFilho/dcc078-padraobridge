package padroesestruturais;

import org.junit.jupiter.api.Test;
import padroesestruturais.bridge.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MobiTest {

    @Test
    void deveRetornarPrecoMobiV10() {
        Versao versao = new V10();
        Mobi mobi = new Mobi(80000.0f);
        mobi.setVersao(versao);
        assertEquals(80000.0f,mobi.calcularPreco(),0.01f);
    }

    @Test
    void deveRetornarPrecoMobiV13() {
        Versao versao = new V13();
        Mobi mobi = new Mobi(80000.0f);
        mobi.setVersao(versao);
        assertEquals(96000.0f,mobi.calcularPreco(),0.01f);
    }

    @Test
    void deveRetornarPrecoMobiV15() {
        Versao versao = new V15();
        Mobi mobi = new Mobi(80000.0f);
        mobi.setVersao(versao);
        assertEquals(104000.0f,mobi.calcularPreco(),0.01f);
    }
}
