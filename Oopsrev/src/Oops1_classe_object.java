
/**
 *
 * @author MR
 */        

// Online compiler 

//class is a blueprint that contain attributes(properties),methods(functions) like pen but object is used to distinguish like pen(blue,black)

// this keyword refers the current object

// this keyword current object ko refer karta hai








class Human {

    //attributes(properties)
    
    String Firka;
    String Surname;
    String color;
    String upper_lower;

    public void printfun() {                        //methods
        System.out.println(this.Firka);
        System.out.println(this.Surname);
        System.out.println(this.color);
        System.out.println(this.upper_lower);
    }

}

public class Oops1_classe_object {

    public static void main(String[] args) {

        //creating object with name human
        
//        How to create object
        
//        First write class name(Human)
//        Second write obj name(human)
//        Third = sign
//        Fourth new key word. new keyword is used to allocate space in memory where our object is store;
//        Fifth is constructor is used to construct object
        
        Human human = new Human();
        human.Firka = "Ahel hadith";
        human.Surname = "Khan";
        human.color = "White";
        human.upper_lower = "Middele class";

        Human human2 = new Human();
        human2.Firka = "Sunni";
        human2.Surname = "Shaikh";
        human2.color = "Black";
        human2.upper_lower = "Lower";

        human.printfun();
        human2.printfun();
    }

}
