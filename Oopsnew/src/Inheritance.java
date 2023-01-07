/**
 *
 * @author MR
 */


class student{
    String name;
    String fname;
    int roll;
}

class school extends student{
    String homework;
}
class college extends student{
    
}
class uni extends student{
 String assignments;   
}
public class Inheritance {
    public static void main(String[] args) {
        
        school st1 = new school();
        st1.name = "schoolstudent";
        
        
    }
    
}
