
// To better understand classes, i'm making a case of a video game character
public class learningclass {

    public static class Cypher {
        String fname = "Amir El Amari";
        String sname = "Amir";
        char gender = 'm';
        double level = 3.14;
        void voiceline () {
            System.out.println("Give me a Corpse!");
        }
    }

    public static class Hat extends Cypher {
        int hatnumber = 2;
        String hat1name = "Big hat";
        String hat2name = "hat under big hat";
        void throwing () {
            System.out.println ("*wooshh*");
        }
    }

    private static class Secrets extends Cypher { 
        String widow = "Nora";

    }

    public static void main (String[] args) {

        // Trying to understand Classess and OOP by using associations
        
        Cypher clone = new Cypher ();   // Creating Objects
        Hat obj2 = new Hat ();

        System.out.println(clone.fname);
        obj2.throwing();
        clone.voiceline();
        System.out.println(clone.level);
       


        
     




        


    }
}