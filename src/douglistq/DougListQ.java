/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Douglas Travier Java program impleminting linked listts with queues
 */
package douglistq;

import java.io.PrintStream;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author dt024
 */
public class DougListQ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myQueue aQueue = new myQueue();// making the que
        int choice;//users main menu choice
        int ch=0;// choice to quit or not
        int number;// users number to input into queue
        do{
       
         String message = "1.Add to Queue " + " 2. Remove from Queue" + " 3. Print Queue" ;
         choice = Integer.parseInt(JOptionPane.showInputDialog(message));
        
         switch(choice)
             
             
         {
             case 1 :String message2 = " Enter Integer to ADD to Queue";
        number = Integer.parseInt(JOptionPane.showInputDialog(message2));
        aQueue.enqueue(number);
                break;
             case 2:
        String message3 = "REMOVE from Queue!";
        JOptionPane.showMessageDialog(null, message3);
          JOptionPane.showMessageDialog(null, aQueue.dequeue());
          break;
             case 3: 
                aQueue.circle();
        }ch = JOptionPane.showConfirmDialog(null, "Would you like to quit", "Quit Ramdom Stack?", JOptionPane.YES_NO_OPTION);
         
    }while(ch == JOptionPane.NO_OPTION);
   }

        ///test///////////////
        /*aQueue.circle();
        aQueue.enqueue(14);
        aQueue.enqueue(38);
        aQueue.enqueue(123);
        aQueue.circle();
        System.out.println(aQueue.dequeue());
        
        aQueue.enqueue(893);
        aQueue.circle();
        System.out.println(aQueue.dequeue());
        System.out.println(aQueue.dequeue());
        System.out.println(aQueue.dequeue());
        System.out.println(aQueue.dequeue());*/
    }
    

