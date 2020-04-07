import java.util.*;

class ques5countryCapital{
    TreeMap<String,String> m1 = new TreeMap<>();
    public TreeMap<String,String> saveCountryCapital(String CountryName, String capital){
        m1.put(CountryName,capital);
        return m1;
    }
    
    public String getCapital(String CountryName){
        String temp1="";
        if(m1.containsKey(CountryName)){
            temp1 = m1.get(CountryName);
        }
        return temp1;
    }
    
    public String getCountry(String capitalName){
        String temp2 = null;
        for(Map.Entry m : m1.entrySet()){
            if(capitalName.equals(m.getValue())){
                temp2 = (String) m.getKey();
                break;
            }
        }
        return temp2;
    }
    
    public TreeMap<String,String> display(){
        TreeMap<String,String> m2 = new TreeMap<>();
        Set set = m1.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            m2.put((String)me.getValue(),(String)me.getKey());
        }
        return m2;
    }
}

public class ques5 {
    public static void main(String args[]){
        ques5countryCapital obj = new ques5countryCapital();
        obj.saveCountryCapital("India","New Delhi");
        obj.saveCountryCapital("Australia", "Canberra");
        obj.saveCountryCapital("England", "London");
        obj.saveCountryCapital("Bangladesh", "Dhaka");
        obj.saveCountryCapital("Netherland", "Amsterdam");
        
        System.out.println(obj.getCapital("England"));
        System.out.println(obj.getCountry("New Delhi"));
        
        System.out.println(obj.display());
    }
}
