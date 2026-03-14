public class ExemploCarro {

    public static void main(String[] args) {
        //Criar um obejto do tipo Carro
        Carro gol = new Carro();
        Carro maveric = new Carro();

        //colocar valores nos atributos do objeto
       gol.cor = "Prata";
       gol.velocidadeMaxima = 190;
       gol.ano = 2010;
       gol.automatico = true; //true (verdadeiro) e false (falso)
       gol.altura = 1.5f;
       gol.peso = 600;
       gol.modelo = "Gol Special Bola";//colocar f no final para definir que o valor é float
       gol.multa = 450.23;
       gol.marca = "VolksWagen";
       maveric.marca = "Chevrolet";
       maveric.motor = "16 canecos 2.8";


        //Exibir os valores dos atributos do objeto
        System.out.println("Modelo: " +           gol.modelo); //sout
        System.out.println("Ano: " +              gol.ano);
        System.out.println("Cor: " +              gol.cor);
        System.out.println("peso: " +             gol.peso);
        System.out.println("Altura:" +            gol.altura);
        System.out.println("Automatico :" +        gol.automatico);
        System.out.println("Velocidade Máxima :" + gol.velocidadeMaxima);
        System.out.println("O valor acumulado em multas é R$" + gol.multa);
        System.out.println("a marca do carro é: " + gol.marca);

        System.out.println("a marca do carro é: " + maveric.marca);
        System.out.println("o motor do carro é: " + maveric.motor);

        //Criar um novo objeto do tipo carro

        //Colocar valores para 2 atributos e exibir esses valores


    }
}
