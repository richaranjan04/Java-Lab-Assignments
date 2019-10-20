/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16bce0958_3;

import java.util.Scanner;

/**
 *
 * @author richaranjan
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the equation :");
        String str = sc.nextLine();
        String[] arrOfStr = str.split("->", 2); 
        for(int i=0;i<arrOfStr.length;i++)
        {
            System.out.println(arrOfStr[i]);
        }
        
        
        System.out.println("Reactant side of elements and their Number of Moles :");
        String a = arrOfStr[0];
        String[] s = a.split("\\+", 2);
        int len = s.length;
        for(int i=0;i<len;i++)
            {
                if(Character.isDigit(s[i].charAt(0)))
                {
                    System.out.println("Moles of  "+s[i]+" is equal to "+s[i].charAt(0));
                }
                else
                {
                    System.out.println("Moles of "+s[i]+" is equal to "+1);
                }
            }
            
        System.out.println("Product side of elements and their Number of Moles :");
        String b = arrOfStr[1];
        String[] sb = b.split("\\+", 2);
        int len1 = sb.length;
        for(int i=0;i<len1;i++)
            {
                if(Character.isDigit(sb[i].charAt(0)))
                {
                    System.out.println("Moles of  "+sb[i]+" is equal to "+sb[i].charAt(0));
                }
                else
                {
                    System.out.println("Moles of "+sb[i]+" is equal to "+1);
                }
            }
            
    }
             
        
}
    
