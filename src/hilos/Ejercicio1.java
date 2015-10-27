package hilos;

/**
 * * @author dpazolopez **
 */
public class Ejercicio1 extends Thread{

    public Ejercicio1(String nom) {
        super(nom);
    }
    public static void main(String[] args) {

        Ejercicio1 hilo1 = new Ejercicio1("Hilo 1");
        Ejercicio1 hilo2 = new Ejercicio1("Hilo 2");
        
        //Iniciamos y movemos el hilo
        hilo1.start();
        hilo2.start();
        hilo1.run();
        hilo2.run();

       //Paramos el hilo
        hilo1.stop();
        hilo2.stop();
    }
    
    public void run() {
       
            try {
                for (int i = 0; i < 10; i++) {
                System.out.println(i + "," + getName());
                // Aquí se retrasa la ejecución un segundo y se captura la
                // posible excepción que genera el método, aunque no se hace
                // nada en el caso de que se produzca
                sleep(1000);
                }
            } catch (InterruptedException ex) {
                System.out.println("Hilo interrumpido");
            }
        }
    }

