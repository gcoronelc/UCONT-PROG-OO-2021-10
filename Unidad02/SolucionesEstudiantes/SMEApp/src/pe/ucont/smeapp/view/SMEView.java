package pe.ucont.smeapp.view;

import pe.ucont.smeapp.service.SMEService;

/**
 *
 */
public class SMEView extends javax.swing.JFrame {

	private int op;
	private String entrada;
	private int opMenu;
	private double importeOrigen, importeDestino;
	private long nip;
	private long cuenta;
	private int retiro = 0;
	private int deposito = 0;
	private SMEService service = new SMEService();

	/**
	 * Creates new form SMEView
	 */
	public SMEView() {
		initComponents();
		this.setLocationRelativeTo(null);
		op = 0;
		entrada = "";
		proceso();
	}

	private void proceso() {
		String dato;
		switch (op) {
			case 0:
				String menu = "Bienvenido!\n";
				menu += "Escriba su Número de cuenta: ";
				txtConsola.setText(menu);
				op = 1;
				break;
			case 1://podemos validar el nip y cuenta, pero no se tiene capas internas que lo hagan
				cuenta = Long.parseLong(entrada);
				txtConsola.setText(txtConsola.getText() + "\nIngrese su NIP:");
				op = 2;
				break;
			case 2://espera la operación a realizar
				nip = Long.parseLong(entrada);
				String menuPrin = "";
				menuPrin += "Menú Principal!\n";
				menuPrin += "1.- Ver mi Saldo\n";
				menuPrin += "2.- Retirar Efectivo\n";
				menuPrin += "3.- Depositar fondos\n";
				menuPrin += "4.- Salir\n";
				menuPrin += "Escriba una Opción:";
				txtConsola.setText(menuPrin);
				op = 3;
				entrada = "";
				break;
			case 3://espera en menu principal
				opMenu = Integer.parseInt(entrada);
				dato = txtConsola.getText();
				if (opMenu < 1 || opMenu > 4) {
					dato += "\nOpción incorrecta.\n";
					dato += "Escriba una Opción:";
					txtConsola.setText(dato);
					entrada = "";     //limpia la variable de dentrada
					op = 3;           //vuelve a pedir el mismo menu anterior
					break;
				} else {
					switch (opMenu) {
						case 1: {
							dato += "\nSu Saldo es: S/ " + obtenerSaldo();
							dato += "\nEscriba una Opción:";
							txtConsola.setText(dato);
							entrada = "";
							op = 3;
							break;
						}
						case 2: {
							dato = "Menu de retiro\n";
							dato += "     1 - $20   4 - $100\n";
							dato += "     2 - $40   5 - $200\n";
							dato += "     3 - $60   6 - Cancelar transacción\n";
							dato += "Elija el monto de retiro: ";
							txtConsola.setText(dato);
							op = 4;
							entrada = "";
							break;
						}
						case 3: {//depositar fondos
							dato += "\nDigite el monto a depositar: ";
							txtConsola.setText(dato);
							op = 5;
							entrada = "";
							break;
						}
						case 4: {  //Salir
							op = 0;
							entrada = "";
							proceso();
							break;
						}
					}
				}
				break;
			case 4://se permite seleccionar la opción de retiro
				opMenu = Integer.parseInt(entrada);
				dato = txtConsola.getText();
				if (opMenu < 1 || opMenu > 6) {
					dato += "\nOpción incorrecta.\n";
					dato += "Elija el monto de retiro: ";
					txtConsola.setText(dato);
					op = 4;
					break;
				} else {//eligio una opcion correcta
					if (opMenu == 6)//cancelar la operación de retiro
					{
						op = 2;//regresa al menu principal
						proceso();
					} else {
						realizarRetiro(opMenu);
						op = 2;//regresa al menu principal
						proceso();
						//jLblDispensador.setText( "Tome aqui el efectivo");
					}
				}
			case 5: //depósito
			{
				deposito = Integer.parseInt(entrada);
				realizarDeposito(deposito);
				op = 2;//regresa al menu principal
				proceso();
			}
		}
	}

	private double obtenerSaldo() {
		return service.obtenerSaldo();
	}

	private boolean realizarDeposito(int valor) {
		return service.realizarDeposito(valor);
	}

