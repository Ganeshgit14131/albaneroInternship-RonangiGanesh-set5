import java.util.ArrayList;
import java.util.List;
 
class FindOccurencesMain 
{
    public static void main(String[] args) 
    {
        String myString = "This is my code, it is in Java.";
        String mySubstring= "is";
        int count = 0, index = 0;
        List<Integer> indices=new ArrayList<>();
        while ((index = myString.indexOf(mySubstring, index)) != -1 ){
            count++;
            indices.add(index);
            index++;
        }
        System.out.println("Total occurrences of a substring in the given string: " + count);
        
    }
}
 