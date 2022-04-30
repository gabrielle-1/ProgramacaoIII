package atividade_sistema_banco;

public class ContaPG extends Conta {

    private float saldo;

    public ContaPG(int numeroDaConta){
        super(numeroDaConta);
    }

    @Override
    public boolean depositar(float valor, int numero){
        this.saldo += valor;
        //if(){
            //return true;
        //}else{
            //return false;
       // }
        return false;
    }
}
