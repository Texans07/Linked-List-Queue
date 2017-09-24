/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package douglistq;

import javax.swing.JOptionPane;

/**
 *
 * @author dt024
 */
// head is front of queue tail is back of queue
public class myQueue 
{
    public IntegerList head;
    public IntegerList tail; 
    public int size;
    public myQueue()
    {
        head = null;
        tail = null;
        size = 0;
    }
    //queue check if empty if empty create a new list 
    public void enqueue(int value)
    {
        if(head == null)
        {
            IntegerList temp = new IntegerList();
            temp.value = value;
            head = temp;
            tail = temp;
        }
        else
        {
           IntegerList temp = new IntegerList();
            temp.value = value;
            tail.nextLL = temp;
            tail = temp;
        }
        size++;
    }
    public int dequeue()
    {
        int tobeReturned=0;
        if(head != null)
        {
            tobeReturned = head.value;
            head = head.nextLL;
        }
        else
        {
          JOptionPane.showMessageDialog(null,"Queue Is Empty ");
        }
        return tobeReturned;
    }
    public void circle()
    {
        IntegerList temp = head;
            while( temp != null)
            {
                JOptionPane.showMessageDialog(null,temp.value+" ");
                //System.out.println(" Value is "+ temp.value);
                temp = temp.nextLL;
                
                
            }
            
             if(temp == null)
                     JOptionPane.showMessageDialog(null,"End of Queue ");
                    

        
    }
}
