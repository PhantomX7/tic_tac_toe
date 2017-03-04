package tictactoe;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Phantom
 */
enum Turn {
    PLAYER1, PLAYER2;
}

public class TictactoeMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    Turn turn;
    int player1Score = 0;
    int player2Score = 0;

    public TictactoeMain() {
        initComponents();
        NameDialog dialog = new NameDialog(this, true);
        dialog.setVisible(true);
        setLocationRelativeTo(null);
        this.turn = Turn.PLAYER1;
        updateTurn();
    }

    private void updateTurn() {
        if (turn == Turn.PLAYER1) {
            lblTurn.setText(name1 + " Turn");
        } else if (turn == Turn.PLAYER2) {
            lblTurn.setText(name2 + " Turn");
        }
    }

    private void newGame() {
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        if (turn == Turn.PLAYER1) {
            lblTurn.setText(name1 + " Turn");
        } else if (turn == Turn.PLAYER2) {
            lblTurn.setText(name2 + " Turn");
        }
    }

    private void checkWin() {
        //player 1
        if (jButton1.getText().equals("O") && jButton2.getText().equals("O") && jButton3.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, name1 + " win");
            player1Score++;
            lblScore1.setText(String.valueOf(player1Score));
            newGame();
        }
        if (jButton4.getText().equals("O") && jButton5.getText().equals("O") && jButton6.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, name1 + " win");
            player1Score++;
            lblScore1.setText(String.valueOf(player1Score));
            newGame();
        }
        if (jButton7.getText().equals("O") && jButton8.getText().equals("O") && jButton9.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, name1 + " win");
            player1Score++;
            lblScore1.setText(String.valueOf(player1Score));
            newGame();
        }
        if (jButton1.getText().equals("O") && jButton4.getText().equals("O") && jButton7.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, name1 + " win");
            player1Score++;
            lblScore1.setText(String.valueOf(player1Score));
            newGame();
        }
        if (jButton2.getText().equals("O") && jButton5.getText().equals("O") && jButton8.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, name1 + " win");
            player1Score++;
            lblScore1.setText(String.valueOf(player1Score));
            newGame();
        }
        if (jButton3.getText().equals("O") && jButton6.getText().equals("O") && jButton9.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, name1 + " win");
            player1Score++;
            lblScore1.setText(String.valueOf(player1Score));
            newGame();
        }
        if (jButton1.getText().equals("O") && jButton5.getText().equals("O") && jButton9.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, name1 + " win");
            player1Score++;
            lblScore1.setText(String.valueOf(player1Score));
            newGame();
        }
        if (jButton3.getText().equals("O") && jButton5.getText().equals("O") && jButton7.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, name1 + " win");
            player1Score++;
            lblScore1.setText(String.valueOf(player1Score));
            newGame();
        }

        //player 2
        if (jButton1.getText().equals("X") && jButton2.getText().equals("X") && jButton3.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, name2 + " win");
            player2Score++;
            lblScore2.setText(String.valueOf(player2Score));
            newGame();
        }
        if (jButton4.getText().equals("X") && jButton5.getText().equals("X") && jButton6.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, name2 + " win");
            player2Score++;
            lblScore2.setText(String.valueOf(player2Score));
            newGame();
        }
        if (jButton7.getText().equals("X") && jButton8.getText().equals("X") && jButton9.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, name2 + " win");
            player2Score++;
            lblScore2.setText(String.valueOf(player2Score));
            newGame();
        }
        if (jButton1.getText().equals("X") && jButton4.getText().equals("X") && jButton7.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, name2 + " win");
            player2Score++;
            lblScore2.setText(String.valueOf(player2Score));
            newGame();
        }
        if (jButton2.getText().equals("X") && jButton5.getText().equals("X") && jButton8.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, name2 + " win");
            player2Score++;
            lblScore2.setText(String.valueOf(player2Score));
            newGame();
        }
        if (jButton3.getText().equals("X") && jButton6.getText().equals("X") && jButton9.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, name2 + " win");
            player2Score++;
            lblScore2.setText(String.valueOf(player2Score));
            newGame();
        }
        if (jButton1.getText().equals("X") && jButton5.getText().equals("X") && jButton9.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, name2 + " win");
            player2Score++;
            lblScore2.setText(String.valueOf(player2Score));
            newGame();
        }
        if (jButton3.getText().equals("X") && jButton5.getText().equals("X") && jButton7.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, name2 + " win");
            player2Score++;
            lblScore2.setText(String.valueOf(player2Score));
            newGame();
        }
    }

    private String name1;
    private String name2;

    public void setName(String player1, String player2) {
        if (player1.isEmpty() || player1.trim().isEmpty()) {
            lblPlayer1.setText("Player 1");
        } else {
            lblPlayer1.setText(player1);
            name1 = player1;
        }
        if (player2.isEmpty() || player2.trim().isEmpty()) {
            lblPlayer2.setText("Player 2");
        } else {
            lblPlayer2.setText(player2);
            name2 = player2;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        lblPlayer1 = new javax.swing.JLabel();
        lblPlayer2 = new javax.swing.JLabel();
        lblScore1 = new javax.swing.JLabel();
        lblScore2 = new javax.swing.JLabel();
        lblTurn = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        lblPlayer1.setText("jLabel1");

        lblPlayer2.setText("jLabel2");

        lblScore1.setText("0");

        lblScore2.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlayer1)
                .addGap(18, 18, 18)
                .addComponent(lblScore1)
                .addGap(226, 226, 226)
                .addComponent(lblPlayer2)
                .addGap(18, 18, 18)
                .addComponent(lblScore2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayer1)
                    .addComponent(lblPlayer2)
                    .addComponent(lblScore1)
                    .addComponent(lblScore2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lblTurn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTurn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTurn.setText("Lel");

        jMenu1.setText("Option");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new.png"))); // NOI18N
        jMenuItem1.setText("New Game");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        jMenuItem3.setText("Change Name");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/about.png"))); // NOI18N
        jMenuItem2.setText("About");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblTurn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblTurn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jButton2.getText().isEmpty()) {
            if (turn == Turn.PLAYER1) {
                jButton2.setText("O");
                turn = Turn.PLAYER2;
            } else if (turn == Turn.PLAYER2) {
                jButton2.setText("X");
                turn = Turn.PLAYER1;
            }
        }
        checkWin();
        updateTurn();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jButton3.getText().isEmpty()) {
            if (turn == Turn.PLAYER1) {
                jButton3.setText("O");
                turn = Turn.PLAYER2;
            } else if (turn == Turn.PLAYER2) {
                jButton3.setText("X");
                turn = Turn.PLAYER1;
            }
        }
        checkWin();
        updateTurn();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jButton1.getText().isEmpty()) {
            if (turn == Turn.PLAYER1) {
                jButton1.setText("O");
                turn = Turn.PLAYER2;
            } else if (turn == Turn.PLAYER2) {
                jButton1.setText("X");
                turn = Turn.PLAYER1;
            }
        }
        checkWin();
        updateTurn();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jButton4.getText().isEmpty()) {
            if (turn == Turn.PLAYER1) {
                jButton4.setText("O");
                turn = Turn.PLAYER2;
            } else if (turn == Turn.PLAYER2) {
                jButton4.setText("X");
                turn = Turn.PLAYER1;
            }
        }
        checkWin();
        updateTurn();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jButton5.getText().isEmpty()) {
            if (turn == Turn.PLAYER1) {
                jButton5.setText("O");
                turn = Turn.PLAYER2;
            } else if (turn == Turn.PLAYER2) {
                jButton5.setText("X");
                turn = Turn.PLAYER1;
            }
        }
        checkWin();
        updateTurn();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jButton6.getText().isEmpty()) {
            if (turn == Turn.PLAYER1) {
                jButton6.setText("O");
                turn = Turn.PLAYER2;
            } else if (turn == Turn.PLAYER2) {
                jButton6.setText("X");
                turn = Turn.PLAYER1;
            }
        }
        checkWin();
        updateTurn();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (jButton7.getText().isEmpty()) {
            if (turn == Turn.PLAYER1) {
                jButton7.setText("O");
                turn = Turn.PLAYER2;
            } else if (turn == Turn.PLAYER2) {
                jButton7.setText("X");
                turn = Turn.PLAYER1;
            }
        }
        checkWin();
        updateTurn();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (jButton8.getText().isEmpty()) {
            if (turn == Turn.PLAYER1) {
                jButton8.setText("O");
                turn = Turn.PLAYER2;
            } else if (turn == Turn.PLAYER2) {
                jButton8.setText("X");
                turn = Turn.PLAYER1;
            }
        }
        checkWin();
        updateTurn();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (jButton9.getText().isEmpty()) {
            if (turn == Turn.PLAYER1) {
                jButton9.setText("O");
                turn = Turn.PLAYER2;
            } else if (turn == Turn.PLAYER2) {
                jButton9.setText("X");
                turn = Turn.PLAYER1;
            }
        }
        checkWin();
        updateTurn();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        newGame();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        NameDialog dialog = new NameDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        int x=util.Sutil.msq(this, "Are you sure?");
        if(x==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        util.Sutil.msg(this, "Tic Tac Toe Basic\n"
                + "version:1.0\n"
                + "By:Kenichi");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TictactoeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TictactoeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TictactoeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TictactoeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TictactoeMain().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPlayer1;
    private javax.swing.JLabel lblPlayer2;
    private javax.swing.JLabel lblScore1;
    private javax.swing.JLabel lblScore2;
    private javax.swing.JLabel lblTurn;
    // End of variables declaration//GEN-END:variables
}
