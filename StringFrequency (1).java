import java.util.Scanner;

public class StringFrequency{
    
   public int CountsubString(String str , String sub){
       int count = 0;
       int index = 0;
       
       while(index >= 0){
           index = str.indexOf(sub , index);
           if(index >= 0){
               count++;
               index+=sub.length();
           }
       }
       return count;
   }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        StringFrequency obj = new StringFrequency();
        
        System.out.println("Enter the main String str1 : ");
        String str = scn.nextLine();
        
        System.out.println("Enter the subString str2 : ");
        String sub = scn.nextLine();
        
        int result = obj.CountsubString(str , sub);
        
        System.out.println("subString " + sub + " has appeared  " + result  + " times ");
        
        
    }
}