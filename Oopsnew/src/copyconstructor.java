//
///**
// *
// * @author MR
// */
//class student {
//
//    String name;
//    int age;
//
//    public void printfunc() {
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
//
//    student(student s2) {
//        this.name = s2.name;
//        this.age = s2.age;
//        //copy constructor
////        s2 ki information ko apnay current object main store kar raha hai
//    }
//
//    student() {
//
//    }
//
//}
//
//public class copyconstructor {
//
//    public static void main(String[] args) {
//        student s1 = new student();
//        s1.name = "ali";
//        s1.age = 22;
//
//        student s2 = new student(s1);
//        s2.printfunc();
//
//        // s1 ki properties ko s2 main assign kar diya 
//        
//        
//        
//        
//        
//    }
//
//}

class Studentt{
    String name;
    int roll;
    
    
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.roll);
    }
    
    Studentt(Studentt s2){
        this.name = s2.name;
        this.roll= s2.roll;
    }
    Studentt(){
        
    }
}

public class copyconstructor{
    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        s1.name = "ali";
        s1.roll = 33;
        Studentt s2 = new Studentt(s1);
        s2.printinfo();
                
    }
}
      
