/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Miya
 */
class Vegitable {

    String vegi1;
    String vegi2;
    String vegi3;
    String vegi4;
    String vegi5;
    String vegi6;

    String Book1;
    String Book2;
    String Book3;
    String Book4;
    String Book5;
    String Book6;

    public void fun() {
        System.out.println(this.vegi1);
        System.out.println(this.vegi2);
        System.out.println(this.vegi3);
        System.out.println(this.vegi4);
        System.out.println(this.vegi5);
        System.out.println(this.vegi6);

    }
}

public class Vegi {

    public static void main(String[] args) {

        System.out.println("           Object 1");

        Vegitable obj = new Vegitable();
        obj.vegi1 = "Potato";
        obj.vegi2 = "Onion";
        obj.vegi3 = "Cucumber";
        obj.vegi4 = "Okra";
        obj.vegi5 = "Chilli";
        obj.vegi6 = "Cabbage";

        obj.fun();

        System.out.println("           Object 2");

        Vegitable obj2 = new Vegitable();
        obj2.vegi1 = "Biryani";
        obj2.vegi2 = "Quroma";
        obj2.vegi3 = "Kharhai";
        obj2.vegi4 = "Daal";
        obj2.vegi5 = "Chawal";
        obj2.vegi6 = "curry";

        obj2.fun();

        System.out.println("           Object 3");

        Vegitable obj3 = new Vegitable();
        obj3.Book1 = "Holy Book";
        obj3.Book2 = "World Wide Web Book";
        obj3.Book3 = "Wurope Books";
        obj3.Book4 = "Science Books";
        obj3.Book5 = "Arts Book";
        obj3.Book6 = "Pakistani Books";

        obj3.fun();

        System.out.println("           Object 4");

        Vegitable obj4 = new Vegitable();
        obj4.vegi1 = "Corola";
        obj4.vegi2 = "Civic";
        obj4.vegi3 = "Farari";
        obj4.vegi4 = "Cultus";
        obj4.vegi5 = "Mehran";
        obj4.vegi6 = "Kore";

        obj4.fun();

        System.out.println("           Object 5");

        Vegitable obj5 = new Vegitable();
        obj5.vegi1 = "Hamid";
        obj5.vegi2 = "Fahad";
        obj5.vegi3 = "Abdullah";
        obj5.vegi4 = "Wasay";
        obj5.vegi5 = "Hassan Baig";
        obj5.vegi6 = "Sajjad";
        obj5.vegi6 = "G.Mustafa";

        obj5.fun();

    }
}
