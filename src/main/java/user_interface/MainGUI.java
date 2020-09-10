/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_interface;

import core.TimeManager;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Melvin
 */
public class MainGUI extends javax.swing.JFrame {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    TimeManager timer_instance = new TimeManager();
    Timer timer = new Timer();

    public static LocalDateTime local_time;

    boolean break_pressed = false;

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        this.setSize(1280, 720);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        btn_BREAK.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_control = new javax.swing.JPanel();
        panel_actions = new javax.swing.JPanel();
        btn_START = new javax.swing.JButton();
        btn_BREAK = new javax.swing.JButton();
        panel_info = new javax.swing.JPanel();
        tf_TIME = new javax.swing.JTextField();
        label_time = new javax.swing.JLabel();
        panel_tda = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2D Tactical SIM");
        setPreferredSize(new java.awt.Dimension(1280, 720));

        panel_control.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panel_controlLayout = new javax.swing.GroupLayout(panel_control);
        panel_control.setLayout(panel_controlLayout);
        panel_controlLayout.setHorizontalGroup(
            panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );
        panel_controlLayout.setVerticalGroup(
            panel_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel_actions.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_START.setText("START");
        btn_START.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_STARTActionPerformed(evt);
            }
        });

        btn_BREAK.setText("BREAK");
        btn_BREAK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BREAKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_actionsLayout = new javax.swing.GroupLayout(panel_actions);
        panel_actions.setLayout(panel_actionsLayout);
        panel_actionsLayout.setHorizontalGroup(
            panel_actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_actionsLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panel_actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_BREAK)
                    .addComponent(btn_START))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panel_actionsLayout.setVerticalGroup(
            panel_actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_actionsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btn_START)
                .addGap(18, 18, 18)
                .addComponent(btn_BREAK)
                .addContainerGap(539, Short.MAX_VALUE))
        );

        panel_info.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tf_TIME.setEditable(false);
        tf_TIME.setText("00:00:00");

        label_time.setText("TIME:");

        javax.swing.GroupLayout panel_infoLayout = new javax.swing.GroupLayout(panel_info);
        panel_info.setLayout(panel_infoLayout);
        panel_infoLayout.setHorizontalGroup(
            panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_infoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label_time)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_TIME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(602, Short.MAX_VALUE))
        );
        panel_infoLayout.setVerticalGroup(
            panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_infoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_TIME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_time))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panel_tda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panel_tdaLayout = new javax.swing.GroupLayout(panel_tda);
        panel_tda.setLayout(panel_tdaLayout);
        panel_tdaLayout.setHorizontalGroup(
            panel_tdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_tdaLayout.setVerticalGroup(
            panel_tdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_tda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_actions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_control, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_actions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_tda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_STARTActionPerformed
        if (break_pressed == false) {
            timer.schedule(new Background_Processing(), 0, 1000);
            btn_START.setEnabled(false);
            btn_BREAK.setEnabled(true);
        } else if (break_pressed == true) {
            timer = new Timer();
            timer.schedule(new Background_Processing(), 0, 1000);
            btn_START.setEnabled(false);
            btn_BREAK.setEnabled(true);

        }
    }//GEN-LAST:event_btn_STARTActionPerformed

    private void btn_BREAKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BREAKActionPerformed
        timer.cancel();
        btn_BREAK.setEnabled(false);
        btn_START.setEnabled(true);
        break_pressed = true;
    }//GEN-LAST:event_btn_BREAKActionPerformed

    class Background_Processing extends TimerTask {

        public void run() {
            LocalDateTime current_time = timer_instance.receiveTime();
            local_time = current_time;
            updateTextFields();
        }

        private void updateTextFields() {

            tf_TIME.setText(dtf.format(local_time));
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BREAK;
    private javax.swing.JButton btn_START;
    private javax.swing.JLabel label_time;
    private javax.swing.JPanel panel_actions;
    private javax.swing.JPanel panel_control;
    private javax.swing.JPanel panel_info;
    private javax.swing.JPanel panel_tda;
    private javax.swing.JTextField tf_TIME;
    // End of variables declaration//GEN-END:variables
}