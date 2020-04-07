import java.util.*;

class countryCapital{
    HashMap<String,String> m1 = new HashMap<>();
    public HashMap<String,String> saveCountryCapital(String CountryName, String capital){
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
    
    public HashMap<String,String> display(){
        HashMap<String,String> m2 = new HashMap<>();
        Set set = m1.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            m2.put((String)me.getValue(),(String)me.getKey());
        }
        return m2;
    }
}

public class testCountryCapital {
    public static void main(String args[]){
        countryCapital obj = new countryCapital();
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
