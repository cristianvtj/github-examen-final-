import java.util.Scanner;
public class Main {
    public static void main(String[] args){
   Scanner cmd = new Scanner(System.in);

   String claveIngresada ="";
   String claveAlmacenada ="0000";
   boolean claveOK =false;

        //Primero muestre un mensaje solicitando la clave
        //Reciva la clave
        //Comparar con la clave almacenada
        //si la clave es correcta:  Mostrar mensaje de ok
        //Si es incorrecta nuevamente va a solicitar la clave.


       do {
           System.out.print("Digita tu clave: ");
           claveIngresada = cmd.nextLine();
           if (claveIngresada.equals(claveAlmacenada)) {

               claveOK = true;
               System.out.println("La Clave es !Correcta!");

           } else {

               claveOK = false;
               System.out.println("Clave !Errada! Ingresa Clave Nuevamente");

           }
       }while (claveOK==false);

        //sigue con su ejecucion
     
        System.out.println("Bienvenido a Restaurante el dorado =)");
//... System.out.println("cambio de menus =)");

        }

    }


