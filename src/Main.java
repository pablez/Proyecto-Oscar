import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo de Pablo");

        int precio = 0;
        String producto;
        boolean estado = true;// true o false {0, 1}
        int cantidad; //0123 -1-2-3
        double precio2 = 0.0; //10.5, 25.5, 13.5
        String descripcion;//abcABC123

        Scanner leer = new Scanner(System.in);
        /*

        while(inicio <= limite)//1 <= 5
        {
            int numeroMisterioso = 12;
            int numero;
            System.out.println("Ingrese el numero");
            numero = leer.nextInt();
            if(numeroMisterioso == numero)//12 = 12
            {
                System.out.println("Exito encontraste el numero misterioso");
                break;
            }
            else
            {
                inicio++;//1 2 3
                System.out.println("No encontraste el numero misterios");
            }
            System.out.println("numero de intento N°: " + inicio);
        }
        */































        String usuario_Original = "oscargamer";
        String password_Original = "oscar111";
        String usuario;//pablo
        String password;

        int oportunidad = 5;

        while(oportunidad >= 1)//0 >= 1
        {
            System.out.println("HOla");
            oportunidad--;//5-4-3-2-1-0
        }
        //1. inicio y limite ++
        //2. inicio y 5  ++
        //3. oportunidad y 1 --

        // ejercicio 3. 100
        // 100 es par
        // 99  es impar
        // 98 es par
        // ...


        int galletas = 100;
        while (galletas 100 >= 1);

        System.out.println(15%2);
        if(15%2 == 0)
        {
            System.out.println("Es par");
        }else
        {
            System.out.println("Es impar");
        }
galletas--;




















        System.out.println("Ingrese su usuario");
        usuario = leer.next().toLowerCase();//pablo
        System.out.println("Ingrese su contraseña");
        password = leer.next().toLowerCase();
        /**
         * ==
         * !=
         * >
         * <
         * >=
         * <=
         *
         */
        if (usuario_Original.equals(usuario) && password_Original.equals(password))//OscarGamer = pablo
        {
            System.out.println("Sesion iniciada");
        }
        else
        {
            System.out.println("Valio chetos ERROR AL INICIAR SESION");
        }
        // aumentar al datos de entrada OSCARGamer igual al oscargamer
        // aplicar el tolowercase en lodos los datos de entrada


        System.out.println("Mi usuario es: "+ usuario + " Mi contraseña es: "+password);
        //Seguridad
        System.out.println("Como se llamara el producto? ");
        producto = leer.next();
        System.out.println("Cual es el precio del producto??");
        precio = leer.nextInt();
        System.out.println("En que estado se encuentra el producto?");
        estado = leer.nextBoolean();
        System.out.println("Cuantos productos hay?");
        cantidad = leer.nextInt();
        System.out.println("Descripcion del producto");
        descripcion = leer.next();










    }
}