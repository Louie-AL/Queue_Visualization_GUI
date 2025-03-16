
package pkg00825_luisalonsocendra_proyecto2;

import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

public class Cola { //Asignaremos el comportamiento tipo Cola a nuestro Programa
    private Nodo inicio, ultimo; //Nodos iniciales y finales
    String Cola = "";
    int tam = 0;

    public Cola(){
        inicio = null;
        ultimo = null;
    }
    //Método boolean para verificar si la Cola esta vacía (return true) ó contiene elementos (return false)
    public boolean isEmpty(){
        if(inicio == null){ //Nodo inicial no deberia contener elementos si la Cola está vacía
            return true;
        }else{
            return false;
        }
    }
    
    //Método para insertar elemento en la Cola
    public void Insert(int informacion){ //RÚBRICA: La información de cada elemento será un número entero positivo o negativo
        Nodo nuevo = new Nodo(); //Objeto del tipo Nodo que almacenará info nueva
        nuevo.informacion = informacion; //Guardamos información 
        nuevo.siguiente = null; //Al ser los valores insertados los últimos en la Cola, no tienen ningun nodo siguiente
        
        if (isEmpty()){ //Si la Cola está vacía, el inicio, y por ende, último de la Cola debe ser igual a éste primer elemento insertado.
            inicio = nuevo;
            ultimo = nuevo;
        }else{ //De otra forma, el apuntador del último elemento (que siempre los inicializamos en null) contiene el valor del nuevo nodo. Y el final de la Cola es el nuevo Nodo
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
        tam++; //Aumentamos el tamaño
    }
    
    //Método para extraer de la Cola
    public int Extract(){
        if(!isEmpty()){//Si la Cola es diferente de vacía
            int informacion = inicio.informacion; //Cree una variable información 
            if(inicio == ultimo){ //
                inicio = null;
                ultimo = null;
                tam--; //Disminuimos el tamaño

            }else{
                inicio = inicio.siguiente;
                tam--; //Disminuimos el tamaño
            }
            return informacion;
        }else{
            return Integer.MAX_VALUE;
        }
        
    }    
    
    //Método para observar los elementos de la Cola
    public String MostrarPosicion_NoVoid(int posicion){
        Nodo recorrido = inicio;
        String Invertir = "";
        
        while(recorrido != null){ //Recorra hasta que el puntero sea nulo
            Cola += recorrido.informacion + " "; //Agregue la info al string
            recorrido = recorrido.siguiente; //Puntero al nodo siguiente
        }
        
        String cadena[] = Cola.split(" "); //El método split parte un String en multiples Strings usando un delimitador
        
        for(int i = cadena.length-1; i >= 0; i--){
            Invertir += " " + cadena[i];/* 
                                         * Invierta la cadena dado que empezó desde arriba en la cola. 
                                         * Entonces el primer elemento en entrar a la cola,
                                         * va a quedar en el fondo del string Cola
                                         */  
        }
        return cadena[posicion];
    }
    
    //Basado en MostrarPosicion_NoVoid
    public void MostrarPosicion(int posicion){
        Nodo recorrido = inicio;
        String Invertir = "";
        
        while(recorrido != null){
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena[] = Cola.split(" "); //El método split parte un String en multiples Strings usando un delimitador
        
        for(int i = cadena.length-1; i >= 0; i--){
            Invertir += " " + cadena[i];
        }
        
        JOptionPane.showMessageDialog(null, "El elemento en la posición " + String.valueOf(posicion) + " es " + cadena[posicion]);
        Cola = "";
    }
    //Basado en MostrarPosicion_NoVoid
    public int ConfirmarGeneracion(){
        Nodo recorrido = inicio;
        String Invertir = "";
        
        while(recorrido != null){
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena[] = Cola.split(" "); //El método split parte un String en multiples Strings usando un delimitador
        
        for(int i = cadena.length-1; i >= 0; i--){
            Invertir += " " + cadena[i];
        }
        Cola = "";
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "¿Desea avanzar con la generación de la tabla?","Warning",dialogButton);
        if(dialogResult == 0){
            return 1;
        }else {
            return 0;
        }        
    }
    
    //Devuelve el tamaño de la pila
    public int Size(){
        return tam;
    }
    
    //Vaciar pila
    public void Empty(){
        while(!isEmpty()){ //Extraiga elementos hasta que la Cola esté vacía.
            Extract();
        }
    }
    //Retorna el elemento inicial de la Cola. El @throw se dispara si la Cola está vacía.
    public int peek() {
        if (isEmpty())throw new NoSuchElementException("No hay elementos suficientes");
            return inicio.informacion;
        }
    }


