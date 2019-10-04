/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
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
        Scanner s = new Scanner(System.in);
        int tcase =s.nextInt();
        boolean pflag=false;
        while(tcase-->0)
        {
            String input=s.next();
           /* StringBuilder sb=new StringBuilder(input);
            sb.reverse();*/
            
            char[] arr=input.toCharArray();
            //StringBuilder sb=new StringBuilder();
            String sb="";
            for(int i=arr.length-1;i>=0;i--)
            {
             sb=sb+arr[i];
            }
            System.out.println(sb);
           
            if(input.equalsIgnoreCase(sb))
            {
                pflag=true;
            }
            if(input.length()%2==0 && pflag)
            System.out.println("YES EVEN");
            if(input.length()%2==1 && pflag)
            System.out.println("YES ODD");
            else if(pflag==false)
            System.out.println("NO");
            
        }
    }
}
