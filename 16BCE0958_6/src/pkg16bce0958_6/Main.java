package pkg16bce0958_6;

/**
 *
 * @author richaranjan
 */

import java.io.*;
import java.util.Scanner;

abstract class Themepark{
    int af=500;
    int cf=300;
     int total(int a,int c){
        int cost = 500*a+300*c;
        return cost;    
    }
     
     abstract void playgame(int n);
    
}

class Queensland extends Themepark
{
    
    boolean[] arr = new boolean[30];
    public Queensland()
    {
        for(int i=0;i<30;i++)
    {
        arr[i]=false;
    }
        
    }
    
    void playgame(int n)
    {
        if(arr[n]==false)
        {
            arr[n]=true;
        }
        else
        {
            System.out.println("Error!!");
        }
    }
    
    
    
}

class Wonderla extends Themepark
{
    int[] arr = new int[40];
    public Wonderla()
    {
       for(int i=0;i<40;i++)
       {
           arr[i]=0;
       }
    }
    
    void playgame(int n)
    {
        arr[n]=arr[n]+1;
    }
    
    void countgames()
    {
        int p=0;
        int u=0;
        for(int i=0;i<40;i++)
        {
            if(arr[i]>0)
            {
                p=p+1;
            }
            else
            {
                u=u+1;
            }
        }
        System.out.println("Number of Games Repeated are : "+p);
        System.out.println("Number of Games Unplayed are : "+u);
    }
    
}
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of adults :");
        int a = sc.nextInt();
        System.out.println("Enter number of childern :");
        int c = sc.nextInt();
        System.out.println("Enter the name of park :");
        String name = sc.next();
        
        if(name.equals("Queensland"))
        {
            Queensland q = new Queensland();
            int price = q.total(a,c);
            System.out.println("Total ticket cost : "+price);
            int n;
            int exit =1;
            while(exit ==1)
            {
                System.out.println("Enter the game number:");
                int num = sc.nextInt();
                q.playgame(num);
                System.out.println("Enter 0 to exit and 1 to continue :");
                exit = sc.nextInt();
            }
  
        }
        else
        {
            Wonderla w = new Wonderla();
            int price = w.total(a,c);
            System.out.println("Total ticket cost : "+price);
            
            int n;
            int exit =1;
            while(exit ==1)
            {
                System.out.println("Enter the game number:");
                int num = sc.nextInt();
                w.playgame(num);
                System.out.println("Enter 0 to exit and 1 to continue :");
                exit = sc.nextInt();
            }
            w.countgames();            
        }

    }
    
}