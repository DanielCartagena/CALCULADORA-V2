
package calculadora;

public class NewJFrame extends javax.swing.JFrame {
    
    private boolean punto=true;
    String valor1,valor2,contenido,signo;
    Double resultado,iba=0.19;
    
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtm = new javax.swing.JTextField();
        bt7 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        btmos = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        btsen = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bttan = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btigual = new javax.swing.JButton();
        btiva = new javax.swing.JButton();
        btx = new javax.swing.JButton();
        btraiz = new javax.swing.JButton();
        btsuma = new javax.swing.JButton();
        btpunto = new javax.swing.JButton();
        btdes = new javax.swing.JButton();
        btdiv = new javax.swing.JButton();
        btelev = new javax.swing.JButton();
        btresta = new javax.swing.JButton();
        btborrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bt7.setText("7");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt4.setText("4");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        jButton3.setText("cos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        bt1.setText("1");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        btmos.setText("+/-");
        btmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmosActionPerformed(evt);
            }
        });

        bt8.setText("8");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt5.setText("5");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        btsen.setText("sen");
        btsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsenActionPerformed(evt);
            }
        });

        bt2.setText("2");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt0.setText("0");
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });

        bt9.setText("9");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        bt6.setText("6");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bttan.setText("tan");
        bttan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttanActionPerformed(evt);
            }
        });

        bt3.setText("3");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        btigual.setText("=");
        btigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btigualActionPerformed(evt);
            }
        });

        btiva.setText("IVA");
        btiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btivaActionPerformed(evt);
            }
        });

        btx.setText("x");
        btx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxActionPerformed(evt);
            }
        });

        btraiz.setText("raiz");
        btraiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btraizActionPerformed(evt);
            }
        });

        btsuma.setText("+");
        btsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsumaActionPerformed(evt);
            }
        });

        btpunto.setText(".");
        btpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpuntoActionPerformed(evt);
            }
        });

        btdes.setText("<--");
        btdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdesActionPerformed(evt);
            }
        });

        btdiv.setText("/");
        btdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdivActionPerformed(evt);
            }
        });

        btelev.setText("^");
        btelev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btelevActionPerformed(evt);
            }
        });

        btresta.setText("-");
        btresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrestaActionPerformed(evt);
            }
        });

        btborrar.setText("c");
        btborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btborrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtm)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btmos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(bt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btsen, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(bt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bt9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(btpunto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btiva, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addComponent(btraiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btigual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(btsuma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btdiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btdes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btelev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtm, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btmos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btsen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btraiz, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btiva, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btx, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btigual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btelev, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btdes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btresta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
      
        txtm.setText(txtm.getText()+"0");
    }//GEN-LAST:event_bt0ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        txtm.setText(txtm.getText()+"1");        // TODO add your handling code here:
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        txtm.setText(txtm.getText()+"2");        // TODO add your handling code here:
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        txtm.setText(txtm.getText()+"3");        // TODO add your handling code here:
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        txtm.setText(txtm.getText()+"4");        // TODO add your handling code here:
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        txtm.setText(txtm.getText()+"5");        // TODO add your handling code here:
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        txtm.setText(txtm.getText()+"6");        // TODO add your handling code here:
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        txtm.setText(txtm.getText()+"7");        // TODO add your handling code here:
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        txtm.setText(txtm.getText()+"8");        // TODO add your handling code here:
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        txtm.setText(txtm.getText()+"9");        // TODO add your handling code here:
    }//GEN-LAST:event_bt9ActionPerformed

    private void btborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btborrarActionPerformed
        txtm.setText("");
valor1="";
valor2="";// TODO add your handling code here:
    }//GEN-LAST:event_btborrarActionPerformed

    private void btpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpuntoActionPerformed
contenido=txtm.getText();
if(contenido.length()<=0){
    txtm.setText("0.");
}else
    if(txtm.getText().contains(".")){
        
    }else
        txtm.setText(txtm.getText()+".");
punto=false;
    }//GEN-LAST:event_btpuntoActionPerformed
public static String operaciones(String valor1, String valor2,String signo)
{
          Double resultadocalc=0.0;
          String respuesta;
          if(signo.equals("+")){
              resultadocalc=Double.parseDouble(valor1)+Double.parseDouble(valor2);
          }else if(signo.equals("-")){
              resultadocalc=Double.parseDouble(valor1)-Double.parseDouble(valor2);
          }else if(signo.equals("*")){
              resultadocalc=Double.parseDouble(valor1)*Double.parseDouble(valor2);
          }else if(signo.equals("/")){
              resultadocalc=Double.parseDouble(valor1)/Double.parseDouble(valor2);
          }else if(signo.equals("^")){
              resultadocalc=Math.pow(Double.parseDouble(valor1), Double.parseDouble(valor2));
          }
          respuesta=resultadocalc.toString();
          return respuesta;
}
    private void btmosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmosActionPerformed
contenido=txtm.getText();
    if(contenido.length()>0){
     resultado = (-1)*Double.parseDouble(contenido);
     txtm.setText(resultado.toString());
     }      
    }//GEN-LAST:event_btmosActionPerformed

    private void btsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsumaActionPerformed
        if(!txtm.getText().equals("")){
            valor1=txtm.getText();
            signo="+";
            txtm.setText("");
        }
    }//GEN-LAST:event_btsumaActionPerformed

    private void btrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrestaActionPerformed
        if(!txtm.getText().equals("")){
            valor1=txtm.getText();
            signo="-";
            txtm.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btrestaActionPerformed

    private void btxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxActionPerformed
        if(!txtm.getText().equals("")){
            valor1=txtm.getText();
            signo="*";
            txtm.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btxActionPerformed

    private void btdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdivActionPerformed
        if(!txtm.getText().equals("")){
            valor1=txtm.getText();
            signo="/";
            txtm.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btdivActionPerformed

    private void btivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btivaActionPerformed
        String resultadoiva;
        if(!txtm.getText().equals("")){
            valor1=txtm.getText();
          resultadoiva=Double.toString((Double.parseDouble(valor1))*(iba));
            txtm.setText(resultadoiva);
        } 
    }//GEN-LAST:event_btivaActionPerformed

    private void btelevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btelevActionPerformed
        if(!txtm.getText().equals("")){
            valor1=txtm.getText();
            signo="^";
            txtm.setText("");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_btelevActionPerformed

    private void btigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btigualActionPerformed
    String resultadototal;
    valor2=txtm.getText();
    if(!valor2.equals("")){
        resultadototal=operaciones(valor1,valor2,signo);
        txtm.setText(resultadototal);
    }
    }//GEN-LAST:event_btigualActionPerformed

    private void btdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdesActionPerformed
contenido=txtm.getText();
if(contenido.length()>0){
    contenido=contenido.substring(0,contenido.length()-1);
    txtm.setText(contenido);

}
    }//GEN-LAST:event_btdesActionPerformed

    private void btraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btraizActionPerformed
contenido=txtm.getText();
if(contenido.length()>0){
resultado=Math.sqrt(Double.parseDouble(contenido));
txtm.setText(resultado.toString());
}
    }//GEN-LAST:event_btraizActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
