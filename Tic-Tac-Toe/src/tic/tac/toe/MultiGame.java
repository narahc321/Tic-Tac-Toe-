/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author iiita
 */
public class MultiGame extends javax.swing.JFrame {

    private int p1 = 1;
    private int p2 = 0;
    private int pressed[] = new int[9];
    private int type[] = new int[9];
    private int player1Score = 0, player2Score = 0, tie = 0;
    private String p1name,p2name;

    /**
     * Creates new form MultiGame
     */
    public MultiGame() {
        CustomCursor();
        initComponents();
        setSize(900, 600);
        setLocation(225, 75);
        clear();
        setType();
    }
    
    public MultiGame(String player1Name, String player2Name) {
        CustomCursor();
        initComponents();
        setSize(900,600);
        setLocation(225, 75);
        clear();
        setType();
        setTitle("TIC-TAC-TOE");
        setResizable(false);
        this.p1name=player1Name;
        this.p2name=player2Name;
        player1name.setText(player1Name);
        player2name.setText(player2Name);
        player1score.setText("0");
        player2score.setText("0");
        tiescore.setText("0");
        msgbutton.setOpaque(false);
        msgbutton.setContentAreaFilled(false);
        msgbutton.setBorderPainted(false);
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        b3.setOpaque(false);
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        b4.setOpaque(false);
        b4.setContentAreaFilled(false);
        b4.setBorderPainted(false);
        b5.setOpaque(false);
        b5.setContentAreaFilled(false);
        b5.setBorderPainted(false);
        b6.setOpaque(false);
        b6.setContentAreaFilled(false);
        b6.setBorderPainted(false);
        b7.setOpaque(false);
        b7.setContentAreaFilled(false);
        b7.setBorderPainted(false);
        b8.setOpaque(false);
        b8.setContentAreaFilled(false);
        b8.setBorderPainted(false);
        b9.setOpaque(false);
        b9.setContentAreaFilled(false);
        b9.setBorderPainted(false);
        player1name.setOpaque(false);
        player1name.setContentAreaFilled(false);
        player1name.setBorderPainted(false);
        player2name.setOpaque(false);
        player2name.setContentAreaFilled(false);
        player2name.setBorderPainted(false);
        player1score.setOpaque(false);
        player1score.setContentAreaFilled(false);
        player1score.setBorderPainted(false);
        player2score.setOpaque(false);
        player2score.setContentAreaFilled(false);
        player2score.setBorderPainted(false);
        tiescore.setOpaque(false);
        tiescore.setContentAreaFilled(false);
        tiescore.setBorderPainted(false);
        home.setOpaque(false);
        home.setContentAreaFilled(false);
        home.setBorderPainted(false);
        newgame.setOpaque(false);
        newgame.setContentAreaFilled(false);
        newgame.setBorderPainted(false);
        selectplayer();
    }
    
    private void NewGame() {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        
    }

    private void clear() {
        for (int i = 0; i < 9; i++) {
            pressed[i] = 0;
            type[i] = 2;
        }
        msgbutton.setText("");
    }

    private void setType() {
        for (int i = 0; i < 9; i++) {
            type[i] = 2;
        }
    }

    private int draw() {
        int flag = 0;
        for (int i = 0; i < 9; i++) {
            if (this.type[i] == 2) {
                flag = 1;
                break;
            }
        }
        return flag;

    }
    
    private void disableButtons() {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        
    }

