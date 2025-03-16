/* 
 * Se requiere crear una cola utilizando una lista enlazada, es decir, con nodos donde cada uno
 * tendrá un elemento con la información y otro con un puntero al siguiente elemento. La
 * información de cada elemento será un número entero positivo o negativo.
 *
 */

package pkg00825_luisalonsocendra_proyecto2;

public class Nodo { //Un nodo tiene dos campos, la data y el apuntador al campo siguiente.
    int informacion; //  Datos del nodo
    Nodo siguiente; // Puntero
    
    //Constructor con argumentos
    public Nodo(int valorEdad, int valorID){
        informacion = valorEdad;
        siguiente = null;
    }
    //Constructor sin argumentos
    public Nodo(){
    }
}