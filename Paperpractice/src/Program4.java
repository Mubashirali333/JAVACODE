//4. Write a progam which prints even and odd numbers between 1 to 100 using a single loop. (Hint 
//StringBuffer can be used)
//output
//Even Numbers 2, 4, 6, ... ,100
//ODD Numbers 1, 3, 9, ... ,99

/**
 *
 * @author MR
 */
public class Program4 {

    public static void main(String[] args) {
        StringBuffer even = new StringBuffer("Even numbers");
        StringBuffer odd = new StringBuffer("Odd numbers");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                even.append(i + ",");
            } else {
                odd.append(i + ",");
            }

        }

        System.out.println(even);
        System.out.println(odd);

    }

}
