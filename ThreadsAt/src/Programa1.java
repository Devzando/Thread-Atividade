import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Programa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de vezes que cada Thread deve executar: ");
        int vezes = scanner.nextInt();
        ThreadRegistro[] programa1 =  new ThreadRegistro[3];
        for(int i = 0; i < programa1.length; i++){
            programa1[i] = new ThreadRegistro("Programa1", "Thread" + (i + 1), vezes, i + 1, LocalDate.now(), LocalTime.now());
            programa1[i].start();
        }

    }
}
