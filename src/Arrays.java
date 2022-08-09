public class Arrays {
    public static void main(String[] args) {

        // "cambio desde interfaz web"
        // segundo ejercicio a la rama main
        int lista[] = {10, 9, -8, 3, 3, 100};

         /*  for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        */

      /* for(int i=lista.length-1;i>=0;i--){
           System.out.println(lista[i]);

       }*/
//calcular el numero mayor

        int nMayor=lista[0];

        for(int i=1;i<lista.length;i++){
            nMayor=lista[i];

        }
        System.out.println(nMayor);


    }



}
