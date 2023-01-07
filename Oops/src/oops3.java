class Student{
    String name;
    int roll;
    String dept;
    
   public void fun(){
       System.out.println(this.name);
       System.out.println(this.roll);
       System.out.println(this.dept);
   }
}





public class oops3{
    public static void main(String[]args){
        
        Student obj=new Student();
        obj.name="Hamid";
        obj.roll=78;
        obj.dept="IT";
        obj.fun();
        
        
    }
}