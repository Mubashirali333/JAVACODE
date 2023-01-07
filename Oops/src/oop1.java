class info{
    int id;
    int roll;
    int year;
    int num;
    
    public void fun()
{
System.out.println("Details");
System.out.println(this.id);
System.out.println(this.roll);
System.out.println(this.year);
System.out.println(this.num);
}}
public class oop1{
    public static void main(String[]args){
        info obj=new info();
        obj.id =57130;
        obj.roll=78;
        obj.year=2022;
        obj.num=108423500;
        
        obj.fun();
        
        
    }
}        
