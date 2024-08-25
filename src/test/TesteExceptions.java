package test;

import model.Cliente;
import model.Conta;

public class TesteExceptions {


    // TRATAMENTO DE EXCESSÕES
    public static void main(String[] args) {

        //Try: Coloca o código que pode causar um erro.

        // Catch: Captura o erro se ele ocorrer e permite que você lide com ele,
        // evitando que o programa quebre
        try{
            int resultado = 5/2;
            System.out.println(resultado);

            Cliente icaro = new Cliente("ícaro","188");
            Conta conta = new Conta(icaro,123,10001);

            conta.depositar(1000);
            System.out.println("O saldo da minha conta é: " + conta.getSaldo());

            conta.sacar(10001);
            System.out.println(conta.getSaldo());

            // Lançando excepetions forçadamente
            ArithmeticException arithmeticException = new ArithmeticException("Deu erro");
            throw arithmeticException;

            // outra forma de lançar excepetion
           //  throw new NullPointerException("Outro erro");

                                 // | = OU
        }catch (ArithmeticException | NullPointerException ex){
            System.out.println("O motivo do erro foi: " + ex.getMessage());

        }finally {
            System.out.println("Este bloco sempre sera executado, idependente se der erro ou não no try-catch");

        }
    }
}
