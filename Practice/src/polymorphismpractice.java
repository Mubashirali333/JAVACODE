
/**
 *
 * @author MR
 */
class formula {

    int a, b, c;

    public void printfunc(int a) {

        System.out.println("Square is "+a*a);
    }
  public void printfunc(int a,int b) {

        System.out.println("Rectangle is "+a*b);
    }
    public void printfunc(int a,int b,int c) {

        System.out.println("Square is "+a*b*c);
    }
}

public class polymorphismpractice {

    public static void main(String[] args) {

        formula s1 = new formula();
        s1.printfunc(2,3);

    }

}
