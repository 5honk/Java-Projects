// Resources: https://www.geeksforgeeks.org/introduction-to-java-swing/
// This is a simple GUI 

import javax.swing.*;
import java.awt.*;

/*
 * 1. Create the constructor
 * 2. Create the component
 * 3. Add the component to the constructor 
 */

public class SimpleSwing {
    public static void main (String[] args) {

    // Constructor to create the window (its always set to not visble so make it visible)
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // I struggled to change other properties without this

    // Create Button 
        JButton b1 = new JButton("Goofy Cat Button");
        b1.setBounds(130,100,200,40);
        frame.add(b1);

    
        JButton b3 = new JButton ("Void Cat");
        b3.setBounds(130,200,200,40);
        frame.add(b3);


    
   
        

        

    





    }
}