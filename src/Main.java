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

        String usuario_Original = "OscarGamer";
        String password_Original = "oscar111";

        String usuario ;
        String password;
        //OscarGamer
        //oscar111

        //tienes que hacer datos de entrada y salida
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su usuario");
        usuario = leer.next();//pablo
        System.out.println("Ingrese su contraseña");
        password = leer.next();
        /**
         * ==
         * !=
         * >
         * <
         * >=
         * <=
         *
         */
        if (usuario_Original.equals(usuario))//OscarGamer = pablo
        {
            System.out.println("Sesion iniciada");
        }
        if (usuario != usuario)
        {
            System.out.println("Valio chetos ppodgfpokkfdpogfd");
        }


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