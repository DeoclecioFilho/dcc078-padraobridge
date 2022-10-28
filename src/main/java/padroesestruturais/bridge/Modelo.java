package padroesestruturais.bridge;


    public abstract class Modelo {

        protected Versao versao;

        protected float precoBase;


        public Modelo(float precoBase) {
            this.precoBase = precoBase;
        }

        public void setVersao(Versao versao) {
            this.versao = versao;

        }

        public void setPrecoBase(float precoBase) {
            this.precoBase = precoBase;

        }

        public abstract float calcularPreco();
    }
