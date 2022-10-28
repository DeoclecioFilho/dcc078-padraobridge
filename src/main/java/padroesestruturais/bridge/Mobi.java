package padroesestruturais.bridge;

public class Mobi  extends Modelo{


    public Mobi(float precoBase) {
        super(precoBase);
    }

    @Override
    public float calcularPreco() {
        return this.precoBase * (1 + this.versao.percentualAumento());
    }
}
