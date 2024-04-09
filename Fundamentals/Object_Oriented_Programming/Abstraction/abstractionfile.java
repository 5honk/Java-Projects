/* Abstraction + Interfaces
 * 
 * What Exactly is Abstraction?
 * Abstraction is creating a class with attributes that do not contain a body and can not be called by with an object (Will create an error if called).
 *      e.g. int age = 11; has a bod
 *           int age;      has no body
 * 
 * Notes: 
 *      1. If abstracting from a class, make sure we use the keyword "abstract" in the constructor and "public abstract void" for the empty body methods.
 *      2. If using interfaces for abstraction, we don't need to call a class just "interface name {}" and to link it to another class use "implements"
*/


abstract class Agent{
    public abstract void voice ();
    public abstract void abilities ();
    
}

interface Clothes {     // Unlike the class, the interface keyword assumes abstraction. So, we can create methods without a body
    public void hat();
    public void colour();
}

class Omen implements Clothes {     // If you see here we use "implments" instead of extends. Implements is used for interfaces 
    public void hat() {
        System.out.println("Small hat given by Cypher");
    }

    public void colour() {
        System.out.println("Cream");
    }

}   

class Cypher extends Agent{     // If the class is public, c.voice will not be called 
    int age = 35;

    public void voice () {
        System.out.println("Now remember, wipe the prints from your guns. It's just good crime scene etiquette");
    }

    public void abilities () {
        System.out.println("Tripwire, Hat, Smoke, Camera");
    }
}

public class abstractionfile {
    public static void main (String[] args) {
        Cypher c = new Cypher();
        Omen o = new Omen();

        c.voice();
        c.abilities();
        System.out.println(c.age);

        o.hat();



    }
}