package test;

import java.io.FileNotFoundException;

public class TesteCheckedExceptions {

    public static void main(String[] args){

        // ERRO Checked (o compilador verifica e da erro, precisa passar o erro para a frente ou tratar o erro com try catch
        try {
            exemploChecked();
        } catch (FileNotFoundException ex) {
            System.out.println("Exemplo de erro checked: " + ex.getMessage());
        }

        exemploUnchecked();
    }

    public static void exemploUnchecked(){

        throw new RuntimeException("Erro de compilação");
    }

    public static void exemploChecked() throws FileNotFoundException {
        throw new FileNotFoundException("File Not found!!!!!!!!");

    }


}
