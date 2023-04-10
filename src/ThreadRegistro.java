import java.io.FileWriter;


import java.time.LocalDate;
import java.time.LocalTime;


public class ThreadRegistro extends Thread{
    private String nomePrograma, nomeThread;
    private int vezes, numeroExecucao;
    private LocalDate data;
    private LocalTime hora;


    public ThreadRegistro(String nomePrograma, String nomeThread, int vezes, int numeroExecucao, LocalDate data, LocalTime hora) {
        this.nomePrograma = nomePrograma;
        this.nomeThread = nomeThread;
        this.vezes = vezes;
        this.numeroExecucao = numeroExecucao;
        this.data = data;
        this.hora = hora;
    }


    public void run(){
        for(int i = 0; i < vezes; i++){
            try {
                FileWriter fw = new FileWriter("registro1.txt", true);
                FileWriter fw2 = new FileWriter("registro2.txt", true);
                fw.write(numeroExecucao + " " + nomePrograma + " " + nomeThread + " " + data + " " + hora + "\n");
                fw2.write(numeroExecucao + " " + nomePrograma + " " + nomeThread + " " + data + " " + hora +  "\n");
                fw.close();
                fw2.close();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }
}
