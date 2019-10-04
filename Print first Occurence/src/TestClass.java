import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class TestClass {

	@SuppressWarnings("resource")
	public static void main(String args[] ) throws Exception {
		Scanner sc=new Scanner(System.in);
		int tcase=sc.nextInt();
	//	String[] value=new String[tcase];
	/*	for(int i=0;i<tcase;i++)
		{
			System.out.println("Inside Outer loop");
			//sc.nextLine();
			value[i]=sc.nextLine();
			
		}
		for(String m:value)
		{
			System.out.println(m);
		}*/
		
		/*for(int i=0;i<tcase;i++)*/
		 while(tcase-->0)
		{
		String s=sc.next();
		Set<Character>set=new LinkedHashSet<Character>();
		char[] arr=s.toCharArray();
	
		for(char c:arr)
		{
			set.add(c);
		}
		Iterator<Character> it=set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		System.out.println();
	}
	}
}