contenido=txtm.getText();
int aux;
aux=Integer.parseInt(contenido);
if(contenido.length()>0){
    contenido=Double.toString(Math.toRadians(Double.parseDouble(contenido)));
    resultado=Math.cos(Double.parseDouble(contenido));
    if(aux==90){
    resultado=0.0;
    }
   
    txtm.setText(resultado.toString());
    
}


    }//GEN-LAST:event_jButton3ActionPerformed

    private void btsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsenActionPerformed
contenido=txtm.getText();
    if(contenido.length()>0){
    contenido=Double.toString(Math.toRadians(Double.parseDouble(contenido)));
    resultado=Math.sin(Double.parseDouble(contenido));
    txtm.setText(resultado.toString()); 
    }// TODO add your handling code here:
    }//GEN-LAST:event_btsenActionPerformed

    private void bttanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttanActionPerformed
contenido=txtm.getText();
if(contenido.length()>0){
    contenido=Double.toString(Math.toRadians(Double.parseDouble(contenido)));
    resultado=Math.tan(Double.parseDouble(contenido));
    txtm.setText(resultado.toString());        // TODO add your handling code here:
    }//GEN-LAST:event_bttanActionPerformed
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btborrar;
    private javax.swing.JButton btdes;
    private javax.swing.JButton btdiv;
    private javax.swing.JButton btelev;
    private javax.swing.JButton btigual;
    private javax.swing.JButton btiva;
    private javax.swing.JButton btmos;
    private javax.swing.JButton btpunto;
    private javax.swing.JButton btraiz;
    private javax.swing.JButton btresta;
    private javax.swing.JButton btsen;
    private javax.swing.JButton btsuma;
    private javax.swing.JButton bttan;
    private javax.swing.JButton btx;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField txtm;
    // End of variables declaration//GEN-END:variables
}
