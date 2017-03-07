/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modo_grafico_formulario;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author C.andres
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
         ImageIcon fondo = new ImageIcon("src/paisaje.png");
         Icon icono = new ImageIcon(fondo.getImage());
//        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(lblfondo2.getWidth(), lblfondo2.getHeight(), Image.SCALE_DEFAULT));
        lblfondo2.setIcon(icono);
        this.repaint();
        //this.setResizable(false);
        
         Letra(txt_Nom);
        Letra(txt_Nom2);
        Letra(txt_Apll);
        Letra(txt_Apll2);
      
        
        Num(txt_doc);
        Num(txt_tel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Boton_verde = new javax.swing.JButton();
        Boton_amarillo = new javax.swing.JButton();
        Boton_rojo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_Nom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Nom2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Apll = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Apll2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_tel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Dir = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        tdoc = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_doc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        generoM = new javax.swing.JRadioButton();
        generoF = new javax.swing.JRadioButton();
        generoOtro = new javax.swing.JRadioButton();
        checkDepor = new javax.swing.JCheckBox();
        checkLectura = new javax.swing.JCheckBox();
        checkMusica = new javax.swing.JCheckBox();
        checkOtro = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ta_comentario = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        lblfondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ace.png"))); // NOI18N
        Boton_verde.setText("Confirmar");
        Boton_verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_verdeActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, -1, -1));

        Boton_amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siguiente.png"))); // NOI18N
        Boton_amarillo.setText("Siguiente");
        getContentPane().add(Boton_amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, -1, -1));

        Boton_rojo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Boton_rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/can.png"))); // NOI18N
        Boton_rojo.setText("Cancelar");
        Boton_rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_rojoActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 680, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("DATOS A INGRESAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        txt_Nom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 191, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setText("Segundo nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        txt_Nom2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_Nom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nom2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Nom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 192, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setText("Primer apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        txt_Apll.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_Apll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApllActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Apll, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 192, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel4.setText("Segundo apellido:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        txt_Apll2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Apll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 192, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel5.setText("Numero de telefono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        txt_tel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 192, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel6.setText("Direccion:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        txt_Dir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 192, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel7.setText("Email:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        txt_email.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 192, -1));

        tdoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "C.C.", "T.I.", "C.E." }));
        tdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdocActionPerformed(evt);
            }
        });
        getContentPane().add(tdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 63, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel8.setText("Tipo de documento:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 180, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel9.setText("Numero de documento:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        txt_doc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 121, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel10.setText("Genero:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel14.setText("Comentarios:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, -1, -1));

        buttonGroup1.add(generoM);
        generoM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        generoM.setText("Masculino");
        generoM.setOpaque(false);
        generoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoMActionPerformed(evt);
            }
        });
        getContentPane().add(generoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        buttonGroup1.add(generoF);
        generoF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        generoF.setText("Femenino");
        generoF.setOpaque(false);
        generoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoFActionPerformed(evt);
            }
        });
        getContentPane().add(generoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));

        buttonGroup1.add(generoOtro);
        generoOtro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        generoOtro.setText("Otro");
        generoOtro.setOpaque(false);
        getContentPane().add(generoOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, -1, -1));

        checkDepor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkDepor.setText("Deportes");
        checkDepor.setOpaque(false);
        checkDepor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDeporActionPerformed(evt);
            }
        });
        getContentPane().add(checkDepor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        checkLectura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkLectura.setText("Lectura");
        checkLectura.setOpaque(false);
        checkLectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLecturaActionPerformed(evt);
            }
        });
        getContentPane().add(checkLectura, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        checkMusica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkMusica.setText("Musica");
        checkMusica.setOpaque(false);
        getContentPane().add(checkMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, -1, -1));

        checkOtro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkOtro.setText("Otros");
        checkOtro.setOpaque(false);
        checkOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOtroActionPerformed(evt);
            }
        });
        getContentPane().add(checkOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel15.setText("Hobbies:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        Ta_comentario.setColumns(20);
        Ta_comentario.setRows(5);
        jScrollPane1.setViewportView(Ta_comentario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 230, 100));

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel11.setText("Primer nombre:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lblfondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paisaje.png"))); // NOI18N
        lblfondo2.setMinimumSize(new java.awt.Dimension(530, 750));
        getContentPane().add(lblfondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Nom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nom2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nom2ActionPerformed

    private void txt_ApllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ApllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApllActionPerformed

    private void generoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoMActionPerformed

    private void generoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoFActionPerformed

    private void checkDeporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDeporActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkDeporActionPerformed

    private void checkOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkOtroActionPerformed

    private void checkLecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLecturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkLecturaActionPerformed

    private void Boton_verdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_verdeActionPerformed
         int val1=0, val2=0, val3=0, val4=0;
        if(evt.getSource()== Boton_verde){
            captura();
            
        //Aqui instancia la  ventana nueva
            // Form_Dat_Reg fdr = new Form_Dat_Reg();
          //   Registro rg = new Registro();
            
            ValidaText(txt_Nom);
            validaemail(txt_email);
            ValidaText(txt_Apll);
            ValidaText(txt_doc);
            ValidaGen(buttonGroup1);
            ValidaHobbie(checkLectura );
            ValidaHobbie(checkDepor );
            ValidaHobbie(checkMusica);
            ValidaHobbie(checkOtro);
            
          if (ValidaText(txt_Nom)==true && ValidaText(txt_Apll)==true && ValidaText(txt_doc)==true){
            val1=1;
            
            }else{
                JOptionPane.showMessageDialog(null,"Verifique los campos Nombre, Apellido o Numero de identifacion");
            }if(tdoc.getSelectedItem().toString().equals("Seleccione el tipo de documento")){
               JOptionPane.showMessageDialog(null,"Verifique el campo de tipo de documento");
               
             
               
            }else{
                val4=1;
            }
            
           
            if (ValidaGen(buttonGroup1)==false) 
                    
                    /*|| ValidaGen(generoM)==true || ValidaGen(generoOtro)==true*/
            {
            val2=1;
          
            }else{
                JOptionPane.showMessageDialog(null,"Verifique el campo generoo");

                
                
                
                
            }if(tdoc.getSelectedItem().toString().equals("Seleccione un tipo de documento")){
               JOptionPane.showMessageDialog(null,"Verifique el tipo de documento");
            }else{
                val4=1;
        }
    }      // TODO add your handling code here:
    }//GEN-LAST:event_Boton_verdeActionPerformed

    private void tdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdocActionPerformed

    private void Boton_rojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_rojoActionPerformed
        JOptionPane.showMessageDialog(null, "Gracias por su visita");
        System.exit(0);
    }//GEN-LAST:event_Boton_rojoActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             //   new Registro().setVisible(true);
                
            }
        });
    }
    
     public static boolean ValidaText(JTextField a){
        
                if (a.getText().trim().compareTo("")==0){
               JOptionPane.showMessageDialog(null,"No puede contener campos vacios","Error", JOptionPane.ERROR_MESSAGE); 
                a.requestFocusInWindow();
                return false;
                }
                return true;
        }
     
     
     public static boolean ValidaHobbie(JCheckBox a){
        
                if (a.isSelected()){
                return true;
                
                }JOptionPane.showMessageDialog(null,"Debe seleccionar un hobbie o todos","Error", JOptionPane.ERROR_MESSAGE);
                return false;
        }
     
     public void Letra(JTextField a) {
     
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char d = e.getKeyChar();
                if (Character.isDigit(d) && d != KeyEvent.VK_SPACE && d != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Este espacio no puede contener numeros");
              super.keyTyped(e); //To change body of generated methods, choose Tools | Templates.
            } else if ((((int) e.getKeyChar()>32 && (int) e.getKeyChar() <= 47)
                    || ((int)  e.getKeyChar()>= 58 && (int) e.getKeyChar() <= 64)
                     || ((int) e.getKeyChar() >= 123 && (int) e.getKeyChar() <= 255))){
                    
                             e.consume();
                     getToolkit().beep();
                     JOptionPane.showMessageDialog(null, "Este espacio no puede contener caracteres especiales!"); 
                }
            }      
    });        
 }
 
 
         public void Num(JTextField a) {
     
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char d;
                d = ke.getKeyChar();
                if (Character.isLetter(d) && d != KeyEvent.VK_SPACE && d != KeyEvent.VK_BACK_SPACE) {
                    ke.consume();
                    getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Este espacio no puede contener letras");
           //   super.keyTyped(e); //To change body of generated methods, choose Tools | Templates.
            } else if ((((int) ke.getKeyChar()>32 && (int) ke.getKeyChar() <= 47)
                    || ((int)  ke.getKeyChar()>= 58 && (int) ke.getKeyChar() <= 64)
                     || ((int) ke.getKeyChar() >= 123 && (int) ke.getKeyChar() <= 255))){
                    
                             ke.consume();
                     getToolkit().beep();
                     JOptionPane.showMessageDialog(null, "Este espacio no puede contener caracteres especiales!"); 
                }
               
            }
            
             } );     
    }  
         
         
    public void validaemail(JTextField em){
        String email;
        email = em.getText();
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[_A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);
        if(matcher.find() == false){
            JOptionPane.showMessageDialog(null,"Direccion de correo no valida");
        }
    }
    
        public static boolean ValidaGen(ButtonGroup a){
        
                if (a.getSelection().isSelected()){
                return false;
                }else
                 JOptionPane.showMessageDialog(null,"Debe seleccionar un genero","Error", JOptionPane.ERROR_MESSAGE);
                return true;
        }
    
     
 private void captura(){
        JOptionPane.showMessageDialog(null, "Estos son los datos ingresados.");
          Formulario2 fdr = new Formulario2();
          fdr.setVisible(true);
          fdr.setLocationRelativeTo(null);
         // fdr.setResizable(false);
           fdr.primernombre.setText(txt_Nom.getText());
           fdr.segundonombre.setText(txt_Nom2.getText());
           fdr.primerapellido.setText(txt_Apll.getText());
           fdr.segundoapellido.setText(txt_Apll2.getText());
           fdr.telefono.setText(txt_tel.getText());
           fdr.direccion.setText(txt_Dir.getText());
           fdr.email.setText(txt_email.getText());
         fdr.tipodocumento.setText(tdoc.getSelectedItem().toString());
            //PASAR INFORMACION DEL RADIOBUTON
             if (generoM.isSelected()){
             fdr.genero.setText("Masculino");
         }
         else if (generoF.isSelected()){
             fdr.genero.setText("Femenino");
         }
         else if (generoOtro.isSelected()){
             fdr.genero.setText("Otro");
         } 
         else{ JOptionPane.showMessageDialog(null, "Favor seleccionar un campo valido en genero");}
           
           //PASAR INFORMACION DEL CHECKBOX
           
          
            if (checkDepor.isSelected()){
             fdr.hobbie1.setText("Deportes");
         } else {
               fdr.hobbie1.setText("*******");
           }
            
             if (checkLectura.isSelected()){
             fdr.hobbie2.setText("Lectura");
         } else {
               fdr.hobbie2.setText("*******");
           }
             
              if (checkMusica.isSelected()){
             fdr.hobbie3.setText("Musica");
         } else {
               fdr.hobbie3.setText("*******");
           }
              
               if (checkOtro.isSelected()){
             fdr.hobbie4.setText("Otro");
         } else {
               fdr.hobbie4.setText("*******");
           }
               
           
           fdr.estado.setText(txt_doc.getText());
           fdr.cuadrotexto.setText(Ta_comentario.getText());
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_amarillo;
    private javax.swing.JButton Boton_rojo;
    private javax.swing.JButton Boton_verde;
    private javax.swing.JTextArea Ta_comentario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkDepor;
    private javax.swing.JCheckBox checkLectura;
    private javax.swing.JCheckBox checkMusica;
    private javax.swing.JCheckBox checkOtro;
    private javax.swing.JRadioButton generoF;
    private javax.swing.JRadioButton generoM;
    private javax.swing.JRadioButton generoOtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblfondo2;
    private javax.swing.JComboBox<String> tdoc;
    private javax.swing.JTextField txt_Apll;
    private javax.swing.JTextField txt_Apll2;
    private javax.swing.JTextField txt_Dir;
    private javax.swing.JTextField txt_Nom;
    private javax.swing.JTextField txt_Nom2;
    private javax.swing.JTextField txt_doc;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
