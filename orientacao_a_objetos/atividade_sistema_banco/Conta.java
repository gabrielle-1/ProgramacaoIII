package atividade_sistema_banco;

public class Conta {
    protected int numeroConta;
    protected float saldoConta;

    public Conta(int numeroDaConta){
        if(numeroDaConta != 0)
            this.numeroConta = numeroDaConta;
        this.saldoConta = 0f;
    }

    public int getNumeroDaConta() {
        return this.numeroConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroConta = numeroDaConta;
    }

    public float getSaldo() {
        return this.saldoConta;
    }

    public void setSaldo(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean depositar(float valor, int numeroDaConta) {
        if(valor > 0) {
            this.saldoConta += valor;
            return true;
        }else {
            System.out.println("Não é possível fazer o saque.");
            return false;
        }
    }

    public boolean sacar(float valor) {
        if(valor <= this.saldoConta) {
            this.saldoConta -= valor;
            return true;
        }else {
            System.out.print("Você não possui saldo suficiente.");
            return false;
        }
    }

    public void renderJuros() {
        this.saldoConta += (this.saldoConta * 0.01);
    }

}
