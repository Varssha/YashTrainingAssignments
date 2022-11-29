package ArrayPrograms;
// WAP to find the LCM and HCF of array numbers.
import java.lang.reflect.Array;

public class LCM_HCFArray {

	public static void main(String[] args) {
		int a[]={1, 2, 3, 4, 28};
		
        int lcm=1,first=lcm,result=0;
        
        for(int i=0;i<a.length;i++)
        {
            int second=a[i];
            lcm=(first*second)/gcd(first,second);
            first=lcm;
        }
        for(int j=0;j<a.length;j++)
        {
            result=gcd(result,a[j]);
        }
        System.out.println("lcm is "+lcm+" "+"gcd is "+result);
    }
    
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}