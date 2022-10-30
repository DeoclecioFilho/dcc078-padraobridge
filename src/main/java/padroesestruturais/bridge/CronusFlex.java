package padroesestruturais.bridge;

public class CronusFlex extends Modelo{
    private float AD_FLEX = 3000;
    private float flex = AD_FLEX;

    public CronusFlex(float precoBase){
        super(precoBase);
    }

    public void setFlex(float flex) {
        this.flex = flex;
    }

    @Override
    public float calcularPreco() {
        return (this.precoBase * (1 + this.versao.percentualAumento())) + this.flex;
    }
}
