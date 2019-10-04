/* IMPORTANT: Multiple classes and nested static classes are supported */

// uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        char[] Ar=A.toCharArray();
        char[] Br=B.toCharArray();
        boolean descendingCheck=true;
        boolean valueCheck=true;
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<A.length();i++)
        {
        	
            if(Ar[i]<=Br[i])
            {	
            	
                int cdiff=(int)Br[i]-(int)Ar[i];
            
                if(cdiff<=diff)
                diff=cdiff;
                else
                {
                	
                    descendingCheck=false;
                    break;
                }
            }
            else
            {
                valueCheck=false;
                break;
        
            }
        }
        if(descendingCheck && valueCheck)
        {
            System.out.println("YES");
        }
        else
    System.out.println("NO");
        
    }
}
