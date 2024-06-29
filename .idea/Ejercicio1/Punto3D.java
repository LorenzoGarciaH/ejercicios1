package EJERCICIO1;

/*Escribe un programa que cree una clase para representar un
objeto punto en tres dimensiones. Proporcionar un constructor que inicialice
los valores del punto al origen de coordenadas y otro que permita especificar
las coordenadas del punto. Sobrescribe su método toString() para que
muestre información sobre los puntos. Usa la clase en un programa donde
crees objetos que representen los puntos (12, 13, 18) y (8, 14, 0) y los
muestres por consola.*/
public class Punto3D {

    int cordX, cordY, cordZ;

    public Punto3D(){
        cordX=0;
        cordY=0;
        cordZ=0;
    }
    public Punto3D(int cordX, int cordY, int cordZ) {
        this.cordX = cordX;
        this.cordY = cordY;
        this.cordZ = cordZ;
    }
@Override
    public String toString(){
        return "("+ cordX +", "+ cordY +", "+ cordZ +")";
}

}