
package singlylinkedlist;

/**
 *
 * @author ronny
 */
public class SinglyLinkedList<E> implements List<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
       
    }

    //Consultar primero, ultimo y tamano........................................
    @Override
    public E first() {
        if(isEmpty())
            return null;
        return head.getData();
    }

    @Override
    public E last() {
        if(isEmpty())
            return null;
        return tail.getData();
    }

    @Override
    public int size() {
        return size;
    }
    
     //Conocer Estado............................................................
    @Override
    public boolean isEmpty() {
        return (head == null && tail == null);
    }
    
    //Anadir y Remover..........................................................
    @Override
    public void addFirst(E e) {
        Node <E> nuevo=new Node<E>(e);
        nuevo.next=head;
        head=nuevo;
        if(size==0){
            tail=head;
        }
        size++;
    }

    @Override
    public void addLast(E e) {
        
        Node <E> nuevo=new Node<E>(e);
        if(isEmpty()){
        head=nuevo;
        }else{
        tail.setNext(nuevo);    
        tail=nuevo;
        size++;
        }
       
    }

    @Override
    public boolean add(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E removeLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
