import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String s) {
        // Return the minimum number of characters to make the password strong
int count = 0;
		
		Pattern patternDigit = Pattern.compile("(\\d)");
		Pattern patternUpper = Pattern.compile("([A-Z])");
		Pattern patternLower = Pattern.compile("([a-z])");
		Pattern patternSpecial = Pattern.compile("(\\W)");
        
		Matcher matcherDigit = patternDigit.matcher(s);
		Matcher matcherUpper = patternUpper.matcher(s);
		Matcher matcherLower = patternLower.matcher(s);
		Matcher matcherSpecial = patternSpecial.matcher(s);
		
		if (!matcherDigit.find()) {
			count++;
		}
		if (!matcherUpper.find()) {
			count++;
		}
		if (!matcherLower.find()) {
			count++;
		}
		if (!matcherSpecial.find()) {
			count++;
		}
		if ((count+s.length())<6) {
			count = count + 6-(count+s.length());
		}
		return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

       System.out.println(answer);

        scanner.close();
    }
}
