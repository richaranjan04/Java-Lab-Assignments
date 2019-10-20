package pkg16bce0958_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author richaranjan
 */
public class Donor {
    private String name;
    private String age;
    private String address;
    private String number;
    private String bg;
    private String date;
    
    public static void main(String[] args) throws IOException, ParseException{
        Scanner sc = new Scanner(System.in);
           
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        Donor arr[] = new Donor[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i] = new Donor();
            System.out.println("Enter Name : ");
            arr[i].name=sc.next();
            System.out.println("Enter Age : ");
            arr[i].age=sc.next();
            System.out.println("Enter Address : ");
            arr[i].address=sc.next();
            System.out.println("Enter Number : ");
            arr[i].number=sc.next();
            System.out.println("Enter Blood Group : ");
            arr[i].bg=sc.next();
            System.out.println("Enter Date DD/MM/yyyy format: ");
            arr[i].date=sc.next();
            
        }
        
        BufferedWriter bf = new BufferedWriter(new FileWriter("/Users/richaranjan/Desktop/16bce0958.txt"));
        
        for(int i=0;i<n;i++)
        {
            bf.write(arr[i].name+'\n');
            bf.write(arr[i].age+'\n');
            bf.write(arr[i].address+'\n');
            bf.write(arr[i].number+'\n');
            bf.write(arr[i].bg+'\n');
            bf.write(arr[i].date+'\n');
            
        }
        
        BufferedReader br = new BufferedReader(new FileReader("/Users/richaranjan/Desktop/16bce0958.txt"));
        String a = br.readLine();
        while(a!=null){
            String[] data = new String[6];
            for(int i=0;i<6;i++){
                data[i]=a;
                a=br.readLine();    
            }
            String dat = data[5];
            Date d = new SimpleDateFormat("dd/MM/yyyy").parse(dat);
            Date now = new Date();
            long difference =  (now.getTime()-d.getTime())/86400000;
            long month = difference/30;
            if(data[4].equals("A+") && Math.abs(month)>=6 ){
                
                System.out.println("Details whose blood group is ‘A+ve’ and had not donated for the recent six months. ");
                System.out.println("Name:"+data[0]);
                System.out.println("Age:"+data[1]);
                System.out.println("Address:"+data[2]);
                System.out.println("Number:"+data[3]);
                System.out.println("Blood Group:"+data[4]);
                System.out.println("Date:"+data[5]);
            }
            
        }
        bf.close();
        
    }    
    
}


class MyException extends Exception
{
    String str1;
    MyException(String str1)
    {
        str1=str2;
    }
    public string toString()
    {
        return str1;
    }
}

class Example
{
    public static void main(String[]args)
    {
        try
        {
            System.out.println("Exception");
            throws new MyException("Error");
        }
        catch(MyException e)
                {
                    System.out.println(e);
                    
                }
    }
}
        
