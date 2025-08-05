import javax.swing.plaf.IconUIResource;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        // 2 variables lo pongas fuera cancha pero accesible para todos
        String archivoUsuario = "usuario.txt";
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


                FileWriter escritor = new FileWriter(archivoUsuario, true);
                escritor.write(nombre + "," + numero + "," + email + "," + password + "\n");
                escritor.close();
                System.out.println("Usuario se registro exitosamente");

                break;

            case 2:
                System.out.println("-------Inicio de Sesion-------");
                System.out.println("Ingresar su email");
                email = leer.next();
                System.out.println("Ingresar su contraseña");
                password= leer.next();

                //Scanner leer2 = new Scanner(System.in);

                Scanner lectorArchivo = new Scanner(new File(archivoUsuario));//archivoUsuario.txt
                if(!lectorArchivo.hasNextLine())//falso
                {
                    System.out.println("No hay usuarios en la base de datos");
                }
                while(lectorArchivo.hasNextLine())//verdad
                {
                    String linea = lectorArchivo.nextLine();//"Andres,7895412,andres@gmail.com,andres123"
                    String[] datos = linea.split(",");//[Andres][7895412][andres@gmail.com][andres123]
                                                    //array      [0]      [1]        [2]             [3]
                                                    //length      1        2          3               4
                    if(datos.length >= 4 && datos[2].equals(email) && datos[3].equals(password))
                    {
                        System.out.println("Inicio de sesion exitoso");
                        System.out.println("------------Menu de Productos------------");
                        System.out.println("1. Ver Produtos");
                        System.out.println("2. Agregar Productos");
                        System.out.println("3. Cerrar sesion");
                        int opcion2 = leer.nextInt();
                        switch (opcion2)
                        {
                            case 1:
                                System.out.println("-------Lista de Productos------");
                                File lectorArchivo2 = new  File(archivoProducto);
                                if(!lectorArchivo2.exists())
                                {
                                    System.out.println("No hay productos para ver :(");
                                }else{
                                    File archivoProductos = new File(archivoProducto);
                                    Scanner lectorArchivo3 = new Scanner(archivoProductos);
                                    while(lectorArchivo3.hasNextLine())
                                    {
                                        String linea2 = lectorArchivo3.nextLine();
                                        String[] datosProductos = linea.split(",");
                                        if(datosProductos.length == 4)
                                        {
                                            System.out.println("Nombre: "+datosProductos[0]);
                                            System.out.println("Precio: "+datosProductos[1]);
                                            System.out.println("Cantidad: "+datosProductos[2]);
                                            System.out.println("Descripción: "+datosProductos[3]);
                                        }
                                    }
                                }

                                break;
                            case 2:
                                //agregar o guardar los productos
                                // nombre, precio, cantidad y descripcicon
                                break;
                            case 3:
                                break;
                        }
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

        // tarea de CLase #9 es crear el menu y el switch de los productos y datos de entrada y salida y guardar datos al txt




        int precio = 0;
        String producto = "";
        boolean estado = true;// true o false {0, 1}
        int cantidad; //0123 -1-2-3
        double precio2 = 0.0; //10.5, 25.5, 13.5
        String descripcion;//abcABC123





    }
}