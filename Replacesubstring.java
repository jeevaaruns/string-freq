import java.util.Scanner();
public class Replacesubstring{
    
   public String replacestring(String str , String oldsub , String newsub){
       if(str == null || oldsub == null || newsub == null || oldsub.isEmpty()){
           return str;
       }
       StringBuilder replacestr = new StringBuilder();
       int startindex = 0;
       int findindex;
       
       while((findindex = str.indexOf(oldsub , startindex) != -1)){
           replacestr.append(str.substring(startindex , findindex));
           
           replacestr.append(newsub);
           
       }
       
       if(startindex < str.length()){
           replace.append(str.substring(startindex));
           
       }
       return replacetoString;
   }
    
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) { // Using try-with-resources

Replacesubstring obj = new Replacesubstring();

System.out.print("Enter the main string: ");

String str = sc.nextLine();

System.out.print("Enter the substring to replace: ");

String oldSub = sc.nextLine();

System.out.print("Enter the new substring: ");

String newSub = sc.nextLine();

String result = obj.replacestring(str, oldSub, newSub);

System.out.println("Modified string: " + result);

}

}
        
        
    }
}