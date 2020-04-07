import java.util.*;
import java.util.Scanner;

public class testStringOperations {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1:");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2:");
        String s2 = sc.nextLine();
        List<String> al = stringOpr(s1,s2);
        System.out.println(al);
    }
    
    public static List<String> stringOpr(String s1,String s2){
        List<String> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        //sb.append(s1);
        // 1. First Logic replace String s1 alternate position with string s2
        for(int i=1;i<s1.length();i=i+2){
            sb.append(s2);
            sb.append(s1.charAt(i));
        }
        al.add(sb.toString());
        
        // 2. If s2 appears more than once in s1, replace that last occurrence of s2 
        //    with the reverse of s2, else return s1+s2
        int c = s1.split(s2, -1).length - 1;
        if (c > 1)
            al.add(s1.substring(0, s1.lastIndexOf(s2)) + new StringBuilder(s2).reverse());
        else
            al.add(s1+s2);
             
        // 3. If s2 appears more than once in s1, delete the first occurrence of s2 in s1, else return s1
        
        if(c>1){
            al.add(s1.substring(0, s1.indexOf(s2)));
        }
        else 
            al.add(s1);
        
        // 4. Divide s2 into two halves and add first first half to the beginning of the s1 and second
        //    half to the end of s1.
        StringBuffer sb2 = new StringBuffer();
        int n2 = s2.length();
        if(n2%2!=0){
            sb2.append(s1.substring(0, (n2/2)+1));
            sb2.append(s2);
            sb2.append(s1.substring((n2/2)+1,n2));
        }
        else{
            sb2.append(s1.substring(0, n2/2));
            sb2.append(s2);
            sb2.append(s1.substring(n2/2, n2));
        }
        al.add(sb2.toString());
        
        // 5. if s1 contains characters that is in s2 change all such characters to *
        StringBuffer sb3 = new StringBuffer();
        for(int i=0;i<s1.length();i++){
            if(s2.indexOf(s1.charAt(i))!=-1)
                sb3.append('*');
            else
                sb3.append(s1.charAt(i));
        }
        
        al.add(sb3.toString());
        return al;
    }
}
