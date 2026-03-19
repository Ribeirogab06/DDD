import java.util.Scanner;

public class ExemploEntradaDados {

    //CRIAR UM PROGRAMA PARA LER E CALCULAR A MEDIA DA FIAP
    public static void main(String[]args){

        //criar o objeto para ler o teclado
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite a note da cp 1");
        double cp1 = leitor.nextDouble();

        System.out.println("Digite a note da cp 2");
        double cp2 = leitor.nextDouble();

        System.out.println("Digite a note do challenge");
        double challenge = leitor.nextDouble();

        System.out.println("Digite a note do challenge 2");
        double challenge2 = leitor.nextDouble();

        System.out.println("Digite a note da gs");
        double gs = leitor.nextDouble();

        //calcular a media
        double mediaCp= (cp1+cp1) /2;
        double mediachellenge = (challenge2 + challenge) /2;
        double mediaFinal = mediaCp *0.2 + challenge *0.2 + gs * 0.6;
        System.out.println("Media final: " + mediaFinal);


    }
}