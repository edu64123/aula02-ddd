import java.util.Scanner;

public class Media {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in); //cria o scanner

                //pedir o numero
                System.out.println("digite o primeiro numero: ");
                double numero1 = scanner.nextDouble();

                //pedir o segundo numero
                System.out.println("digite o segundo numero: ");
                double numero2 = scanner.nextDouble();

                //calcular a media
                double media = (numero1 + numero2)/2;

                //mostrar o resultado
                System.out.println("a media é:" + media);

                scanner.close();//fechar a media
        }

}
