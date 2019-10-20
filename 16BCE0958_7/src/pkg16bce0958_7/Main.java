package pkg16bce0958_7;
/**
 *
 * @author richaranjan
 */

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    try
    {
    System.out.println("Enter your Regestration  Number:");
    String rn = sc.next();
    System.out.println("Enter your Mobile  Number:");
    String mn = sc.next();
    char[] chr = rn.toCharArray();
    char[] chm = mn.toCharArray();

    if(chr.length!=9 || chm.length!=10)
    {
        throw new IllegalArgumentException();
    }
    for(int i=0;i<chm.length;i++)
    {
        if(!Character.isDigit(chm[i]))
        {
            throw new NumberFormatException();
        }
    }
    for(int i=0;i<chr.length;i++)
    {
        if(!Character.isDigit(chr[i]) && !Character.isLetter(chr[i]))
        {
            throw new NoSuchElementException();
        }
    }
    
    System.out.println("Valid");
}

    
    catch(NumberFormatException e)
    {
         System.out.println("Invalid_1");
    }
    
    catch(IllegalArgumentException e)
    {
         System.out.println("Invalid_2");
    }
    
    catch(NoSuchElementException e)
    {
        System.out.println("Invalid_3");
    }
    
    }
    
}