class Employee {
   void display(){
        System.out.println("Name of class is Employee");
   }
}

class Engineer extends Employee {
    // TODO: Override display() method
    void display(){
        System.out.println("Name of class is Engineer");
        super.display();
    }
    
}

public class MethodOverriding {
    public static void main(String[] args){
        Engineer C=new Engineer();
        C.display();
        // TODO: Create an Engineer object
    }   // TODO: Call the display() method
    
}
