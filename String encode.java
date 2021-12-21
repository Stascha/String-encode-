import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class GFG1 
{
    public static String encode(String input)
    {
        if(input == null || input.length() == 0 )
            return " ";
            
        StringBuilder sb = new StringBuilder();
            
        char[] inputChars = input.toCharArray();
        int counter = 0;
        char prevChar = inputChars[0];
        
        for(char c : inputChars)
        {
            if(c == prevChar)
                counter++;
            else
            {
                sb.append(counter).append(prevChar);
                prevChar = c;
                counter = 1;
            }
            
        }
        
        sb.append(counter).append(prevChar);
        
        return sb.toString();
            
    }    
    
	public static void main(String[] argv)
	{
	    String in = "AAAABBBCCCCSSSSSSSMM";
	    String s = encode(in);
	    System.out.println(s);
	    
	}
  
}

        