	private boolean realizarRetiro(int opMenu) {
		int valor = 0;
		switch (opMenu) {
			case 1:
				valor = 20;
			case 2:
				valor = 40;
			case 3:
				valor = 60;
			case 4:
				valor = 100;
			case 5:
				valor = 200;
		}
		return service.realizarRetiro(valor);
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsola = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAJERO AUTOMATICO");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtConsola.setEditable(false);
        txtConsola.setBackground(new java.awt.Color(204, 204, 204));
        txtConsola.setColumns(20);
        txtConsola.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        txtConsola.setRows(5);
        txtConsola.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(txtConsola);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 380, 200));

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn0.setBackground(new java.awt.Color(102, 102, 102));
        btn0.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btn0.setForeground(new java.awt.Color(204, 204, 204));
        btn0.setText("0");
        btn0.setOpaque(false);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 45, 35));

        btn1.setBackground(new java.awt.Color(102, 102, 102));
        btn1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btn1.setForeground(new java.awt.Color(204, 204, 204));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn1.setOpaque(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 45, 40));

        btn2.setBackground(new java.awt.Color(102, 102, 102));
        btn2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btn2.setForeground(new java.awt.Color(204, 204, 204));
        btn2.setText("2");
        btn2.setOpaque(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 45, 40));

        btn3.setBackground(new java.awt.Color(102, 102, 102));
        btn3.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btn3.setForeground(new java.awt.Color(204, 204, 204));
        btn3.setText("3");
        btn3.setOpaque(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 45, 40));

        btn4.setBackground(new java.awt.Color(102, 102, 102));
        btn4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btn4.setForeground(new java.awt.Color(204, 204, 204));
        btn4.setText("4");
        btn4.setOpaque(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 45, 40));

        btn5.setBackground(new java.awt.Color(102, 102, 102));
        btn5.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btn5.setForeground(new java.awt.Color(204, 204, 204));
        btn5.setText("5");
        btn5.setOpaque(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 45, 40));

        btn6.setBackground(new java.awt.Color(102, 102, 102));
        btn6.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btn6.setForeground(new java.awt.Color(204, 204, 204));
        btn6.setText("6");
        btn6.setOpaque(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 45, 40));

        btn7.setBackground(new java.awt.Color(102, 102, 102));
        btn7.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btn7.setForeground(new java.awt.Color(204, 204, 204));
        btn7.setText("7");
        btn7.setOpaque(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 45, 40));

        btn8.setBackground(new java.awt.Color(102, 102, 102));
        btn8.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btn8.setForeground(new java.awt.Color(204, 204, 204));
        btn8.setText("8");
        btn8.setOpaque(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 45, 40));

        btn9.setBackground(new java.awt.Color(102, 102, 102));
        btn9.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btn9.setForeground(new java.awt.Color(204, 204, 204));
        btn9.setText("9");
        btn9.setOpaque(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 45, 40));

        btnEnter.setBackground(new java.awt.Color(102, 102, 102));
        btnEnter.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(204, 204, 204));
        btnEnter.setText("Enter");
        btnEnter.setOpaque(false);
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        jPanel2.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 94, 35));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("__________________________");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, 40));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Tome aquí el efectivo");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 200, 49));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("__________________________");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, 40));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Inserte aquí el sobre de depósito");
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 200, 49));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 380, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
		entrada += "0";
		txtConsola.setText(txtConsola.getText() + "0");
   }//GEN-LAST:event_btn0ActionPerformed

   private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
		entrada += "1";
		txtConsola.setText(txtConsola.getText() + "1");
   }//GEN-LAST:event_btn1ActionPerformed

   private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
		entrada += "2";
		txtConsola.setText(txtConsola.getText() + "2");
   }//GEN-LAST:event_btn2ActionPerformed

   private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
		entrada += "3";
		txtConsola.setText(txtConsola.getText() + "3");
   }//GEN-LAST:event_btn3ActionPerformed

   private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
		entrada += "4";
		txtConsola.setText(txtConsola.getText() + "4");
   }//GEN-LAST:event_btn4ActionPerformed

   private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
		entrada += "5";
		txtConsola.setText(txtConsola.getText() + "5");
   }//GEN-LAST:event_btn5ActionPerformed

   private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
		entrada += "6";
		txtConsola.setText(txtConsola.getText() + "6");
   }//GEN-LAST:event_btn6ActionPerformed

   private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
		entrada += "7";
		txtConsola.setText(txtConsola.getText() + "7");
   }//GEN-LAST:event_btn7ActionPerformed

   private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
		entrada += "8";
		txtConsola.setText(txtConsola.getText() + "8");
   }//GEN-LAST:event_btn8ActionPerformed

   private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
		entrada += "9";
		txtConsola.setText(txtConsola.getText() + "9");
   }//GEN-LAST:event_btn9ActionPerformed

   private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
		proceso();
   }//GEN-LAST:event_btnEnterActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
		 // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
			java.util.logging.Logger.getLogger(SMEView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SMEView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SMEView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SMEView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SMEView().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea txtConsola;
    // End of variables declaration//GEN-END:variables

}
