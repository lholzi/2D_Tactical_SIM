/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Melvin
 */
public class ProcessingImage {

    BufferedImage[] icons_file = new BufferedImage[50];
    String path = "src/main/java/Icons/";

    int count = 0;

    public BufferedImage[] readIcons() {

        File f = new File(path);
        File[] files = f.listFiles();

        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                System.out.println("FILE: " + file);
                count++;
                String file_path = file.getAbsolutePath();
                try {
                    BufferedImage icon = ImageIO.read(new File(file_path));
                } catch (IOException ex) {
                    Logger.getLogger(ProcessingImage.class.getName()).log(Level.SEVERE, null, ex);
                }
                //TODO: Add Buffered Image to an array and return that array.
            }
        }

        return icons_file;
    }
}
