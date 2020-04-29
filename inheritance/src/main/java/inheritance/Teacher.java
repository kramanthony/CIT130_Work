/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import java.util.Objects;
import java.util.Random;
/**
 *
 * @author Mark
 */
public class Teacher {
    
    private final String janJobHallway = "Job: Hallways";
    private final String janJobBathroom = "Job: Bathrooms";
    public String janJob;
    
    public void janRandomJobPicker(String janJob) {
        Random rand = new Random();
        int randJob = rand.nextInt(1);
        if(randJob == 1) {
            this.janJob = this.janJobBathroom;
            
        }else if(randJob == 0){
            this.janJob = this.janJobHallway;
        } // close else if
    } // close janRandomJobPicker
    
    public void janRandomHourPicker(int randHours) {
        Random rand = new Random();
        int hours = rand.nextInt(45);
        randHours = hours;
    } // close janRandomHourPicker
} // close teacher class
