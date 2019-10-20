/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16bce0958_1;

/**
 *
 * @author richaranjan
 */
public class Main {

    public static void main(String[] args) {
        String fname = args[0];
        String lname = args[1];
        double weight = Integer.parseInt(args[2]);
        double height_cm = Integer.parseInt(args[3]);
        
        System.out.println("Name of the person is : "+fname+" "+lname);
        double height_m = height_cm/100;
        double sqr_height=height_m*height_m;
        
        double bmi = weight/sqr_height;
        System.out.println("BMI IS : "+bmi);
        if(bmi<18.5)
        {
            System.out.println("UnderWeight");
        }
        else if (bmi > 18.5 && bmi<25)
        {
            System.out.println("Normal(Healthy Weight)");
        }
        else if (bmi>=25 && bmi <30)
        {
            System.out.println("OverWeight");
        }
        else
        {
            System.out.println("Obese Class");
        }  
    }
    
}
