
/**
 *
 * @author MR
 */
class account {

    public String name;
    protected String fname;
    private String password;

    //getter and setter
   
   public String getpassword(){
       return this.password;
   }
   public void setpassword(String pass){
       this.password = pass;
   }
    
    
    
    
}

public class Accessmodifier {

    public static void main(String[] args) {

        account obj = new account();
        obj.name = "ALi";    
        obj.setpassword("pass");
        System.out.println(obj.getpassword());
        
        
        
    }

}
