package pkg16bce0958_2;

import java.util.Scanner;

/**
 *
 * @author richaranjan
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of slow Readers in Batch-1 : ");
        int b1 = sc.nextInt();
        System.out.println("Enter number of slow Readers in Batch-2 : ");
        int b2 = sc.nextInt();
        System.out.println("Enter number of slow Readers in Batch-3 : ");
        int b3 = sc.nextInt();
        System.out.println("Enter number of slow Readers in Batch-4 : ");
        int b4 = sc.nextInt();
        
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        
        int arr[][] = new int[4][];
        
        if(b1%4==0)
        {
            c1=b1/4;
            arr[0]=new int[c1];
            for(int i=0;i<c1;i++)
            {
                arr[0][i] = 4;
            }
        }
        else
        {
            c1=(b1/4)+1;
            arr[0]=new int[c1];
            int i=0;
            for(i=0;i<c1-1;i++)
            {
                arr[0][i] = 4;
            }
            arr[0][c1-1]=b1-4*i;
        }
        
        if(b2%4==0)
        {
            c2=b2/4;
            arr[1]=new int[c2];
            for(int i=0;i<c2;i++)
            {
                arr[1][i] = 4;
            }
        }
        else
        {
            c2=(b2/4)+1;
            arr[1]=new int[c2];
            int i=0;
            for(i=0;i<c2-1;i++)
            {
                arr[1][i] = 4;
            }
            arr[1][c2-1]=b2-4*i;
        }
        
        if(b3%4==0)
        {
            c3=b3/4;
            arr[2]=new int[c3];
            for(int i=0;i<c3;i++)
            {
                arr[2][i] = 4;
            }
            
        }
        else
        {
            c3=(b3/4)+1;
            arr[2]=new int[c3];
            int i=0;
            for(i=0;i<c3-1;i++)
            {
                arr[2][i] = 4;
            }
            arr[2][c3-1]=b3-4*i;
        }
        
        if(b4%4==0)
        {
            c4=b4/4;
            arr[3]=new int[c4];
            for(int i=0;i<c4;i++)
            {
                arr[3][i] = 4;
            }
        }
        else
        {
            c4=(b4/4)+1;
            arr[3]=new int[c4];
            int i=0;
            for(i=0;i<c4-1;i++)
            {
                arr[3][i] = 4;
            }
            arr[3][c4-1]=b4-4*i;
        }

        
        System.out.println("The 2-D jagged array with 4 rows is as follows :");
        for (int[] u: arr) 
        {
            for (int elem: u) 
            {
                System.out.print(elem);
                
            }
            System.out.println(" ");
            
        }
        
        System.out.println("BaTch with has exactly each tutor with 4 students: ");
        int flag=0;
        int num=1;
        for (int[] u: arr) 
        {
            for (int elem: u) 
            {
                if(elem==4)
                {
                    flag=1;
                }
                else
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println("Batch"+num);    
            }
          num=num+1; 
        }
    }
    
}
