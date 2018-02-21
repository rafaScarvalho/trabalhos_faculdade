
package Apresentacao;


public class frmPrincipal extends javax.swing.JFrame
{

   
    public frmPrincipal()
    {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblPerdir1 = new javax.swing.JLabel();
        txfNumero1 = new javax.swing.JTextField();
        lblpedir2 = new javax.swing.JLabel();
        txfNumero2 = new javax.swing.JTextField();
        btmSomar = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        btmDivide = new javax.swing.JButton();
        btmSubtrai = new javax.swing.JButton();
        btmMulti = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Somar dois números ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblPerdir1.setText("Digite o primeiro numero");

        lblpedir2.setText("digite o segundo numero");

        btmSomar.setText("+");
        btmSomar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btmSomarActionPerformed(evt);
            }
        });

        lblResult.setText("Resultado:");

        btmDivide.setText("/");
        btmDivide.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btmDivideActionPerformed(evt);
            }
        });

        btmSubtrai.setText("-");
        btmSubtrai.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btmSubtraiActionPerformed(evt);
            }
        });

        btmMulti.setText("*");
        btmMulti.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btmMultiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lblResult))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btmDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPerdir1)
                                .addComponent(txfNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btmSubtrai, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpedir2)
                            .addComponent(txfNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPerdir1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblpedir2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmSubtrai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResult)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmSomarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btmSomarActionPerformed
    {//GEN-HEADEREND:event_btmSomarActionPerformed
        Double n1 = 0.0,n2 = 0.0,resul = 0.0;
        n1 = Double.parseDouble(txfNumero1.getText());
        n2 = Double.parseDouble(txfNumero2.getText());
        lblResult.setText("resultado: "+ (n1+n2));
    }//GEN-LAST:event_btmSomarActionPerformed

    private void btmDivideActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btmDivideActionPerformed
    {//GEN-HEADEREND:event_btmDivideActionPerformed
        Double n1 = 0.0,n2 = 0.0,resul = 0.0;
        n1 = Double.parseDouble(txfNumero1.getText());
        n2 = Double.parseDouble(txfNumero2.getText());
        lblResult.setText("resultado: "+ (n1/n2));
    }//GEN-LAST:event_btmDivideActionPerformed

    private void btmSubtraiActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btmSubtraiActionPerformed
    {//GEN-HEADEREND:event_btmSubtraiActionPerformed
        Double n1 = 0.0,n2 = 0.0,resul = 0.0;
        n1 = Double.parseDouble(txfNumero1.getText());
        n2 = Double.parseDouble(txfNumero2.getText());
        lblResult.setText("resultado: "+ (n1-n2));
    }//GEN-LAST:event_btmSubtraiActionPerformed

    private void btmMultiActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btmMultiActionPerformed
    {//GEN-HEADEREND:event_btmMultiActionPerformed
        Double n1 = 0.0,n2 = 0.0,resul = 0.0;
        n1 = Double.parseDouble(txfNumero1.getText());
        n2 = Double.parseDouble(txfNumero2.getText());
        lblResult.setText("resultado: "+ (n1*n2));
    }//GEN-LAST:event_btmMultiActionPerformed

    
    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmDivide;
    private javax.swing.JButton btmMulti;
    private javax.swing.JButton btmSomar;
    private javax.swing.JButton btmSubtrai;
    private javax.swing.JLabel lblPerdir1;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblpedir2;
    private javax.swing.JTextField txfNumero1;
    private javax.swing.JTextField txfNumero2;
    // End of variables declaration//GEN-END:variables
}
