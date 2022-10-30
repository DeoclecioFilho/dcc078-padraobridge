package padroesestruturais;

import org.junit.jupiter.api.Test;
import padroesestruturais.bridge.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CronusTest {

    @Test
    void deveRetornarPrecoCronusV10() {
        Versao versao = new V10();
        Cronus cronus = new Cronus(50000.0f);
        cronus.setVersao(versao);
        assertEquals(50000.0f,cronus.calcularPreco(),0.01f);
    }

    @Test
    void deveRetornarPrecoCronusV13() {
        Versao versao = new V13();
        Cronus cronus = new Cronus(50000.0f);
        cronus.setVersao(versao);
        assertEquals(60000.0f,cronus.calcularPreco(),0.01f);
    }

    @Test
    void deveRetornarPrecoCronusV15() {
        Versao versao = new V15();
        Cronus cronus = new Cronus(50000.0f);
        cronus.setVersao(versao);
        assertEquals(65000.0f,cronus.calcularPreco(),0.01f);
    }
}
