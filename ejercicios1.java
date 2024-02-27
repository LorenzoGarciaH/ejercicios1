public class ejercicios1 {
    /*(5 minutos) Escribir un programa que defina variables que
    representen el número de días de un año, el número de horas que tiene un día,
    el número de minutos que tiene una hora y el número de segundos que tiene un minuto.
    Emplear las variables que ocupen el mínimo espacio de memoria posible.
    A continuación, calcular el número de segundos que tiene un año y almacenar el
    valor del cálculo en otra variable. Realizar preferiblemente mediante una función que
    reciba como parámetros el número de años, meses y días y devuelva el número de segundos de los días,
     meses y años introducidos.
     */
    public static void main(String[] args) {
        int dias = 365;
        int horas = 24;
        int minutos = 60;
        int segundos = 60;
        int sec_horas = segundos*minutos*horas;
        int sec_dias = segundos*minutos*horas*dias;

        static void prt(String s){
            System.out.println(s);
        }
        }
    }
}
