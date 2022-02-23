package conversor;
import java.util.Scanner;

    public class principal {
    Scanner input =  new Scanner(System.in);
    public static void main(String[] args){
        double Pes, Milhas ,Polegadas ;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade polegadas: ");
        Polegadas = Integer.parseInt(input.nextLine());
        conversao.polegadasEmCentimetros(Polegadas);

        System.out.print("Digite a quantidade de Pes: ");
        Pes = Integer.parseInt(input.nextLine());
        conversao.pesParaCentimetros(Pes);

        System.out.print("Digite a quantidade de milhas: ");
        Milhas = Integer.parseInt(input.nextLine());
        conversao.milhasParaQuilometros(Milhas);

        //double resultadopes = conversao.pesParaCentimetros(Pes);
        //double resultadomilhas = conversao.milhasParaquilometros(milhas);
        // double resultadopolegadas = conversao.pesParaCentimetros(polegadas);
    }

}
