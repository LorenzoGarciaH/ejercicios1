/*(20 minutos) Empleando un array, escribir un programa que pida al usuario
números enteros hasta que se introduzca el número 0. A continuación,
calcular la media, el mínimo y el máximo de los datos introducidos. Utilice
funciones independientes para:
a) recibir N números enteros por teclado hasta que el usuario introduzca un
0. Al finalizar la función, podemos copiar los valores a un array de longitud
N que coincida exactamente con la cantidad de números introducidos.
b) Calcule la media de los elementos de un array.
c) calcule el mínimo de los elementos de un array.
d) Calcule el máximo de los elementos de un array*/

package T1;

public class Ejercicios {
    public static void main(String[] args) {
         int nuevaEntrada = 0;
    
    }
    public static void recibirNumeros(){
        boolean entradaValida = true;

    do {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        nuevaEntrada = br.readLine();
            try {
                nuevaEntrada= Integer.parseInt(nuevaEntradaString);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Introduce un numero entero.");
                entradaValida  = false;
            }
         } while (!entradaValida);

    }
}