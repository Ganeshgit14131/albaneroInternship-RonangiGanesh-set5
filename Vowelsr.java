public class Vowelsr 
{
    public static void main(String[] args) 
    {
		
        String s = "Anvitha";
        System.out.println("String Before removing vowel : "+s);
        String s1 = "";
        s1 = s.replaceAll("[aeiouAEIOU]", ""); 
        System.out.println("String after removing vowel : "+s1); 
	}
    
}
