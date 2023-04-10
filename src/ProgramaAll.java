import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;


public class ProgramaAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de vezes que cada Thread deve executar: ");
        int vezes = scanner.nextInt();
        ThreadRegistro[] programa1 =  new ThreadRegistro[3];
        ThreadRegistro[] programa2 =  new ThreadRegistro[3];
        for(int i = 0; i < programa1.length; i++){
            programa1[i] = new ThreadRegistro("Programa1", "Thread" + (i + 1), vezes, i + 1, LocalDate.now(), LocalTime.now());
            programa2[i] = new ThreadRegistro("Programa2", "Thread" + (i + 1), vezes, i + 1, LocalDate.now(), LocalTime.now());
        }
        Thread progr1 = new Thread(() ->{
            for(int i = 0; i < programa1.length; i++){
                programa1[i].start();
            }
        });

        Thread progr2 = new Thread(() ->{
            for(int i = 0; i < programa2.length; i++){
                programa2[i].start();
            }
        });

        progr1.start();
        progr2.start();
    }
}
