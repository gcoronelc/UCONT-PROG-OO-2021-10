package atm_semana04;

public class cajero extends javax.swing.JFrame {

	String[][] tabla;
	String cuenta;
	String nip;
	String op;
	String dep;
	String ventana;
	String nro;
	String pass;
	String saldo;
	boolean bcuenta;
	boolean bnip;
	boolean bmenu;
	int idx;
	int re, sa;

	public cajero() {
		initComponents();
		iniciarvariables();
		bienvenidacuenta();

		tabla = new String[3][3];
		tabla[0][0] = "123";
		tabla[0][1] = "111";
		tabla[0][2] = "3000";

		tabla[1][0] = "456";
		tabla[1][1] = "222";
		tabla[1][2] = "5000";

		tabla[2][0] = "789";
		tabla[2][1] = "333";
		tabla[2][2] = "8000";

	}

	void iniciarvariables() {
		cuenta = "";
		nip = "";
		bcuenta = true;
		bnip = false;
		op = "";
		bmenu = false;
		ventana = "";
		nro = "-1";
		pass = "-1";
	}

	void bienvenidacuenta() {
		bcuenta = true;
		txtSalida.setText("");
		txtSalida.append("                                                                     Bienvenido! \n\n");
		txtSalida.append("         Escriba su numero de cuenta :");
		ventana = "bienvenida";
	}

	void solicitarnip() {
		bnip = true;
		txtSalida.append("\n\n         Escriba su NIP: ");
		ventana = "nip";
	}

	void menuprincipal() {
		txtSalida.setText("");
		txtSalida.append("                                                                          Menu principal\n\n");
		txtSalida.append("             1. Ver mi Saldo\n");
		txtSalida.append("             2. Retirar efectivo \n");
		txtSalida.append("             3. Depositar Fondos \n");
		txtSalida.append("             4. Salir \n");
		txtSalida.append("                 Eliga una opcion: ");
		ventana = "principal";
		bmenu = true;
		op = "";
	}

	void versaldo() {
		txtSalida.setText("");
		txtSalida.append("\n\n              El saldo es : " + saldo);
		txtSalida.append("\n\n\n\n             Presione (0) + Enter para salir: ");
		ventana = "saldo";
		sa = -1;
	}

	void retiro() {
		txtSalida.setText("");
		txtSalida.append("                                                                           Menu de retiro \n");
		txtSalida.append("\n               1.   $20                                 4.   $100 \n");
		txtSalida.append("               2.   $40                                 5.   $200 \n");
		txtSalida.append("               3.   $60                                 6.   Cancelar transaccion \n");
		txtSalida.append("\n                    Eliga un monto de retiro: ");
		ventana = "retiro";
	}

