import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("introduzca el numero a descomponer");
        int numero =leer();
        System.out.println ("La descomposicion de "+numero+" es: ");
        int contador=contador(numero);
        int[] descompuestos= descomponer(numero,contador);
        int i;
        System.out.println("La descomposicion de "+numero+" es:");
        for (i=0;i<contador;i++){
            System.out.println(descompuestos[i]);
        }

    }

    public static int leer(){
        int entero=0;
        try {
            String stringLeido;
            BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
            stringLeido = consola.readLine();
            entero = Integer.parseInt(stringLeido);
        }
        catch (IOException ex) {
            System.out.println("Se ha producido un error" + ex);
        }
        System.out.println(entero);

        return entero;
    }

    public static int contador (int numero){
        int divisor=2;
        int contadordivisores=0;
        while(numero>= divisor){
            while(numero%divisor==0){
                numero = numero/divisor;
                contadordivisores++;
            }
            divisor++;
        }
        return contadordivisores;
    }
    public static int[] descomponer (int numero, int contador){
        int divisor=2;
        int [] descomposicion= new int[contador];
        int i=0;

        while(numero>= divisor){
            while(numero%divisor==0){
                descomposicion[i]= divisor;
                i++;
                numero = numero/divisor;

            }
            divisor++;
        }
        return descomposicion;
    }

}