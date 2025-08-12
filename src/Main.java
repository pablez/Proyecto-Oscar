import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);
        System.out.println("Lista de personajes");
        String personaje;
        String arma;
        String calificacion;
        String archivosjuegos = "personajes.txt";


        //Uso del While

        int contador = 1;
        String nombre;
        while (contador <= 3)
        {
            System.out.println("Como se llama tu personaje?");

            personaje = leer.nextLine().trim();
            System.out.println("Que arma usa tu personaje?");
            arma = leer.nextLine().trim();
            System.out.println("Que calificacion le das a tu personaje?");
            calificacion = leer.nextLine().trim();
            int califica = Integer.valueOf(calificacion);
            if (califica > 0 && califica <= 10)
            {
                FileWriter escritor = new FileWriter(archivosjuegos,true);
                escritor.write(personaje + " , " + arma + " , " + calificacion + "\n");
                escritor.close();

            } else if (califica <= 0)
            {
                System.out.println("Odias a este personaje o que? 'pobrecit@' ");
            } else if (califica > 10)
            {
                System.out.println("Solo podes poner la calificacion del 1 al 10, si quieres podes echarle la culpa al que me dijo que haga este limite :D ");
            }

            contador++;
        }
        System.out.println("Gracias por poner tus personajes favoritos :D ");














    }
}