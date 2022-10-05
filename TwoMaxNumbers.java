public class TwoMaxNumbers 
{
 
    public void printTwoMaxNumbers(int[] nums)
    {
        int maxOne = 0;
        int maxTwo = 0;
        for(int n:nums)
        {
            if(maxOne < n){
                maxTwo = maxOne;
                maxOne =n;
            } else if(maxTwo < n){
                maxTwo = n;
            }
        }
        System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
    }
     
    public static void main(String a[]){
        int num[] = {3,1,8,72,34};
        TwoMaxNumbers tmn = new TwoMaxNumbers();
        tmn.printTwoMaxNumbers(num);
    }
}