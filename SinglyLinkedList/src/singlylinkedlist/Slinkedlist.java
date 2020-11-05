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
        lista.add(1,2);
        lista.add(2,3);
        lista.addLast(5);
        
   
        System.out.println(lista.first());
        System.out.println(lista.last());
        System.out.println(lista.isEmpty());
        
        //System.out.println(lista.removeFirst());
        //System.out.println(lista.removeLast());
        System.out.println(lista.remove(2));
        
        
       
       
        
       
    }
}