	void deposito() {
		txtSalida.setText("");
		txtSalida.append("                      Ingrese el monto de dinero a depositar: ");
		ventana = "deposito";
		dep = "";
		txtSalida.append("\n\n\n                      Pulse (0) para cancelar la transaccion: ");
		txtSalida.append("                      Monto ($): ");
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtSalida.setBackground(new java.awt.Color(0, 0, 0));
        txtSalida.setColumns(20);
        txtSalida.setForeground(new java.awt.Color(51, 255, 51));
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnDos.setBackground(new java.awt.Color(204, 204, 255));
        btnDos.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnDos.setText("2");
        btnDos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnTres.setBackground(new java.awt.Color(204, 204, 255));
        btnTres.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnTres.setText("3");
        btnTres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnCuatro.setBackground(new java.awt.Color(204, 204, 255));
        btnCuatro.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnCuatro.setText("4");
        btnCuatro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnCinco.setBackground(new java.awt.Color(204, 204, 255));
        btnCinco.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnCinco.setText("5");
        btnCinco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setBackground(new java.awt.Color(204, 204, 255));
        btnSeis.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnSeis.setText("6");
        btnSeis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnCero.setBackground(new java.awt.Color(204, 204, 255));
        btnCero.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnCero.setText("0");
        btnCero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });

        btnEnter.setBackground(new java.awt.Color(204, 204, 255));
        btnEnter.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnEnter.setText("Enter");
        btnEnter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        btnSiete.setBackground(new java.awt.Color(204, 204, 255));
        btnSiete.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnSiete.setText("7");
        btnSiete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnOcho.setBackground(new java.awt.Color(204, 204, 255));
        btnOcho.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnOcho.setText("8");
        btnOcho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnNueve.setBackground(new java.awt.Color(204, 204, 255));
        btnNueve.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnNueve.setText("9");
        btnNueve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnUno.setBackground(new java.awt.Color(204, 204, 255));
        btnUno.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnUno.setText("1");
        btnUno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tome aqui el efectivo");

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Inserte aquí el sobre de deposito");

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed

		 txtSalida.append("2");
		 if (bcuenta == true || ventana.equals("bienvenida")) {
			 cuenta = cuenta + "2";
		 }
		 if (bnip == true || ventana.equals("nip")) {
			 nip = nip + "2";
		 }
		 if (bmenu == true || ventana.equals("principal")) {
			 menuprincipal();
			 op = "2";
			 txtSalida.append("2");
		 } else if (ventana.equals("retiro")) {
			 retiro();
			 re = 2;
			 txtSalida.append("2");
		 } else if (ventana.equals("deposito")) {
			 if (dep.equals("")) {
				 deposito();
				 txtSalida.append("2");
			 }
			 dep = dep + "2";
		 } else if (ventana.equals("saldo")) {
			 sa = 2;
		 }
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed

		 txtSalida.append("3");
		 if (bcuenta == true || ventana.equals("bienvenida")) {
			 cuenta = cuenta + "3";
		 }
		 if (bnip == true || ventana.equals("nip")) {
			 nip = nip + "3";
		 }
		 if (bmenu == true || ventana.equals("principal")) {
			 menuprincipal();
			 op = "3";
			 txtSalida.append("3");
		 } else if (ventana.equals("retiro")) {
			 retiro();
			 re = 3;
			 txtSalida.append("3");
		 } else if (ventana.equals("deposito")) {
			 if (dep.equals("")) {
				 deposito();
				 txtSalida.append("3");
			 }
			 dep = dep + "3";
		 } else if (ventana.equals("saldo")) {
			 sa = 3;
		 }
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed

		 txtSalida.append("4");
		 if (bcuenta == true || ventana.equals("bienvenida")) {
			 cuenta = cuenta + "4";
		 }
		 if (bnip == true || ventana.equals("nip")) {
			 nip = nip + "4";
		 }
		 if (bmenu == true || ventana.equals("principal")) {
			 menuprincipal();
			 op = "4";
			 txtSalida.append("4");
		 } else if (ventana.equals("retiro")) {
			 retiro();
			 re = 4;
			 txtSalida.append("4");
		 } else if (ventana.equals("deposito")) {
			 if (dep.equals("")) {
				 deposito();
				 txtSalida.append("4");
			 }
			 dep = dep + "4";
		 } else if (ventana.equals("saldo")) {
			 sa = 4;
		 }
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed

		 txtSalida.append("5");
		 if (bcuenta == true || ventana.equals("bienvenida")) {
			 cuenta = cuenta + "5";
		 }
		 if (bnip == true || ventana.equals("nip")) {
			 nip = nip + "5";
		 }
		 if (bmenu == true || ventana.equals("principal")) {
			 menuprincipal();
			 op = "5";
			 txtSalida.append("5");
		 } else if (ventana.equals("retiro")) {
			 retiro();
			 re = 5;
			 txtSalida.append("5");
		 } else if (ventana.equals("deposito")) {
			 if (dep.equals("")) {
				 deposito();
				 txtSalida.append("5");
			 }
			 dep = dep + "5";
		 } else if (ventana.equals("saldo")) {
			 sa = 5;
		 }


    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed

		 txtSalida.append("6");
		 if (bcuenta == true || ventana.equals("bienvenida")) {
			 cuenta = cuenta + "6";
		 }
		 if (bnip == true || ventana.equals("nip")) {
			 nip = nip + "6";
		 }
		 if (bmenu == true || ventana.equals("principal")) {
			 menuprincipal();
			 op = "6";
			 txtSalida.append("6");
		 } else if (ventana.equals("retiro")) {
			 retiro();
			 re = 6;
			 txtSalida.append("6");
		 } else if (ventana.equals("deposito")) {
			 if (dep.equals("")) {
				 deposito();

				 txtSalida.append("6");
			 }
			 dep = dep + "6";
		 } else if (ventana.equals("saldo")) {
			 sa = 6;
		 }
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed

		 txtSalida.append("0");
		 if (bcuenta == true || ventana.equals("bienvenida")) {
			 cuenta = cuenta + "0";
		 }
		 if (bnip == true || ventana.equals("nip")) {
			 nip = nip + "0";
		 }
		 if (bmenu == true || ventana.equals("principal")) {
			 menuprincipal();
			 op = "0";
			 txtSalida.append("0");
		 }
		 if (ventana.equals("retiro")) {
			 retiro();
			 re = 0;
			 txtSalida.append("0");
		 } else if (ventana.equals("deposito")) {
			 if (dep.equals("")) {
				 deposito();
				 txtSalida.append("0");
			 }
			 dep = dep + "0";
		 } else if (ventana.equals("saldo")) {
			 sa = 0;
		 }
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed

		 if (bcuenta == true || ventana.equals("bienvenida")) {
			 System.out.println("bienvenida");
			 buscarCta(cuenta);
			 if (cuenta.contentEquals(nro) == true) {
				 bcuenta = false;
				 bnip = true;
				 solicitarnip();
			 } else {
				 iniciarvariables();
				 bienvenidacuenta();
			 }
		 } else if (bnip == true || ventana.equals("nip")) {
			 if (nip.contentEquals(pass) == true) {
				 bnip = false;
				 bmenu = true;
				 menuprincipal();
			 } else {
				 iniciarvariables();
				 bienvenidacuenta();
			 }
		 } else if (bmenu == true || ventana.equals("principal")) {
			 if (op.contentEquals("1") == true) {
				 bmenu = false;
				 versaldo();

			 } else if (op.contentEquals("2") == true) {
				 bmenu = false;
				 retiro();
			 } else if (op.contentEquals("3") == true) {
				 bmenu = false;
				 deposito();

			 } else if (op.contentEquals("4") == true) {
				 bienvenidacuenta();
				 iniciarvariables();
			 }
		 } else if (ventana.equals("retiro")) {

			 int restaSaldo;
			 restaSaldo = Integer.parseInt(saldo);

			 switch (re) {
				 case 1:
					 restaSaldo = restaSaldo - 20;
					 txtSalida.append("\n                                    Operación realizada con Exito");
					 break;
				 case 2:
					 restaSaldo = restaSaldo - 40;
					 txtSalida.append("\n                                    Operación realizada con Exito");
					 break;
				 case 3:
					 restaSaldo = restaSaldo - 60;
					 txtSalida.append("\n                                    Operación realizada con Exito");
					 break;
				 case 4:
					 restaSaldo = restaSaldo - 100;
					 txtSalida.append("\n                                    Operación realizada con Exito");
					 break;
				 case 5:
					 restaSaldo = restaSaldo - 200;
					 txtSalida.append("\n                                    Operación realizada con Exito");
					 break;
				 case 6:
					 menuprincipal();
					 bmenu = true;
					 break;
			 }
			 saldo = String.valueOf(restaSaldo);
			 tabla[idx][2] = saldo;
		 } else if (ventana.equals("deposito")) {
			 int sumaSaldo;
			 int dep;
			 sumaSaldo = Integer.parseInt(saldo);
			 if (this.dep.equals("")) {
				 this.dep = "0";
			 }
			 dep = Integer.parseInt(this.dep);
			 if (dep == 0) {
				 menuprincipal();
			 } else {
				 sumaSaldo = sumaSaldo + dep;
				 saldo = String.valueOf(sumaSaldo);
				 tabla[idx][2] = saldo;
				 txtSalida.append("\n\n\n                      Operación realizada, su nuevo saldo es: " + saldo);
				 this.dep = "";
			 }
		 } else if (ventana.equals("saldo")) {
			 if (sa == 0) {
				 menuprincipal();
			 }
		 }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed

		 txtSalida.append("7");
		 if (bcuenta == true || ventana.equals("bienvenida")) {
			 cuenta = cuenta + "7";
		 }
		 if (bnip == true || ventana.equals("nip")) {
			 nip = nip + "7";
		 }
		 if (bmenu == true || ventana.equals("principal")) {
			 menuprincipal();
			 op = "7";
			 txtSalida.append("7");
		 } else if (ventana.equals("retiro")) {
			 retiro();
			 re = 7;
			 txtSalida.append("7");
		 } else if (ventana.equals("deposito")) {
			 if (dep.equals("")) {
				 deposito();
				 txtSalida.append("7");
			 }
			 dep = dep + "7";
		 } else if (ventana.equals("saldo")) {
			 sa = 7;
		 }
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed

		 txtSalida.append("8");
		 if (bcuenta == true || ventana.equals("bienvenida")) {
			 cuenta = cuenta + "8";
		 }
		 if (bnip == true || ventana.equals("nip")) {
			 nip = nip + "8";
		 }
		 if (bmenu == true || ventana.equals("principal")) {
			 menuprincipal();
			 op = "8";
			 txtSalida.append("8");
		 } else if (ventana.equals("retiro")) {
			 retiro();
			 re = 8;
			 txtSalida.append("8");
		 } else if (ventana.equals("deposito")) {
			 if (dep.equals("")) {
				 deposito();
				 txtSalida.append("8");
			 }
			 dep = dep + "8";
		 } else if (ventana.equals("saldo")) {
			 sa = 8;
		 }
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed

		 txtSalida.append("9");
		 if (bcuenta == true || ventana.equals("bienvenida")) {
			 cuenta = cuenta + "9";
		 }
		 if (bnip == true || ventana.equals("nip")) {
			 nip = nip + "9";
		 }
		 if (bmenu == true || ventana.equals("principal")) {
			 menuprincipal();
			 op = "9";
			 txtSalida.append("9");
		 }
		 if (ventana.equals("retiro")) {
			 retiro();
			 re = 9;
			 txtSalida.append("9");
		 } else if (ventana.equals("deposito")) {
			 if (dep.equals("")) {
				 deposito();
				 txtSalida.append("9");
			 }
			 dep = dep + "9";
		 } else if (ventana.equals("saldo")) {
			 sa = 9;
		 }
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
		 txtSalida.append("1");
		 if (bcuenta == true || ventana.equals("bienvenida")) {
			 cuenta = cuenta + "1";
		 }
		 if (bnip == true || ventana.equals("nip")) {
			 nip = nip + "1";
		 }
		 if (bmenu == true || ventana.equals("principal")) {
			 menuprincipal();
			 op = "1";
			 txtSalida.append("1");
		 } else if (ventana.equals("retiro")) {
			 retiro();
			 re = 1;
			 txtSalida.append("1");
		 } else if (ventana.equals("deposito")) {
			 if (dep.equals("")) {
				 deposito();
				 txtSalida.append("1");
			 }
			 dep = dep + "1";

		 } else if (ventana.equals("saldo")) {
			 sa = 1;
		 }


    }//GEN-LAST:event_btnUnoActionPerformed

	private void buscarCta(String n) {
		for (int x = 0; x < tabla.length; x++) {
			if (cuenta.equals(tabla[x][0])) {
				idx = x;
				nro = tabla[x][0];
				pass = tabla[x][1];
				saldo = tabla[x][2];
				break;
			}
		}
	}

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
			java.util.logging.Logger.getLogger(cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new cajero().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}
