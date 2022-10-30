package padroesestruturais;

import org.junit.jupiter.api.Test;
import padroesestruturais.bridge.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CronusFlexTest {

    @Test
    void deveRetornarPrecoCronusFlexV10() {
        Versao versao = new V10();
        CronusFlex cronusFlex = new CronusFlex(50000.0f);
        cronusFlex.setVersao(versao);
        assertEquals(53000.0f,cronusFlex.calcularPreco(),0.01f);
    }

    @Test
    void deveRetornarPrecoCronusV13() {
        Versao versao = new V13();
        CronusFlex cronusFlex = new CronusFlex(50000.0f);
        cronusFlex.setVersao(versao);
        cronusFlex.setFlex(5000.0f);
        assertEquals(65000.0f,cronusFlex.calcularPreco(),0.01f);
    }

    @Test
    void deveRetornarPrecoCronusV15() {
        Versao versao = new V15();
        CronusFlex cronusFlex = new CronusFlex(50000.0f);
        cronusFlex.setVersao(versao);
        cronusFlex.setFlex(10000.0f);
        assertEquals(75000.0f,cronusFlex.calcularPreco(),0.01f);
    }
}
