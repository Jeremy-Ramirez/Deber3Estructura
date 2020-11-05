
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
        if(element == null || isEmpty()){
            return false;
        }
        if(index==0){
            addFirst(element);
            return true;
        }
        if(index==size){
            addLast(element);
            return true;
        }
        int contador=0;
        Node <E> temp = new Node<>(element,null);
         for(Node<E> i= head; i!=null; i=i.next){
            if(contador+1==index){
                temp.next = i.next;
                i.next = temp;
                size++;
                return true;
            }
            contador++;    
        }
        return false;
    }

    @Override
    public E removeFirst() {
        if(isEmpty()){
            return null;
        }
        E data = head.getData();
        head = head.getNext();
        size--;
        if(size==0){
            tail=null;
        }
        return data;
    }

    @Override
    public E removeLast() {
        if(isEmpty()){
            return null;
        }
        if(head == null || tail == null){
            return null;
        }
        Node<E> last = head;
        Node<E> previouslast = null;
        for(Node<E> i= head; i!=null; i=i.next){
            previouslast = last;
            last = last.next;
        }
        previouslast.next = null;
        size--;
        if(size==0){
            tail=null;
        }
        return previouslast.getData();
    }

    @Override
    public E remove(int index) {
        if(index < 0){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }
        Node<E> temp = head;
        
        for(int i = 0; i < index - 1; i++){
            temp =temp.next;
        }
       Node<E> temp2 = temp.next;
       temp2 = temp.next.next;
       return temp2.getData();
    }

    @Override
    public int indexOf(E e) {
        int index = 0;
        for(Node<E> i= head; i!=null; i=i.next){
            if(i.equals(e)){
                return index;
            }
            index++;
        }
        
        return index;
    }

    @Override
    public boolean contains(E e) {
        if(e == null || isEmpty())
            return false;
        for(Node<E> i= head;i!=null;i=i.next){
            if(i.getData().equals(e))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" + "head=" + head + ", tail=" + tail + ", size=" + size + '}';
    }

  
    
}
