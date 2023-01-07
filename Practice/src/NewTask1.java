
/**
 *
 *  Write a program to create a class Student along with two methods getData(),printData() to get the
 * value through argument and display the data in printData. Create the two objects si ,s2 to declare and
 * access the values from main class
 *
 * @author MR
 */
class Student {

    String name;
    String fname;
    int roll;
    
    
    void getdata(String name,String fname,int roll){
        this.name = name;
        this.fname = fname;
        this.roll = roll;
    }
    
    void printdata(){
        System.out.println("Name is : "+name);
        System.out.println("Father name is : "+fname);
        System.out.println("Roll number is : "+roll);
    
    }

}

class NewTask1 {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.getdata("Mubashir", "Rasheed", 74);
        
        Student s2 = new Student();
        s2.getdata("Zain ", "Khan", 99);
        
        s1.printdata();
        s2.printdata();
        
        
    }

}
