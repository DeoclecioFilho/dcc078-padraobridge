package padroesestruturais.bridge;

public class Argus extends Modelo{
    public Argus(float precoBase) {
        super(precoBase);
    }


    public float calcularPreco() {
        return this.precoBase * (1 + this.versao.percentualAumento());
    }
}
