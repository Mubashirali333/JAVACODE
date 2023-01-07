
/**
 *
 * @author MR
 */
// 1 What is Constructors .Constructors is used to construct Objects
// Suppose Class name is Student so constructor will be Student().Class name + parathesis,Student + ();
// Constructor name is always same as class name like class name is Student so constructor name will be Student() 
// 2 Contructors have no return type
//3 Constructor call one time when object is create
//4 If we dont create any non-parameterized constructor in java then java create an by default conctructor.
//Urdu
//1 Constructor ka naam same hoga jo class ka naam hoga.Class kay nam kay sath parathesis laga kar ham constructors banatay hain
//2 Constructors have no return type
//3 Constructor aik hi bar call hoga jab object create hoga
// 4 Agar ham java main koi non-parameterized constructor nahi banatya to java by default khud say default constructors bana deta hai
//Types of constructor
// Non-param constructor
// Parameterized Constructor
// Default Contructor
// A Constructor is used to initializa and object while creating it
class Studentss {

    String name;
    int age;
    int roll;

    Studentss() {
        System.out.println("Welcome to Future ");
    }

}

public class Oops4_Constructors_Non_param {

    public static void main(String[] args) {

        Studentss s1 = new Studentss();

    }

}
