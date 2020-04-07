import java.util.*;
import java.util.Map.*;
class card{
    char s;
    int n;
    card(){}
    public card(char s, int n){
        this.s = s;
        this.n = n;
    }
    
    public char getSymbol(){
        return s;
    }
    public int getNumber(){
        return n;
    }
}

public class testcard {
    public static void main(String args[]){
        char ch;
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number of cards : ");
        
        int n = sc.nextInt();
        
        Map<Character,ArrayList<card>> t = new TreeMap<>();
        
        for(int i=1;i<=n;i++){
            System.out.println();
            System.out.println("Enter card "+i);
            ch = sc.next().charAt(0);
            num = sc.nextInt();
            card obj = new card(ch,num);
            if(t.containsKey(ch)){
                ArrayList<card> al = t.get(ch);
                al.add(obj);
            }
            else{
                ArrayList<card> al = new ArrayList<>();
                al.add(obj);
                t.put(ch, al);
            }
        }
        System.out.println("Distinct Symbols are : ");
        Set<Entry<Character,ArrayList<card>>> set = t.entrySet();
        Iterator<Entry<Character,ArrayList<card>>> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getKey()+" ");
        }
        set = t.entrySet();
        it = set.iterator();
        while(it.hasNext()){
            int sum = 0;
            Map.Entry<Character,ArrayList<card>> me = it.next();
            ArrayList<card> al = me.getValue();
            
            System.out.println("Cards in "+me.getKey()+" Symbol");
            for(card obj : al){
                if(obj.getSymbol()==me.getKey()){
                    System.out.println(obj.getSymbol()+" "+obj.getNumber());
                    sum+=obj.getNumber();
                }
            }
            
            System.out.println("Number of cards : "+al.size());
            System.out.println("Sum of Number : "+sum);
        }
        
    }
}
