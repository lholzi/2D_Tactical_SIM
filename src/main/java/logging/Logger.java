/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logging;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.nio.file.Path;

/**
 *
 * @author Melvin
 */
public class Logger {

    String log_message = new String();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    Path log_path;
    File log_fileObj = new File("src/main/java/logs/event_log.txt");
    
    public static LocalDateTime time;

    public void GET_LOG_MESSAGE(String message) {

        try {
            log_message = message;
            writeFile();
            writeLogMessageToFile(log_message);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Logger.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void writeFile() throws IOException {

        if (log_fileObj.createNewFile()) {
            System.out.println("File created: " + log_fileObj.getName());
        } else {
            System.out.println("File already exists.");

        }

    }

    private void writeLogMessageToFile(String message_content) {
        try {            
            
            String message = dtf.format(time) + " >> " + message_content;

            FileWriter fileWritter = new FileWriter(log_fileObj, true);
            BufferedWriter bw = new BufferedWriter(fileWritter);

            bw.write(message);
            bw.write("\n");
            bw.close();

        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Logger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void receiveTime(LocalDateTime time) {
        this.time = time;
    }
}
