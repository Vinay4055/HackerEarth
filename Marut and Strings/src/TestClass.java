import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testcase = br.readLine();
        int T =Integer.parseInt(testcase);
        while(T-->0)
        {
        	String s= br.readLine();
        	int Uppercount=0;
        	
        	char[] arr=s.toCharArray();
        	for(int i=0;i<arr.length;i++)
        	{
        		if(arr[i]>'A' && arr[i]<'Z')
        		{
        			
        		}
        	}
        }
    }
}