import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class arraylist<E> extends ArrayList<E>{
    @Override
    public boolean add(E e){
        if(e instanceof Integer || e instanceof Float || e instanceof Double){
            super.add(e);
            return true;
        }
        else{
            throw new ClassCastException("Only Integer, Float and Double allowed");
        }
    }
}

public class ques4 {
    public static void main(String args[]){
        ArrayList<Object> al = new arraylist<>();
        try{
            al.add(15);
            al.add(4.5F);
            al.add(2.36);
            al.add("Test");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(al);
    }
}
