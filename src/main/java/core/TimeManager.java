/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.time.LocalDateTime;
import java.util.TimerTask;

/**
 *
 * @author Melvin
 */
public class TimeManager extends TimerTask {
    
    public static LocalDateTime local_time;
    

    @Override
    public void run() {
        //TODO: Implement function so that the time updated from latest time and does not overwrite with newest time when clicking "START" after "BREAK"
        
        LocalDateTime current_time = LocalDateTime.now();                    
        local_time = current_time;                
    }
    
    public LocalDateTime receiveTime() {        
        return local_time;
    }

}
