package excepetions;
// criando uma exception especifica

public class SaldoInsuficienteException extends RuntimeException {

    // construtor
    public SaldoInsuficienteException (String msg){
        super(msg);

    }

}
