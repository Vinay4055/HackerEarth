
import java.io.BufferedReader;
import java.io.InputStreamReader;


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
       // System.out.println((char)('a'+1));
        Scanner s = new Scanner(System.in);
        int whil=s.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                  Integer.parseInt("5");
        while(whil-->0)
        {
        //String name = s.nextLine(); 
        	
        String name = br.readLine();    
        //s.next();
        String lowercase=name.toLowerCase();
         StringBuilder sb=new StringBuilder();
         
        for(int i=0;i<name.length();i++)
        {
        	if(lowercase.charAt(i)!=' ')
        	{int ich=lowercase.charAt(i)-96;
        	sb.append(ich);
        	}
        	else if(lowercase.charAt(i)==' ')
        	{
        		
        	sb.append("$");
        	}
        }
        System.out.println(sb.toString());
        
    }
}
}