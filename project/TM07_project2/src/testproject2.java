import java.util.*;

class project2{
    ArrayList<String> al = new ArrayList<String>();
    public void add(String item){
        al.add(item);
        System.out.println("Inserted successfully");
    }
    
    public void search(String item){
        if(al.contains(item)){
                System.out.println("Item found in the list.");
        }
        else{
                System.out.println("Item not found in the list.");
        }
    }
    
    public void del(String item){
        if(al.contains(item)){
            al.remove(item);
            System.out.println("Deleted successfully.");
        }
        else
            System.out.println("Item does not exist.");
    }
    
    public void display(){
        Iterator it = al.iterator();
        System.out.println("The items in the list are :");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

public class testproject2 {
    public static void main(String args[]){
        int c;
        String item="";
        ArrayList<String> al = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        project2 obj = new project2();
        do{
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice : ");
            c = sc.nextInt();
            switch(c){
                case 1:
                    System.out.println("Enter the item to be inserted : ");
                    item = sc.next();
                    obj.add(item);
                    break;
                case 2:
                    System.out.println("Enter the item to search : ");
                    item = sc.next();
                    obj.search(item);
                    break;
                case 3:
                    System.out.println("Enter the item to delete : ");
                    item = sc.next();
                    obj.del(item);
                    break;
                case 4:
                    obj.display();
                    break;
                case 5:
                    System.out.print("Exiting...!! Thanks for using the application.");
                    System.exit(1);
                    break;
                default:
                    System.out.println("You entered Invalid choice.");
                    break;
            }
        }while(c!=5);
    }
}
