package atividade_sistema_banco;

public class Banco {

    private Conta conta;

    public boolean criarConta(int numero){

        if(numero != 0){

            Conta contaNova = new Conta(numero);
            this.conta = contaNova;
            if(this.conta != null)
                return true;
            else
                return false;
        }else{
            return false;
        }
    }

    public boolean depositar(int numero, float valor) {
            if(this.conta.getNumeroDaConta() == numero) {
                if(this.conta.depositar(valor, numero)){
                    return true;
                }else{
                    return false;
                }
            }else {
                System.out.println("Essa conta não existe no nosso banco.");
                return false;
            }
    }

    public boolean sacar(int numero, float valor){
        if(this.conta.getNumeroDaConta() == numero) {
            boolean saqueFeito = this.conta.sacar(valor);
            if(saqueFeito){
                return true;
            }else{
                return false;
            }
        }else {
            System.out.println("Essa conta não existe no nosso banco.");
            return false;
        }
    }

    public float solicitarSaldo(int numeroDaConta){
        if(this.conta.getNumeroDaConta() == numeroDaConta) {
            return this.conta.getSaldo();
        }else{
            System.out.println("Essa conta não existe no nosso banco.");
            return 0;
        }
    }

}
