/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;

import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String num=  JOptionPane.showInputDialog("Enter a number");// Displays the optionpane to enter the first nmuber and captures it as a string
       String num2= JOptionPane.showInputDialog("Enter a second number");//Displays the optionpane to enter the second nmuber and captures it as a string
       int numm=Integer.parseInt(num);//changes the first number string to an integer
       int numm2=Integer.parseInt(num2);//changes the second number string to an integer
       int answer=numm+numm2;//adds the two numbers together
       JOptionPane.showMessageDialog(null,"Your answer is:"+ answer);// displays the the sum of the two numbers 
       
    }
    
}
