import java.util.*;

class country{
    HashSet<String> h1 = new HashSet<String>();
    public HashSet<String> saveCountryNames(String CountryName){
        h1.add(CountryName);
        return h1;
    }
    
    public String getCountry(String CountryName){
        Iterator it = h1.iterator();
        while(it.hasNext()){
            if(it.next().equals(CountryName)){
                return CountryName;
            }
        }
        return null;
    }
}

public class testCountry {
    public static void main(String args[]){
        country obj = new country();
        obj.saveCountryNames("India");
        obj.saveCountryNames("South Africa");
        obj.saveCountryNames("Australia");
        obj.saveCountryNames("Sri Lanka");
        obj.saveCountryNames("England");
        obj.saveCountryNames("New Zealand");
        obj.saveCountryNames("West Indies");
        obj.saveCountryNames("Bangladesh");
        obj.saveCountryNames("Afganistan");
        
        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("America"));
    }
    
}
