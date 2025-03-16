/*
 * 2. La opción 6. Mostrar todos los elementos de la cola, mostrará en pantalla la cola con
 * formas gráficas, es decir, podrá utilizar librerías que dibujan rectángulos y líneas o
 * flechas. Si se muestra usando texto, o con un objeto lista o grid, perderá los puntos
 * correspondientes según la rúbrica. El siguiente ejemplo muestra cómo se debe
 * presentar la cola (ejemplo de cola con 3 elementos).
 *
 */

package pkg00825_luisalonsocendra_proyecto2;

import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;

public class MyCanvas
{
    JLabel view = null;
    BufferedImage surface = null;

    public MyCanvas(Cola c){
        view = null;
        surface = null;
        surface = new BufferedImage(1000,1000,BufferedImage.TYPE_INT_RGB); //Java docs: TYPE_INT_RGB - Represents an image with 8-bit RGB color components packed into integer pixels.
        view = new JLabel(new ImageIcon(surface));
        
        int n = c.tam;
        Graphics g = null;
        g = surface.getGraphics();
        
        //Poner el Background
        g.setColor(Color.WHITE);
        g.fillRect(0,0,1000,1000);
        
        //Todo abajo se hará con color Negro
        g.setColor(Color.BLACK);
        
        int margen = 50;         //Espacio entre rectángulos
        int desplazador_x = 0;   //Esta variable ayudará a que se mueva a lo largo del eje x
        int desplazador_y = 400; //Esta variable ayudará a que se mueva a lo largo del eje y
        int contador = 0;        //Tendremos 5 elementos por fila en el display, el contador les lleva el rastro
        int len = 50;            //Longitud del segmento de línea
        int cabezaFlecha = 10;   //tamaño de base de la flecha
        
        while(n > 0){
            //Entre únicamente si es el quinto elemento de la fila y si la cola es mayor a 5
            if((n%5 == 0 || contador == 5)&&(c.tam == 10 && n != 10)&&(c.tam > 5)){
                
                //Se dibujan 4 segmentos de linea que pasan de una fila de elementos y apunta hacia otra
                g.drawLine(2*margen + desplazador_x,       margen + margen/2 + desplazador_y,              2 * margen + desplazador_x,         margen + margen/2 + desplazador_y - 100); //Linea recta hacia arriba
                g.drawLine(2*margen + desplazador_x,       margen + margen/2 + desplazador_y - 100,        2 * margen,                         margen + margen/2 + desplazador_y - 100); //Linea horizontal hacia la izquierda
                g.drawLine(2 * margen,                     margen + margen/2 + desplazador_y - 100,        2 * margen,                         margen + margen/2 + desplazador_y - 200); //Linea recta hacia arriba
                g.drawLine(2 * margen,                     margen + margen/2 + desplazador_y - 200,        2 * margen + len,                   margen + margen/2 + desplazador_y - 200); //Linea recta hacia la derecha 
                
                //Flechas
                int [] xs = {2 * margen + len-cabezaFlecha,                                 2 * margen + len,                               2 * margen + len-cabezaFlecha};
                int [] ys = {margen + margen/2 + desplazador_y - 200 - cabezaFlecha,        margen + margen/2 + desplazador_y - 200 ,       margen + margen/2 + desplazador_y - 200 + cabezaFlecha};
                g.drawPolygon(xs,ys,3);
                g.fillPolygon(xs,ys,3);
                
                contador = 1;
                desplazador_y -= 200;
                desplazador_x = 100*contador; //Espacio que separa las figuras

            }else if((n%5 == 0 || contador == 5)&&( n != 10)&&(c.tam > 5)){
                
                g.drawLine(2*margen + desplazador_x,       margen + margen/2 + desplazador_y,              2 * margen + desplazador_x,         margen + margen/2 + desplazador_y - 100); //Linea recta hacia arriba
                g.drawLine(2*margen + desplazador_x,       margen + margen/2 + desplazador_y - 100,        2 * margen,                         margen + margen/2 + desplazador_y - 100); //Linea horizontal hacia la izquierda
                g.drawLine(2 * margen,                     margen + margen/2 + desplazador_y - 100,        2 * margen,                         margen + margen/2 + desplazador_y - 200); //Linea recta hacia arriba
                g.drawLine(2 * margen,                     margen + margen/2 + desplazador_y - 200,        2 * margen + len,                   margen + margen/2 + desplazador_y - 200); //Linea recta hacia la derecha 
                
                //Flechas
                int [] xs = {2 * margen + len-cabezaFlecha,                                 2 * margen + len,                               2 * margen + len-cabezaFlecha};
                int [] ys = {margen + margen/2 + desplazador_y - 200 - cabezaFlecha,        margen + margen/2 + desplazador_y - 200 ,       margen + margen/2 + desplazador_y - 200 + cabezaFlecha};
                g.drawPolygon(xs,ys,3);
                g.fillPolygon(xs,ys,3);
                
                contador = 1;
                desplazador_y -= 200;
                desplazador_x = 100*contador; //Espacio que separa las figuras

            }else{
                contador++;
                desplazador_x = 100*contador; //Espacio que separa las figuras
            }
            
            //Creamos los rectángulos
            g.drawRect(margen + desplazador_x, margen + desplazador_y, margen, margen); //Se mantiene sobre el eye y, pero se mueve a un ritmo constante sobre el eje x
            
            
            if(c.tam > 5 && n%5 == 1){
            }else{
                //Dibujamos lineas conectoras entre nodos
                g.drawLine(2*margen + desplazador_x,       margen + margen/2 + desplazador_y,        2 * margen + desplazador_x + len,         margen + margen/2 + desplazador_y);
                
                //Flechas
                int [] xs = {2 * margen + desplazador_x + len-cabezaFlecha,         2 * margen + desplazador_x + len,         2 * margen + desplazador_x + len-cabezaFlecha};
                int [] ys = {margen + margen/2 - cabezaFlecha + desplazador_y,      margen + margen/2 + desplazador_y ,       margen + margen/2 + cabezaFlecha + desplazador_y};
                g.drawPolygon(xs,ys,3);
                g.fillPolygon(xs,ys,3);
            }
            //Incluimos el número
            g.drawString(c.MostrarPosicion_NoVoid(n-1), margen + desplazador_x + margen/2, margen + margen/2 + desplazador_y);
            
            //Última flecha a dibujarse es la que apunta a la palabra "Raíz"
            if(n == c.tam){
                
                g.drawLine(desplazador_x - margen,       desplazador_y + 2*margen,     margen + desplazador_x,     margen + margen/2 + desplazador_y); //Linea recta hacia arriba

                //Flechas
                int [] xs = {margen + desplazador_x-cabezaFlecha,                 margen + desplazador_x,                   margen + desplazador_x-cabezaFlecha};
                int [] ys = {margen + margen/2 + desplazador_y - cabezaFlecha,    margen + margen/2 + desplazador_y ,       margen + margen/2 + desplazador_y + cabezaFlecha};
                g.drawPolygon(xs,ys,3);
                g.fillPolygon(xs,ys,3);
                
                g.drawString("Raíz", desplazador_x - margen - 10, desplazador_y + 2*margen + 20);
            }
            
            //Decrecemos n
            n--;
        }        
        //Limpiamos
        g.clearRect(1000,1000,1000,1000);
        g.dispose();
        surface.flush();
        view.removeAll();
    }

    public static void main(String[] args, Cola c)
    {
        MyCanvas canvas = new MyCanvas(c);
        JDialog frameCanvas = new JDialog(); /* Se elige un JDialog en lugar de un segundo JFRame.
                                              * Dado que tener multiples JFrames en una misma aplicación no es una buena práctica
                                              */              
        int n = c.tam;
        int vertices = n;        
        int canvasSize = vertices * vertices; //Tamaño es dinámico
        
        frameCanvas.setSize(canvasSize, canvasSize); //tamaño
        frameCanvas.setDefaultCloseOperation(frameCanvas.DISPOSE_ON_CLOSE); //Evita que cierren ambos JFrame, sino, únicamente el de los gráficos
        frameCanvas.setContentPane(canvas.view); //Permite llenar el JFrame con el método donde están los gráficos
        frameCanvas.pack(); //Expande la vista de la ventana
        frameCanvas.setLocationByPlatform(true); //Localización dinámica
        frameCanvas.setVisible(true); //Hacer visible el JDialog
        
    }
}