
/**
 *
 * @author MR
 */

import java.util.*;
public class NewClass {

    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("Tony");

        System.out.println(st);
        System.out.println(st.charAt(0));

//        st.setCharAt(0, "p");
        st.insert(2, "ll");
        System.out.println(st);

    }
}
