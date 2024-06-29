import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio8 {

    public static void main(String[] args) {

        System.out.println("Introduzca numeros, para salir, introduzca el numero 0");
        int [] numeros=leer();
        double lamedia=media(numeros);
        System.out.println("la media es: "+lamedia);
        int max= maximo(numeros);
        System.out.println("El numero mas grande es"+max);
        int min= minimo(numeros);
        System.out.println("El numero mas pequeño es"+min);
    }
    public static int[] leer() {

        int[] numeros = new int[200];
        int numero, contador = 0;
        int i = 1;
        try {
            String stringLeido;
            BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
            do {
                stringLeido = consola.readLine();
                numero = Integer.parseInt(stringLeido);
                numeros[i] = numero;
                i++;
                contador++;
            }
            while (numero != 0);
        }
            catch (IOException ex) {
                System.out.println("Se ha producido un error" + ex);
            }
        numeros[0] = contador-1;
        return numeros;
    }

        public static double media(int [] numeros){
        int suma=0;
        double lamedia;

         for (int i=1;i<= numeros[0]; i++){
             suma=suma+numeros[i];
         }
         lamedia=(double)suma/ (double) numeros[0];

         return lamedia;
    }

    public static int maximo(int[]numeros){
        int max=0;
        for (int i=1;i<=numeros[0];i++){
            if (numeros[i]>max){
                max=numeros[i];
            }
        }
        return max;
    }
    public static int minimo(int[]numeros) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= numeros[0]; i++) {
            if (numeros[i] <min) {
                min = numeros[i];
            }
        }
        return min;
    }
}