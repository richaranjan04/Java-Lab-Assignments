/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16bce0958_4;

import java.util.Scanner;

/**
 *
 * @author richaranjan
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a genome string : ");
        String str = sc.nextLine();
        int len = str.length();
        System.out.println("Genes in the genome are :");
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<=len;j++)
            {
                String s = str.substring(i,j);
                
                if(s.length()>=9 && s.substring(0,3).equals("ATG"))
                {
                    //System.out.println(s);
                    int t = s.length();
                    if(s.substring(t-3).equals("TAG") || s.substring(t-3).equals("TAA") || s.substring(t-3).equals("TGA"))
                    {
                        String temp = s.substring(3,t-3);
                        if(temp.length()%3==0)
                        {
                            System.out.println(temp);
                    }
                    }
                }
            }
        }
    }
    
}
