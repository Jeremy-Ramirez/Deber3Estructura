/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author ronny
 */
public class Slinkedlist {
    public static void main(String[] args) {
        SinglyLinkedList lista = new SinglyLinkedList();
        
        lista.addFirst(1);
        lista.addLast(5);
        lista.addLast(10);
        lista.addLast(15);
        lista.addLast(20);
        lista.addLast(25);
        
   
        System.out.println(lista);
        System.out.println(lista.indexOf(15));
        
       
    }
}
