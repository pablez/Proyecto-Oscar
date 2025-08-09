import javax.swing.plaf.IconUIResource;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    private static String String;

    public static void main(String[] args) throws IOException {

        int precio = 0;
        String producto = "";
        boolean estado = true;// true o false {0, 1}
        int cantidad; //0123 -1-2-3
        double precio2 = 0.0; //10.5, 25.5, 13.5
        String descripcion;//abcABC123

        // variable de sesion
        String usuario_Original = "oscargamer";
        String password_Original = "oscar111";
        String usuario;//pablo
        String password;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su usuario");
        usuario = leer.next();//pablo
        System.out.println("Ingrese su contraseña");
        password = leer.next();

        String datos;
        System.out.println("cuenta d usuarios");

        System.out.println("registrar usuario");
        System.out.println("Inicio de sesion");
        System.out.println("Salir");
        System.out.println("Seleccione una opcion");
        String archivo;
        datos = 






        // producto
        // nombre y precio
        // 3 datos
        //
        // se crea el archivo
        String; archivo = "usuario.txt";
        // se crea nuestro ayudante
        FileWriter escritor = new FileWriter(archivo, true);
        // escribir o guardar los datos en el txt
        escritor.write(usuario + "," + password + "\n");
        // terminar de escribir
        escritor.close();
        // Muestra de exito
        System.out.println("Usuario se registro exitosamente");

        if (usuario_Original.equals(usuario) && password_Original.equals(password))//OscarGamer = pablo
        {
            System.out.println("Sesion iniciada");
        }
        else
        {
            System.out.println("Valio chetos ERROR AL INICIAR SESION");
        }

        String cosas = "productos.txt";
        FileWriter Escritor2 = new FileWriter(cosas, true);
        System.out.println("Cual es el nombre del producto" + producto);
        producto = leer.next();
        System.out.println("Cual es el precio del producto" + precio);
        precio = leer.nextInt();
        Escritor2.write(producto + "," + precio + "\n" );
        Escritor2.close();
        //
        





























        int oportunidad = 5;

        while(oportunidad >= 1)//0 >= 1
        {
            System.out.println("HOla");
            oportunidad--;//5-4-3-2-1-0
        }
        //1. inicio y limite ++
        //2. inicio y 5  ++
        //3. oportunidad y 1 --


        // investigar como guardar datos en un txt excel csv en java





































    }
}