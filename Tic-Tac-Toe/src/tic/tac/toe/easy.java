/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.InputStream;
import java.util.Random;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author iiita
 */
public class easy extends javax.swing.JFrame {

    private int b[][] = new int[3][3];
    private int type[][] = new int[3][3];
    private int xs = 0, s0 = 0, es = 0;
    Random ran = new Random();
    private int playerScore = 0, ComputerScore = 0, tie = 0;
    private String pname,cname;

    /**
     * Creates new form hard
     */
    public easy(String playerName) {
        CustomCursor();
        initComponents();
        setSize(900, 600);
        setLocation(225, 75);
        clear();
        setTitle("TIC-TAC-TOE");
        playerscore.setText("0");
        computerscore.setText("0");
        tiescore.setText("0");
        background.setText(playerName);
        setResizable(false);
        this.pname=playerName;
        playername.setText(pname);
       // cname="COMPUTER";
//        computer.setText(cname);
        
        msg.setOpaque(false);
        msg.setContentAreaFilled(false);
        msg.setBorderPainted(false);
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
        playername.setOpaque(false);
        playername.setContentAreaFilled(false);
        playername.setBorderPainted(false);
//        computer.setOpaque(false);
//        computer.setContentAreaFilled(false);
//        computer.setBorderPainted(false);
        playerscore.setOpaque(false);
        playerscore.setContentAreaFilled(false);
        playerscore.setBorderPainted(false);
        computerscore.setOpaque(false);
        computerscore.setContentAreaFilled(false);
        computerscore.setBorderPainted(false);
        tiescore.setOpaque(false);
        tiescore.setContentAreaFilled(false);
        tiescore.setBorderPainted(false);
        home.setOpaque(false);
        home.setContentAreaFilled(false);
        home.setBorderPainted(false);
        newgame.setOpaque(false);
        newgame.setContentAreaFilled(false);
        newgame.setBorderPainted(false);
        
    }
    
    public easy() {
        CustomCursor();
        initComponents();
        setSize(900, 600);
        setLocation(225, 75);
        clear();
        playerscore.setText("0");
        computerscore.setText("0");
        tiescore.setText("0");
    }
    
