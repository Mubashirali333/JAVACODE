
/**
 *
 * @author MR
 */
// abstract
// an abstract must be ddeclared in abstract keyword
// It can have abstract and nono-abstract method
// Tt can not be instantiated
// It canhave constructirs and and static methods also
//
abstract class Animal {

    abstract void walk();

    Animal() {
        System.out.println("Creating anew animal ");
    }

    public void eat() {
        System.out.println("Animals Eating ");
    }
}

class Horse extends Animal {

    Horse() {
        System.out.println("Creating a new horse");
    }

    public void walk() {
        System.out.println("Horse walk on 4 legs ");
    }
}

class Chicken extends Animal {

    public void walk() {
        System.out.println("Horse walk on 2 legs ");
    }
}

public class abstraction {

    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.eat();

    }

    //abstraction use karnay say parent class access nahi hoti lekin members access ho jatay hain aur
    // abstract class direct objects kay zariye access nahi hoti lekin inheritance ke zariye parent class kay members access/inherits ho jatay hain
    // abstract main ham wo methods declare kar tay hain o ham chahtay hain direct object bana kar access na ho lekin child class main inherit ho jayen
    //abstraction ka direct object nahi banaya ja sakta lekiniskay methods ko inherit kiya ja sakta hai
}
