/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
class info{
String name;
String fname;
String dept;
String sems;
String uni;
 int rollno;
public void fun(){
    System.out.println(this.name);
    System.out.println(this.fname);
    System.out.println(this.dept);
    System.out.println(this.sems);
    System.out.println(this.uni);
    System.out.println(this.rollno);

} }

public class Assign{
    public static void main(String[]args){
        
        info st1 = new info();
        st1.name="Hamid";
        st1.fname="Miya";
        st1.dept="IT";
        st1.sems="Second";
        st1.uni="GC";
        st1.rollno=78;
        st1.fun();
        
        System.out.println("            Object no : 02");
        
        info st2 = new info();
        st2.name="Hunain";
        st2.fname="Khan";
        st2.dept="C.S";
        st2.sems="Second";
        st2.uni="UoS";
        st2.rollno=74;
        st2.fun();
        
        System.out.println("            Object no : 03");

        info st3 = new info();
        st3.name="Fahad";
        st3.fname="K.K";
        st3.dept="IT";
        st3.sems="Second";
        st3.uni="NUML";
        st3.rollno=77;
        st3.fun();
        
        System.out.println("            Object no : 04");

        info st4 = new info();
        st4.name="Qavi";
        st4.fname="Shaikh";
        st4.dept="IT";
        st4.sems="Second";
        st4.uni="Mehran";
        st4.rollno=80;
        st4.fun();
        
        
        System.out.println("            Object no : 005");

        info st5 = new info();
        st5.name="Abduulah";
        st5.fname="Shaikh";
        st5.dept="IT";
        st5.sems="Second";
        st5.uni="Lumhs";
        st5.rollno=84;
        st5.fun();
        
    }
}