    private void EnableButtons() {
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
    }
    private void check() {
        if (type[0] == 1 && type[1] == 1 && type[2] == 1) {
            msgbutton.setText(p1name+" Wins");playwinSound();
            player1Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }
        else if (type[0] == 0 && type[1] == 0 && type[2] == 0) {
            msgbutton.setText(p2name+" Wins");playwinSound();
            player2Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }

        else if (type[3] == 1 && type[4] == 1 && type[5] == 1) {
            msgbutton.setText(p1name+" Wins");playwinSound();
            player1Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }
        else if (type[3] == 0 && type[4] == 0 && type[5] == 0) {
            msgbutton.setText(p2name+" Wins");playwinSound();
            player2Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }

        else if (type[6] == 1 && type[7] == 1 && type[8] == 1) {
            msgbutton.setText(p1name+" Wins");playwinSound();
            player1Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }
        else if (type[6] == 0 && type[7] == 0 && type[8] == 0) {
            msgbutton.setText(p2name+" Wins");playwinSound();
            player2Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }

        else if (type[0] == 1 && type[3] == 1 && type[6] == 1) {
            msgbutton.setText(p1name+" Wins");playwinSound();
            player1Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }
        else if (type[0] == 0 && type[3] == 0 && type[6] == 0) {
            msgbutton.setText(p2name+" Wins");playwinSound();
            player2Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }

        else if (type[1] == 1 && type[4] == 1 && type[7] == 1) {
            msgbutton.setText(p1name+" Wins");playwinSound();
            player1Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }
        else if (type[1] == 0 && type[4] == 0 && type[7] == 0) {
            msgbutton.setText(p2name+" Wins");playwinSound();
            player2Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }

        else if (type[2] == 1 && type[5] == 1 && type[8] == 1) {
            msgbutton.setText(p1name+" Wins");playwinSound();
            player1Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }
        else if (type[2] == 0 && type[5] == 0 && type[8] == 0) {
            msgbutton.setText(p2name+" Wins");playwinSound();
            player2Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }

        else if (type[0] == 1 && type[4] == 1 && type[8] == 1) {
            msgbutton.setText(p1name+" Wins");playwinSound();
            player1Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }
        else if (type[0] == 0 && type[4] == 0 && type[8] == 0) {
            msgbutton.setText(p2name+" Wins");playwinSound();
            player2Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }

        else if (type[2] == 1 && type[4] == 1 && type[6] == 1) {
            msgbutton.setText(p1name+" Wins");playwinSound();playwinSound();
            player1Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }
        else if (type[2] == 0 && type[4] == 0 && type[6] == 0) {
            msgbutton.setText(p2name+" Wins");playwinSound();
            player2Score++;
            player1score.setText(String.valueOf(player1Score));
            player2score.setText(String.valueOf(player2Score));
            disableButtons();
        }
        else {
            if(draw() == 0) {
                msgbutton.setText("ITS A TIE");playtieSound();
                this.tie++;
                tiescore.setText(String.valueOf(this.tie));
                player1score.setText(String.valueOf(player1Score));
                player2score.setText(String.valueOf(player2Score));
                disableButtons();
            }
        }

    }
    void selectplayer(){
        if(p1==1){
            player1name.setEnabled(true);
            player2name.setEnabled(false);
        }
        else{
            player2name.setEnabled(true);
            player1name.setEnabled(false);
        }
    }
    private int isFull() {
        int flag = 0;
        for (int i = 0; i < 9; i++) {
            if (pressed[i] == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            return 1;
        } else {
            return 0;
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

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        msgbutton = new javax.swing.JButton();
        newgame = new javax.swing.JButton();
        home = new javax.swing.JButton();
        player2name = new javax.swing.JButton();
        tiescore = new javax.swing.JButton();
        player2score = new javax.swing.JButton();
        player1name = new javax.swing.JButton();
        player1score = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        b1.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b1.setForeground(new java.awt.Color(179, 165, 0));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(30, 69, 130, 126);

        b2.setBackground(new java.awt.Color(254, 251, 233));
        b2.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b2.setForeground(new java.awt.Color(179, 165, 0));
        b2.setBorder(null);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(188, 56, 140, 140);

        b3.setBackground(new java.awt.Color(254, 251, 233));
        b3.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b3.setForeground(new java.awt.Color(179, 165, 0));
        b3.setBorder(null);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(350, 50, 130, 140);

        b4.setBackground(new java.awt.Color(254, 251, 233));
        b4.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b4.setForeground(new java.awt.Color(179, 165, 0));
        b4.setBorder(null);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(30, 220, 140, 110);

        b5.setBackground(new java.awt.Color(254, 251, 233));
        b5.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b5.setForeground(new java.awt.Color(179, 165, 0));
        b5.setBorder(null);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(190, 220, 130, 120);

        b6.setBackground(new java.awt.Color(254, 251, 233));
        b6.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b6.setForeground(new java.awt.Color(179, 165, 0));
        b6.setBorder(null);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(350, 220, 140, 120);

        b7.setBackground(new java.awt.Color(254, 251, 233));
        b7.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b7.setForeground(new java.awt.Color(179, 165, 0));
        b7.setBorder(null);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(30, 360, 140, 130);

        b8.setBackground(new java.awt.Color(254, 251, 233));
        b8.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b8.setForeground(new java.awt.Color(179, 165, 0));
        b8.setBorder(null);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(200, 360, 120, 140);

        b9.setBackground(new java.awt.Color(254, 251, 233));
        b9.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b9.setForeground(new java.awt.Color(179, 165, 0));
        b9.setBorder(null);
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9);
        b9.setBounds(340, 360, 140, 130);

        msgbutton.setBackground(new java.awt.Color(255, 248, 230));
        msgbutton.setFont(new java.awt.Font("Jurassic Park", 0, 36)); // NOI18N
        msgbutton.setForeground(new java.awt.Color(215, 117, 28));
        getContentPane().add(msgbutton);
        msgbutton.setBounds(20, 520, 470, 50);

        newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameActionPerformed(evt);
            }
        });
        getContentPane().add(newgame);
        newgame.setBounds(610, 400, 80, 50);

        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home);
        home.setBounds(720, 390, 70, 60);

        player2name.setFont(new java.awt.Font("Jurassic Park", 0, 48)); // NOI18N
        player2name.setForeground(new java.awt.Color(255, 255, 255));
        player2name.setSelected(true);
        player2name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2nameActionPerformed(evt);
            }
        });
        getContentPane().add(player2name);
        player2name.setBounds(610, 250, 130, 50);

        tiescore.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        tiescore.setForeground(new java.awt.Color(255, 255, 255));
        tiescore.setText("0");
        tiescore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiescoreActionPerformed(evt);
            }
        });
        getContentPane().add(tiescore);
        tiescore.setBounds(710, 320, 80, 50);

        player2score.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        player2score.setForeground(new java.awt.Color(255, 255, 255));
        player2score.setText("0");
        player2score.setSelected(true);
        getContentPane().add(player2score);
        player2score.setBounds(730, 240, 70, 60);

        player1name.setFont(new java.awt.Font("Jurassic Park", 0, 48)); // NOI18N
        player1name.setForeground(new java.awt.Color(255, 255, 255));
        player1name.setName(""); // NOI18N
        getContentPane().add(player1name);
        player1name.setBounds(600, 160, 140, 60);

        player1score.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        player1score.setForeground(new java.awt.Color(255, 255, 255));
        player1score.setText("0");
        player1score.setSelected(true);
        getContentPane().add(player1score);
        player1score.setBounds(720, 140, 80, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tic/tac/toe/multiimage.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 920, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:

        if (this.p1 == 1 && this.p2 == 0 && pressed[6] == 0) {
            b7.setText("X");
            this.p1 = 0;
            this.p2 = 1;
            pressed[6] = 1;
            type[6] = 1;
            playturnSound();check();
        } else if (this.p1 == 0 && this.p2 == 1 && pressed[6] == 0) {
            this.p1 = 1;
            this.p2 = 0;
            pressed[6] = 1;
            b7.setText("O");
            type[6] = 0;
            playturnSound();check();
        }
        selectplayer();
    }//GEN-LAST:event_b7ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:

        if (this.p1 == 1 && this.p2 == 0 && pressed[1] == 0) {
            b2.setText("X");
            this.p1 = 0;
            this.p2 = 1;
            pressed[1] = 1;
            type[1] = 1;
            playturnSound();check();
        } else if (this.p1 == 0 && this.p2 == 1 && pressed[1] == 0) {
            this.p1 = 1;
            this.p2 = 0;
            pressed[1] = 1;
            b2.setText("O");
            type[1] = 0;
            playturnSound();check();
        }
        selectplayer();
    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:

        if (this.p1 == 1 && this.p2 == 0 && pressed[3] == 0) {
            b4.setText("X");
            this.p1 = 0;
            this.p2 = 1;
            pressed[3] = 1;
            type[3] = 1;
            playturnSound();check();
        } else if (this.p1 == 0 && this.p2 == 1 && pressed[3] == 0) {
            this.p1 = 1;
            this.p2 = 0;
            pressed[3] = 1;
            b4.setText("O");
            type[3] = 0;
            playturnSound();check();
        }
        selectplayer();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:

        if (this.p1 == 1 && this.p2 == 0 && pressed[4] == 0) {
            b5.setText("X");
            this.p1 = 0;
            this.p2 = 1;
            pressed[4] = 1;
            type[4] = 1;
            playturnSound();check();
        } else if (this.p1 == 0 && this.p2 == 1 && pressed[4] == 0) {
            this.p1 = 1;
            this.p2 = 0;
            pressed[4] = 1;
            b5.setText("O");
            type[4] = 0;
            playturnSound();check();
        }
        selectplayer();
    }//GEN-LAST:event_b5ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:

        if (this.p1 == 1 && this.p2 == 0 && pressed[7] == 0) {
            b8.setText("X");
            this.p1 = 0;
            this.p2 = 1;
            pressed[7] = 1;
            type[7] = 1;
            playturnSound();check();
        } else if (this.p1 == 0 && this.p2 == 1 && pressed[7] == 0) {
            this.p1 = 1;
            this.p2 = 0;
            pressed[7] = 1;
            b8.setText("O");
            type[7] = 0;
            playturnSound();check();
        }
        selectplayer();
    }//GEN-LAST:event_b8ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:

        if (this.p1 == 1 && this.p2 == 0 && pressed[2] == 0) {
            b3.setText("X");
            this.p1 = 0;
            this.p2 = 1;
            pressed[2] = 1;
            type[2] = 1;
            playturnSound();check();
        } else if (this.p1 == 0 && this.p2 == 1 && pressed[2] == 0) {
            this.p1 = 1;
            this.p2 = 0;
            pressed[2] = 1;
            b3.setText("O");
            type[2] = 0;
            playturnSound();check();
        }
        selectplayer();
    }//GEN-LAST:event_b3ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:

        if (this.p1 == 1 && this.p2 == 0 && pressed[5] == 0) {
            b6.setText("X");
            this.p1 = 0;
            this.p2 = 1;
            pressed[5] = 1;
            type[5] = 1;
            playturnSound();check();
        } else if (this.p1 == 0 && this.p2 == 1 && pressed[5] == 0) {
            this.p1 = 1;
            this.p2 = 0;
            pressed[5] = 1;
            b6.setText("O");
            type[5] = 0;
            playturnSound();check();
        }
        selectplayer();
    }//GEN-LAST:event_b6ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:

        if (this.p1 == 1 && this.p2 == 0 && pressed[8] == 0) {
            b9.setText("X");
            this.p1 = 0;
            this.p2 = 1;
            pressed[8] = 1;
            type[8] = 1;
            playturnSound();check();
        } else if (this.p1 == 0 && this.p2 == 1 && pressed[8] == 0) {
            this.p1 = 1;
            this.p2 = 0;
            pressed[8] = 1;
            b9.setText("O");
            type[8] = 0;
            playturnSound();check();
        }
        selectplayer();
    }//GEN-LAST:event_b9ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        if (this.p1 == 1 && this.p2 == 0 && pressed[0] == 0) {
            b1.setText("X");
            this.p1 = 0;
            this.p2 = 1;
            pressed[0] = 1;
            type[0] = 1;
            playturnSound();check();
        } else if (this.p1 == 0 && this.p2 == 1 && pressed[0] == 0) {
            this.p1 = 1;
            this.p2 = 0;
            pressed[0] = 1;
            b1.setText("O");
            type[0] = 0;
            playturnSound();check();
        }
        selectplayer();
    }//GEN-LAST:event_b1ActionPerformed

    private void newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameActionPerformed

        // TODO add your handling code here:
        /*Players play =new Players();
        play.setVisible(true);
        this.setVisible(false);*/
        playturnSound();
        clear();
        EnableButtons();
        NewGame();
        //player1score.setText("0");
        //player2score.setText("0");
    }//GEN-LAST:event_newgameActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        playturnSound();
        Players play =new Players();
        play.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void player2nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player2nameActionPerformed

    private void tiescoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiescoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiescoreActionPerformed

    
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
            java.util.logging.Logger.getLogger(MultiGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultiGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultiGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultiGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiGame().setVisible(true);
            }
        });

    }
    public void playtieSound() 
    {
        try
        {
            InputStream inputStream = getClass().getResourceAsStream("/tic/tac/toe/tie.wav");
            AudioStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        }
        catch (Exception e)
        {
            System.out.println("ERROR");
        }
    }
    public void playwinSound() 
    {
        try
        {
            InputStream inputStream = getClass().getResourceAsStream("/tic/tac/toe/win.wav");
            AudioStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        }
        catch (Exception e)
        {
            System.out.println("ERROR");
        }
    }
    
    public void playturnSound()
    {
        try
        {
            InputStream inputStream = getClass().getResourceAsStream("/tic/tac/toe/turn.wav");
            AudioStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        }
        catch (Exception e)
        {
            System.out.println("ERROR");
        }
    }
    public void CustomCursor() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage(getClass().getResource("/tic/tac/toe/cursor.png"));
        Point point = new Point(0,0);
        Cursor cursorR = toolkit.createCustomCursor(img, point, "cursor.png");
        
        setCursor(cursorR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton msgbutton;
    private javax.swing.JButton newgame;
    private javax.swing.JButton player1name;
    private javax.swing.JButton player1score;
    private javax.swing.JButton player2name;
    private javax.swing.JButton player2score;
    private javax.swing.JButton tiescore;
    // End of variables declaration//GEN-END:variables
}
