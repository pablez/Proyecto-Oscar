import javax.swing.plaf.IconUIResource;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        // 2 variables lo pongas fuera cancha pero accesible para todos
        String archivo = "usuario.txt";
        String archivoProducto = "producto.txt";

        String nombre="";
        String numero="";
        String email="";
        String password="";

        System.out.println("-----Menu Principal------");
        System.out.println("1. Registrar nueva cuenta de usuario");
        System.out.println("2. Inicio de sesion");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opcion");
        int opcion = leer.nextInt();
        switch (opcion)
        {
            case 1:
                System.out.println("----------Registro de Nuevos Usuarios---------");
                System.out.println("Ingrese su nombre");
                nombre = leer.next();
                System.out.println("Ingres su numero de celular");
                numero = leer.next();
                System.out.println("Ingrese su usuario");
                email = leer.next();
                System.out.println("Ingrese su contraseña");
                password = leer.next();

                //Codigo de Guardar datos a al txt
                FileWriter escritor = new FileWriter(archivo, true);
                // escribir o guardar los datos en el txt
                escritor.write(nombre + "," + numero + "," + email + "," + password + "\n");
                // terminar de escribir
                escritor.close();
                // Muestra de exito
                System.out.println("Usuario se registro exitosamente");
                break;

            case 2:
                System.out.println("-------Inicio de Sesion-------");
                System.out.println("Ingresar su email");
                email = leer.next();
                System.out.println("Ingresar su contraseña");
                password= leer.next();

                Scanner lectorArchivo = new Scanner(new File(archivo));
                while(lectorArchivo.hasNextLine())
                {
                    String linea = lectorArchivo.nextLine();//Andres,7895412,andres@gmail.com,andres123
                    String[] datos = linea.split(",");//[Andres][7895412][andres@gmail.com][andres123]

                    if(datos.length >= 4 && datos[2].equals(email) && datos[3].equals(password))
                    {
                        System.out.println("Inicio de sesion exitoso");
                        break;
                    }
                    else
                    {
                        System.out.println("Error de inicio de sesion");
                    }
                }

                break;

            case 3:
                break;

            default:
                System.out.println("Opcion no es correcta, Ingresar datos del menu 1-3");
        }

        // tarea de CLase #9 es crear el menu y el switch de los productos




        int precio = 0;
        String producto = "";
        boolean estado = true;// true o false {0, 1}
        int cantidad; //0123 -1-2-3
        double precio2 = 0.0; //10.5, 25.5, 13.5
        String descripcion;//abcABC123





    }
}