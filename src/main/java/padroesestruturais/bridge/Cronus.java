package padroesestruturais.bridge;

public class Cronus extends Modelo{

    public Cronus (float precoBase){
        super(precoBase);
    }

    @Override
    public float calcularPreco() {
        return this.precoBase * (1 + this.versao.percentualAumento());
    }
}
