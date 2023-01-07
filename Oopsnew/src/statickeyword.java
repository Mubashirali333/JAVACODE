
/**
 *
 * @author MR
 */
// ststic means fixed
// Static attribute can define with class name without creating object
// but when can access after creating object
//static can allocate memory only one time
//object allocate memory seversl time  

// school is same for all students

class Student {

    String name;
    static String school;
}

public class statickeyword {

    public static void main(String[] args) {

        Student.school = "Example school";
        Student s1 = new Student();
        System.out.println(s1.school);        
        
        
    }
}
