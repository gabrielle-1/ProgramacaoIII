package atividade_sistema_banco;

public class Poupanca extends Conta {

        private float juros;

        public Poupanca(int numeroDaConta) {
            super(numeroDaConta);
            this.juros = (float)0.1;
        }

        public void renderJuros() {
            this.saldoConta += (this.saldoConta * this.juros);
        }


}

