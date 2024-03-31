public class OOP {
    public static void main (String[] args) {

        /*
         *  What is (OOP) Object-Oriented Programming?
            *      OOP is like putting objects into categories.
            *      A cat (object) can be categorised into a (class) called
            *      mammals. Potato (object) into a (class) named food.
         * 
         * What are the main topics in OOP?
            *      Polymorphism
            *      Abstraction
            *      Encapsulation
            *      Inheritance 
         * 
         * What does the modifiers do for the class? e.g. public, private
            *  The modifers determine the visibility of the class to
            *       other classess. 
            *    
            *  public: is accessible for every other class to use attributes
            *  Private: Only accessible within the class
            *  Protected: accessible for package and subclassess
         */

    // To use classes we need to create an object, the object uses content found in the Dog class
        Dog object = new Dog();     // new gives memmory to the object
        System.out.println(object.ssize);
        System.out.println(object.DoB);

    // Another example of using Objects 
        Dog josh = new Dog();
        System.out.println(josh.name);
        System.out.println(josh.DoB);
        // System.out.println(josh.dogid); This will show an error since dogid is private 
        System.out.println(josh.publicdomain);

    // Creating object for Pochita (inheritance section)
        Pochita devil = new Pochita();
        devil.bark();   // Using class Pochita and Dog's classes bark

    }
}

    // Creating a Class (superclass)
        class Dog extends Jojo{      // name needs to be capitalised, This is a constructor
            int ssize = 10;
            String name = "Joshua Nic";
            int DoB = 30092004;
            private int dogid = 21;     // Using Encapsulation, allows to keep content hidden from the user via private 
            public int publicdomain = 22;
            public void bark () {
                System.out.println("Bark Bark");
            }
            public void voiceline() {
                System.out.println("meow");
            }
        }

    // Creating a class for inheritance (subclass)
        class Pochita extends Dog{     // if we want to borrow attributes from another class we use "extends" to the class we want to borrow from
            int DoB = 999;
            String owner = "denji";
        }

    // Implementing Polymorphism 
        class Jojo {
            public void voiceline(){
                System.out.println("The next line your going to say is ");
            }
        }

    // Abstraction: Hiding certain data from the user, cannot make objects
    // Interfaces: another way of abstracting, needs to use implements

                
