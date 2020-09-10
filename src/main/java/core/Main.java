/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.time.LocalDateTime;
import java.util.Timer;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import user_interface.Login;
import logging.Logger;

/**
 *
 * @author Melvin
 */
public class Main {

    Logger log_class = new Logger();
    LocalDateTime current_time = LocalDateTime.now();

    public static void main(String args[]) {
        Main main_class = new Main();

        main_class.changeLookAndFeel();
        main_class.initiateLogin();
        main_class.sendTime();

        Timer timer = new Timer();
        timer.schedule(new TimeManager(), 0, 1000);

    }

    private void changeLookAndFeel() {

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            log_class.GET_LOG_MESSAGE(e.toString());
        }

    }

    private void initiateLogin() {
        Login login_mask = new Login();
        login_mask.setVisible(true);
    }

    private void sendTime() {
        log_class.receiveTime(current_time);
    }

}
