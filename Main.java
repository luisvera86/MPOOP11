import hilos.HiloT;
import hilos.HiloR;
public class Main {
  public static void main(String[] args) {
    HiloT miHilo1=new HiloT("Primer Hilo");
    miHilo1.start();
    new HiloT("Segundo Hilo").start();

    new Thread(new HiloR(),"Tercer Hilo").start();
    new Thread(new HiloR(),"Cuarto Hilo").start();

    for (int i=0;i<10;i++){
      System.out.println("Iteracion "+i+"del hilo main");
    }

    System.out.println("Termina el hilo Hilo main");
  }
}