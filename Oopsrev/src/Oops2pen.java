/**
 *
 * @author MR
 */


class Pen{
    
    String name;
    String type;
    String color;
    
    
    public void printfunc(){
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println("-------------------------------");
    }
    
    
    
}


public class Oops2pen {
    public static void main(String[] args) {
        
        Pen pen = new Pen();
        pen.name = "Dolar";
        pen.color = "Blue";
        pen.type = "fountain";
        pen.printfunc();
        
        
        Pen pen2 = new Pen();
        pen2.name = "signature";
        pen2.color = "Black";
        pen2.type = "gel";
      
        pen2.printfunc();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
