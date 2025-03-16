
package pkg00825_luisalonsocendra_proyecto2;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                    JFrame frame = new JFrame();
                    frame.setSize(500, 400);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
            }
        });
    }
    
}
