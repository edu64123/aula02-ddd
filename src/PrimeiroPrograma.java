import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        //leitura de dados - partel
        Scanner leitor = new Scanner(System.in);
        int idade, qtdfilho;
        boolean casado;
        String nome;
        System.out.println("digite seu nome: ");
        nome = leitor.nextLine();
        System.out.println("digite sua idade: ");
        idade = leitor.nextInt();
        System.out.println("bem vindo(a) " + nome);

    }
}
