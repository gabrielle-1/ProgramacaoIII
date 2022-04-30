package atividade_sistema_banco;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Banco banco = new Banco();
        int escolha, numeroDaConta;
        float valor;

        Scanner sc = new Scanner(System.in);

        do{
            escolha = exibirMenu();

            switch (escolha){
                case 1:{
                    System.out.println("Digite o numero da conta::");
                    numeroDaConta = sc.nextInt();
                    boolean contaCriada = banco.criarConta(numeroDaConta);

                    if(contaCriada)
                        System.out.println("Parabéns, sua conta foi criada!");
                    else
                        System.out.println("Ops... Parece que houve um erro ao criar sua conta...");
                    break;
                }

                case 2: {
                    System.out.println("Digite o numero da conta::");
                    numeroDaConta = sc.nextInt();
                    System.out.println("Digite o valor do depósito::");
                    valor = sc.nextFloat();

                    boolean depositoFeito = banco.depositar(numeroDaConta,valor);

                    if(depositoFeito)
                        System.out.println("Parabéns, seu deposito foi concluído!");
                    else
                        System.out.println("Ops... Parece que houve um erro ao realizar o depósito...");

                    break;
                }
                case 3 : {
                    System.out.println("Digite o numero da conta::");
                    numeroDaConta = sc.nextInt();
                    System.out.println("Digite o valor do saque::");
                    valor = sc.nextFloat();

                    boolean saqueFeito = banco.sacar(numeroDaConta,valor);

                    if(saqueFeito)
                        System.out.println("Parabéns, seu saque foi concluído!");
                    else
                        System.out.println("Ops... Parece que houve um erro ao realizar o saque...");

                    break;
                }

                case 4 : {
                    System.out.println("Digite o numero da conta::");
                    numeroDaConta = sc.nextInt();
                    System.out.println("Saldo::" + banco.solicitarSaldo(numeroDaConta));
                    break;
                }
            }
        }while(escolha != 5);

    }

    public static int exibirMenu() {
        System.out.println("SEJA BEM VINDO AO NOSSO SISTEMA DE BANCO.");
        System.out.println("Digite 1 para --Criar conta--");
        System.out.println("Digite 2 para --Realizar um depósito--");
        System.out.println("Digite 3 para --Realizar um saque--");
        System.out.println("Digite 4 para --Solicitar o saldo da conta--");
        System.out.println("Digite qualquer valor menor que 0 para --Sair do programa--");

        Scanner sc = new Scanner(System.in);
        int escolha = sc.nextInt();
        return escolha;

    }
}