    private void clear() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.type[i][j] = 2;
                SetEmpty(i, j);
            }
        }
        msg.setText("");
    }

    private int draw() {
        int flag = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.type[i][j] == 2) {
                    flag = 1;
                    break;
                }
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

    private void SetEmpty(int i, int j) {
        if (i == 0 && j == 0) {
            b1.setText("");
        }
        if (i == 0 && j == 1) {
            b2.setText("");
        }
        if (i == 0 && j == 2) {
            b3.setText("");
        }
        if (i == 1 && j == 0) {
            b4.setText("");
        }
        if (i == 1 && j == 1) {
            b5.setText("");
        }
        if (i == 1 && j == 2) {
            b6.setText("");
        }
        if (i == 2 && j == 0) {
            b7.setText("");
        }
        if (i == 2 && j == 1) {
            b8.setText("");
        }
        if (i == 2 && j == 2) {
            b9.setText("");
        }
    }

    private void print(int i, int j) {
        if (i == 0 && j == 0) {
            b1.setText("O");
        }
        if (i == 0 && j == 1) {
            b2.setText("O");
        }
        if (i == 0 && j == 2) {
            b3.setText("O");
        }
        if (i == 1 && j == 0) {
            b4.setText("O");
        }
        if (i == 1 && j == 1) {
            b5.setText("O");
        }
        if (i == 1 && j == 2) {
            b6.setText("O");
        }
        if (i == 2 && j == 0) {
            b7.setText("O");
        }
        if (i == 2 && j == 1) {
            b8.setText("O");
        }
        if (i == 2 && j == 2) {
            b9.setText("O");
        }
    }

    private int computer() {
      
        
        for (int i = 0; i < 3; i++) {
            s0 = 0;
            xs = 0;
            es = 0;
            for (int j = 0; j < 3; j++) {
                if (this.type[i][j] == 0) {
                    s0++;
                }
                if (this.type[i][j] == 1) {
                    xs++;
                }
                if (this.type[i][j] == 2) {
                    es++;
                }
            }
            if (xs == 2 && es == 1) {
                // System.out.println("5");
                for (int j = 0; j < 3; j++) {
                    if (this.type[i][j] == 2) {
                        this.type[i][j] = 0;
                        print(i, j);
                        return 0;
                    }
                }
            }
        }
        for (int j = 0; j < 3; j++) {
            s0 = 0;
            xs = 0;
            es = 0;
            for (int i = 0; i < 3; i++) {
                if (this.type[i][j] == 0) {
                    s0++;
                }
                if (this.type[i][j] == 1) {
                    xs++;
                }
                if (this.type[i][j] == 2) {
                    es++;
                }
            }
            if (xs == 2 && es == 1) {
                // System.out.println("6");
                for (int i = 0; i < 3; i++) {
                    if (this.type[i][j] == 2) {
                        this.type[i][j] = 0;
                        print(i, j);
                        return 0;
                    }
                }
            }
        }
        s0 = 0;
        xs = 0;
        es = 0;
        for (int i = 0; i < 3; i++) {
            if (this.type[i][i] == 0) {
                s0++;
            }
            if (this.type[i][i] == 1) {
                xs++;
            }
            if (this.type[i][i] == 2) {
                es++;
            }
        }
        if (xs == 2 && es == 1) {
            // System.out.println("7");
            for (int i = 0; i < 3; i++) {
                if (this.type[i][i] == 2) {
                    this.type[i][i] = 0;
                    print(i, i);
                    return 0;
                }
            }
        }

        s0 = 0;
        xs = 0;
        es = 0;
        for (int i = 0; i < 3; i++) {
            if (this.type[2 - i][i] == 0) {
                s0++;
            }
            if (this.type[2 - i][i] == 1) {
                xs++;
            }
            if (this.type[2 - i][i] == 2) {
                es++;
            }
        }
        if (xs == 2 && es == 1) {
            //System.out.println("8");
            for (int i = 0; i < 3; i++) {
                if (this.type[2 - i][i] == 2) {
                    this.type[2 - i][i] = 0;
                    print(2 - i, i);
                    return 0;
                }
            }
        }

      

        //EASY PART STARTS
        int randomi = ran.nextInt(3);
        int randomj = ran.nextInt(3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.type[(randomi + i) % 3][(randomj + j) % 3] == 2) {
                  
                    this.type[(randomi + i) % 3][(randomj + j) % 3] = 0;
                    print((randomi + i) % 3, (randomj + j) % 3);
                    return 0;
                }
            }
        }
        //EASY PART ENDS

        return 0;
    }

    private int checkBoard() {
        for (int i = 0; i < 3; i++) {
            if (this.type[i][0] == this.type[i][1] && this.type[i][1] == this.type[i][2] && this.type[i][1] != 2) {
                return 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (this.type[0][i] == this.type[1][i] && this.type[1][i] == this.type[2][i] && this.type[1][i] != 2) {
                return 1;
            }
        }
        if (this.type[0][0] == this.type[1][1] && this.type[1][1] == this.type[2][2] && this.type[1][1] != 2) {
            return 1;
        }
        if (this.type[0][2] == this.type[1][1] && this.type[1][1] == this.type[2][0] && this.type[1][1] != 2) {
            return 1;
        }
        return 0;
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
        b7 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        msg = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        newgame = new javax.swing.JButton();
        home = new javax.swing.JButton();
        playername = new javax.swing.JButton();
        playerscore = new javax.swing.JButton();
        computerscore = new javax.swing.JButton();
        tiescore = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        b1.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b1.setForeground(new java.awt.Color(179, 166, 0));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(32, 76, 130, 130);

        b7.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b7.setForeground(new java.awt.Color(179, 166, 0));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(22, 358, 150, 136);

        b2.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b2.setForeground(new java.awt.Color(179, 166, 0));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(188, 70, 140, 130);

        b4.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b4.setForeground(new java.awt.Color(179, 166, 0));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(32, 218, 140, 120);

        b5.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b5.setForeground(new java.awt.Color(179, 166, 0));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(188, 222, 140, 110);

        b8.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b8.setForeground(new java.awt.Color(179, 166, 0));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(200, 367, 120, 130);

        b3.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b3.setForeground(new java.awt.Color(179, 166, 0));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(348, 70, 130, 120);

        b6.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b6.setForeground(new java.awt.Color(179, 166, 0));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(348, 212, 130, 130);

        msg.setFont(new java.awt.Font("Jurassic Park", 0, 36)); // NOI18N
        msg.setForeground(new java.awt.Color(223, 135, 35));
        getContentPane().add(msg);
        msg.setBounds(10, 519, 529, 50);

        b9.setFont(new java.awt.Font("DejaVu Sans Light", 1, 65)); // NOI18N
        b9.setForeground(new java.awt.Color(179, 166, 0));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9);
        b9.setBounds(338, 361, 150, 130);

        newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameActionPerformed(evt);
            }
        });
        getContentPane().add(newgame);
        newgame.setBounds(609, 402, 80, 50);

        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home);
        home.setBounds(717, 402, 80, 50);

        playername.setFont(new java.awt.Font("Jurassic Park", 0, 48)); // NOI18N
        playername.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(playername);
        playername.setBounds(602, 161, 140, 50);

        playerscore.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        playerscore.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(playerscore);
        playerscore.setBounds(745, 141, 60, 60);

        computerscore.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        computerscore.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(computerscore);
        computerscore.setBounds(745, 252, 60, 50);

        tiescore.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        tiescore.setForeground(new java.awt.Color(255, 255, 255));
        tiescore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiescoreActionPerformed(evt);
            }
        });
        getContentPane().add(tiescore);
        tiescore.setBounds(719, 323, 60, 50);

        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tic/tac/toe/singleplayerimage.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here
        if (type[0][0] == 2) {
            b1.setText("X");playturnSound();
            type[0][0] = 1;
            if (checkBoard() == 1) {
                msg.setText(pname +"  wins");playwinSound();
                this.playerScore++;
                playerscore.setText(String.valueOf(this.playerScore));
                disableButtons();
            } else {
                if (draw() == 0) {
                    msg.setText("ITS A TIE !");playtieSound();
                    this.tie++;
                    tiescore.setText(String.valueOf(this.tie));
                    disableButtons();
                } else {
                    playturnSound();computer();
                    if (checkBoard() == 1) {
                        msg.setText("Computer wins");playloseSound();
                        this.ComputerScore++;
                        computerscore.setText(String.valueOf(this.ComputerScore));
                        disableButtons();
                    }
                }
            }

        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        if (type[2][0] == 2) {
            b7.setText("X");playturnSound();
            type[2][0] = 1;
            if (checkBoard() == 1) {
                msg.setText(pname +"  wins");playwinSound();
                this.playerScore++;
                playerscore.setText(String.valueOf(this.playerScore));
                disableButtons();
            } else {
                if (draw() == 0) {
                    msg.setText("ITS A TIE !");playtieSound();
                    this.tie++;
                    tiescore.setText(String.valueOf(this.tie));
                    disableButtons();
                } else {
                    playturnSound();computer();
                    if (checkBoard() == 1) {
                        msg.setText("Computer wins");playloseSound();
                        this.ComputerScore++;
                        computerscore.setText(String.valueOf(this.ComputerScore));
                        disableButtons();
                    }
                }
            }

        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        if (type[0][1] == 2) {
            b2.setText("X");playturnSound();
            type[0][1] = 1;
            if (checkBoard() == 1) {
                msg.setText(pname +"  wins");playwinSound();
                this.playerScore++;
                playerscore.setText(String.valueOf(this.playerScore));
                disableButtons();
            } else {
                if (draw() == 0) {
                    msg.setText("ITS A TIE !");playtieSound();
                    this.tie++;
                    tiescore.setText(String.valueOf(this.tie));
                    disableButtons();
                } else {
                    playturnSound();computer();
                    if (checkBoard() == 1) {
                        msg.setText("Computer wins");playloseSound();
                        this.ComputerScore++;
                        computerscore.setText(String.valueOf(this.ComputerScore));
                        disableButtons();
                    }
                }
            }

        }

    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        if (type[1][0] == 2) {
            b4.setText("X");playturnSound();
            type[1][0] = 1;
            if (checkBoard() == 1) {
                msg.setText(pname +"  wins");playwinSound();
                this.playerScore++;
                playerscore.setText(String.valueOf(this.playerScore));
                disableButtons();
            } else {
                if (draw() == 0) {
                    msg.setText("ITS A TIE !");playtieSound();
                    this.tie++;
                    tiescore.setText(String.valueOf(this.tie));
                    disableButtons();
                } else {
                    playturnSound();computer();
                    if (checkBoard() == 1) {
                        msg.setText("Computer wins");playloseSound();
                        this.ComputerScore++;
                        computerscore.setText(String.valueOf(this.ComputerScore));
                        disableButtons();
                    }
                }
            }

        }

    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        if (type[1][1] == 2) {
            b5.setText("X");playturnSound();
            type[1][1] = 1;
            if (checkBoard() == 1) {
                msg.setText(pname +"  wins");playwinSound();
                this.playerScore++;
                playerscore.setText(String.valueOf(this.playerScore));
                disableButtons();
            } else {
                if (draw() == 0) {
                    msg.setText("ITS A TIE !");playtieSound();
                    this.tie++;
                    tiescore.setText(String.valueOf(this.tie));
                    disableButtons();
                } else {
                    playturnSound();computer();
                    if (checkBoard() == 1) {
                        msg.setText("Computer wins");playloseSound();
                        this.ComputerScore++;
                        computerscore.setText(String.valueOf(this.ComputerScore));
                        disableButtons();
                    }
                }
            }

        }

    }//GEN-LAST:event_b5ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        if (type[2][1] == 2) {
            b8.setText("X");playturnSound();
            type[2][1] = 1;
            if (checkBoard() == 1) {
                msg.setText(pname +"  wins");playwinSound();
                this.playerScore++;
                playerscore.setText(String.valueOf(this.playerScore));
                disableButtons();
            } else {
                if (draw() == 0) {
                    msg.setText("ITS A TIE !");playtieSound();
                    this.tie++;
                    tiescore.setText(String.valueOf(this.tie));
                    disableButtons();
                } else {
                    playturnSound();computer();
                    if (checkBoard() == 1) {
                        msg.setText("Computer wins");playloseSound();
                        this.ComputerScore++;
                        computerscore.setText(String.valueOf(this.ComputerScore));
                        disableButtons();
                    }
                }
            }

        }

    }//GEN-LAST:event_b8ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        if (type[0][2] == 2) {
            b3.setText("X");playturnSound();
            type[0][2] = 1;
            if (checkBoard() == 1) {
                msg.setText(pname +"  wins");playwinSound();
                this.playerScore++;
                playerscore.setText(String.valueOf(this.playerScore));
                disableButtons();
            } else {
                if (draw() == 0) {
                    msg.setText("ITS A TIE !");playtieSound();
                    this.tie++;
                    tiescore.setText(String.valueOf(this.tie));
                    disableButtons();
                } else {
                    playturnSound();computer();
                    if (checkBoard() == 1) {
                        msg.setText("Computer wins");playloseSound();
                        this.ComputerScore++;
                        computerscore.setText(String.valueOf(this.ComputerScore));
                        disableButtons();
                    }
                }
            }

        }

    }//GEN-LAST:event_b3ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        if (type[1][2] == 2) {
            b6.setText("X");playturnSound();
            type[1][2] = 1;
            if (checkBoard() == 1) {
                msg.setText(pname +"  wins");playwinSound();
                this.playerScore++;
                playerscore.setText(String.valueOf(this.playerScore));
                disableButtons();
            } else {
                if (draw() == 0) {
                    msg.setText("ITS A TIE !");playtieSound();
                    this.tie++;
                    tiescore.setText(String.valueOf(this.tie));
                    disableButtons();
                } else {
                    playturnSound();computer();
                    if (checkBoard() == 1) {
                        msg.setText("Computer wins");playloseSound();
                        this.ComputerScore++;
                        computerscore.setText(String.valueOf(this.ComputerScore));
                        disableButtons();
                    }
                }
            }

        }

    }//GEN-LAST:event_b6ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        if (type[2][2] == 2) {
            b9.setText("X");playturnSound();
            type[2][2] = 1;
            if (checkBoard() == 1) {
                msg.setText(pname +"  wins");
                playwinSound();
                this.playerScore++;
                playerscore.setText(String.valueOf(this.playerScore));
                disableButtons();
            } else {
                if (draw() == 0) {
                    msg.setText("ITS A TIE !");playtieSound();
                    this.tie++;
                    tiescore.setText(String.valueOf(this.tie));
                    disableButtons();
                } else {
                    playturnSound();computer();
                    if (checkBoard() == 1) {
                        msg.setText("Computer wins");playloseSound();
                        this.ComputerScore++;
                        computerscore.setText(String.valueOf(this.ComputerScore));
                        disableButtons();
                    }
                }
            }

        }

    }//GEN-LAST:event_b9ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        playturnSound();
        Players play = new Players();
        play.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameActionPerformed
        // TODO add your handling code here:
        playturnSound();
        clear();
        EnableButtons();
        msg.setText("");
    }//GEN-LAST:event_newgameActionPerformed

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
            java.util.logging.Logger.getLogger(hard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hard().setVisible(true);
            }
        });

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
    public void playloseSound() 
    {
        try
        {
            InputStream inputStream = getClass().getResourceAsStream("/tic/tac/toe/lose.wav");
            AudioStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        }
        catch (Exception e)
        {
            System.out.println("ERROR");
        }
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
        Cursor cursorR = toolkit.createCustomCursor(img, point, "cursor");
        
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
    private javax.swing.JLabel background;
    private javax.swing.JButton computerscore;
    private javax.swing.JButton home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton msg;
    private javax.swing.JButton newgame;
    private javax.swing.JButton playername;
    private javax.swing.JButton playerscore;
    private javax.swing.JButton tiescore;
    // End of variables declaration//GEN-END:variables
}
