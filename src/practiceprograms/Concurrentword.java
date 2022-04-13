package practiceprograms;
import java.io.*;

class Concurrentword {
 
static int countOccurrences(String str, String word)
{
    
    String a[] = str.split(" ");
 
    
    int count = 0;
    for (int i = 0; i < a.length; i++)
    {
    
    if (word.equals(a[i]))
        count++;
    }
 
    return count;
}
 

public static void main(String args[])
{
    String str = "I am Indian citizen..I live India India has 27 states ";
    String word = "India";
    System.out.println(countOccurrences(str, word));
}
}
 