
package pkg00825_luisalonsocendra_proyecto2;

import javax.swing.JOptionPane;

public class JFrame extends javax.swing.JFrame {
    Cola cola = new Cola();
    int nodo_informacion = 0;
    int posicion = 0;

    public JFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        TerminarBoton = new javax.swing.JButton();
        InsertarBoton = new javax.swing.JButton();
        ExtraerBoton = new javax.swing.JButton();
        ObtenerBoton = new javax.swing.JButton();
        ColaVaciaBoton = new javax.swing.JButton();
        TamBoton = new javax.swing.JButton();
        MostrarBoton = new javax.swing.JButton();
        VaciarBoton = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TerminarBoton.setText("8. Terminar");
        TerminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarBotonActionPerformed(evt);
            }
        });

        InsertarBoton.setText("1. Insertar");
        InsertarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarBotonActionPerformed(evt);
            }
        });

        ExtraerBoton.setText("2. Extraer");
        ExtraerBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtraerBotonActionPerformed(evt);
            }
        });

        ObtenerBoton.setText("3. Obtener elemento");
        ObtenerBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObtenerBotonActionPerformed(evt);
            }
        });

        ColaVaciaBoton.setText("4. ¿Cola Vacía?");
        ColaVaciaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColaVaciaBotonActionPerformed(evt);
            }
        });

        TamBoton.setText("5. Tamaño");
        TamBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TamBotonActionPerformed(evt);
            }
        });

        MostrarBoton.setText("6. Mostrar Cola");
        MostrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarBotonActionPerformed(evt);
            }
        });

        VaciarBoton.setText("7. Vaciar Cola");
        VaciarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaciarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(InsertarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ColaVaciaBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ObtenerBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExtraerBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MostrarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TamBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VaciarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TerminarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertarBoton)
                    .addComponent(TamBoton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExtraerBoton)
                    .addComponent(MostrarBoton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ObtenerBoton)
                    .addComponent(VaciarBoton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColaVaciaBoton)
                    .addComponent(TerminarBoton))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TerminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarBotonActionPerformed
        //RÚBRICA: 8. Terminar
        
        System.exit(0);
    }//GEN-LAST:event_TerminarBotonActionPerformed

    private void VaciarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaciarBotonActionPerformed
        //RÚBRICA: 7. Vaciar la cola, es decir, eliminar todos los nodos.
        
        if(cola.isEmpty()){
            JOptionPane.showMessageDialog(null, "La cola ya está vacía.");
        } else{
            cola.Empty();
            JOptionPane.showMessageDialog(null, "La cola se ha vaciado con éxito.");
        }
    }//GEN-LAST:event_VaciarBotonActionPerformed

    private void ColaVaciaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColaVaciaBotonActionPerformed
        // RÚBRICA: 4. ¿La cola está vacía?. En esta opción solo se indica SI o NO
        
        if(cola.isEmpty()){
            JOptionPane.showMessageDialog(null, "La cola está vacía.");
        } else{
            JOptionPane.showMessageDialog(null, "La cola no está vacía.");
        }
    }//GEN-LAST:event_ColaVaciaBotonActionPerformed

    private void InsertarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarBotonActionPerformed
        //RÚBRICA: 1. Insertar elemento en la cola
        
        try{
            nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, ingrese el número entero a guardar en la cola: ")); //Input window sirve para solicitar a usuario el número a ingresar en la cola
            cola.Insert(nodo_informacion); //Insertar
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor ingresado es inválido. Por favor, ingrese un número entero.");
        }
    }//GEN-LAST:event_InsertarBotonActionPerformed

    private void ExtraerBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtraerBotonActionPerformed
        //RÚBRICA: 2. Extraer un elemento de la cola. En este caso, se muestra el número y se elimina.
        
        if(!cola.isEmpty()){
            JOptionPane.showMessageDialog(null, "Se extrajo el valor: " + cola.Extract());
        }else{
            JOptionPane.showMessageDialog(null, "La cola está vacía.\nImposible extraer un elemento.");
        }
    }//GEN-LAST:event_ExtraerBotonActionPerformed

    private void MostrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarBotonActionPerformed
        //RÚBRICA: 6. Mostrar todos los elementos de la cola. Desde el primer elemento hasta el último.
        
        if(cola.isEmpty()){
            JOptionPane.showMessageDialog(null, "La cola está vacía.");
        } else if (cola.ConfirmarGeneracion() == 1) {
            MyCanvas.main(null,cola);
        }
               
        
    }//GEN-LAST:event_MostrarBotonActionPerformed

    private void ObtenerBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObtenerBotonActionPerformed
        //RÚBRICA: 3. Obtener el elemento de la cola en la posición que indique el usuario. Se muestra su valor, sin extraerlo.

        if(cola.isEmpty()){
            JOptionPane.showMessageDialog(null, "La cola está vacía.");
        } else{
            try{
            posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, ingrese la posición de la cola que desea visualizar.\nNote que, si desea visualizar el primer elemento de la cola debe de ingresar: cero ('0').")); //Input window sirve para solicitar a usuario la posición a visualizar en la cola
            while(posicion >= cola.tam || posicion < 0){
                posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "El número ingresado no es válido.\nPorfavor, ingrese un número entero positivo válido, es decir, menor o igual a " +"("+ (cola.tam-1) + ")."));
            }
                cola.MostrarPosicion(posicion);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El valor ingresado es inválido. Por favor, ingrese un número entero no negativo.");
            }
        }

    }//GEN-LAST:event_ObtenerBotonActionPerformed

    private void TamBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TamBotonActionPerformed
        //RÚBRICA: 5. Tamaño actual de la cola. Para esto es necesario contar el número de elementos en la cola o de nodos en la lista enlazada.
        
        JOptionPane.showMessageDialog(null, "El tamaño actual de la cola es: " + cola.tam);

    }//GEN-LAST:event_TamBotonActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ColaVaciaBoton;
    private javax.swing.JButton ExtraerBoton;
    private javax.swing.JButton InsertarBoton;
    private javax.swing.JButton MostrarBoton;
    private javax.swing.JButton ObtenerBoton;
    private javax.swing.JButton TamBoton;
    private javax.swing.JButton TerminarBoton;
    private javax.swing.JButton VaciarBoton;
    private javax.swing.JFrame jFrame1;
    // End of variables declaration//GEN-END:variables
}
