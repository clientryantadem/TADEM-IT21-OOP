
package tadem21oop;
import java.util.Scanner;

public class functionDemo {
    static void message(String name, int age){
        System.out.println("Hello Guys , this is " + name + " I am " +  age + " Years Old");
    }    
    static int  calculateAge(int currentYear, int birthYear){
    return currentYear - birthYear;
       
          
        
    }
    //void
    
    //returning methods
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        
        message(name, age);
        //System.out.println("My real age is " + calculateAge(2026, 2007));
        //message(" Client Ryan Tadem" , 17);
        int calculatedAge = calculateAge(2026, 2007);
         if (age == calculatedAge) {
            System.out.println("Honest");
        } else{
         }
                    System.out.println(" Liar/ Bakakon");
         String [] Children = { "chen", "march", "hudson", "carl", "ryan"};
          for (int i = 0; i < Children.length; i++){
                 if (Children[i].equals ("march")){
                 Children[i]= "marchilyn";
             System.out.println("\n Children of Marchilyn"  );
             for (String kid : Children)
             
                 System.out.println(kid);
          
             }
                    }
            
        }
        
       
        
        
    }
    
        
        
       
        
        
        
    
    

