package MainClass;
import primepackage.*;

import java.util.Scanner;
/**
 *
 * @author richaranjan
 */

class TwinPrime{
    
    public int checktwin(int n)
    {
        Prime pm = new Prime();
        boolean temp = pm.checkForPrime(n);
        
        if(temp == true)
        {
            boolean temp2 = pm.checkForPrime(n+2);{
            if(temp2 == true)
            {
                return n;
            }
        }
            
        }
        return 0;
    }
}

public class MainClass {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting point: ");
        int s = sc.nextInt();
        System.out.println("Enter end point: ");
        int e = sc.nextInt();
        
        TwinPrime p = new TwinPrime();
        for(int i=s;i<=e-1;i++)
        {
            int pnum = p.checktwin(i);
            if(pnum >1)
            {
                int c = pnum+2;
                System.out.println("("+pnum+" "+c+")");
            }
            
        }
    }
    
}
