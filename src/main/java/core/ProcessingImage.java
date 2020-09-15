/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
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

    public static ArrayList<BufferedImage> readIcons() {
        
        final String path = "src/main/java/Icons/";
        return readIcons(path);
    }
    
    public static ArrayList<BufferedImage> readIcons(String path ) {

        File f = new File(path);
        File[] files = f.listFiles();
        ArrayList<BufferedImage> icons = new ArrayList<BufferedImage>();
        for (File currentFile : files) {
            System.out.println("FILE: " + currentFile);
            final String filePath = currentFile.getAbsolutePath();
            try {
                BufferedImage icon = ImageIO.read(new File(filePath));
                icons.add(icon);
            } catch (IOException ex) {
                Logger.getLogger(ProcessingImage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return icons;
    }
}
