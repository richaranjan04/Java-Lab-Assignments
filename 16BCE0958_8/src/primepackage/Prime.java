
package primepackage;

/**
 *
 * @author richaranjan
 */
public class Prime {

    public boolean checkForPrime(int num)
    {
        int flag=0;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}