
package singlylinkedlist;
/**
 *
 * @author ronny
 */
public interface List<E> {
    
    //Consultar primero, ultimo y tamano........................................
    public E first();
    
    public E last();
    
    public int size();
    
    //Conocer Estado............................................................
    public boolean isEmpty();
    
    //Anadir y Remover..........................................................
    public void addFirst(E e); // inserta el elemento e al inicio

    public void addLast(E e); // inserta el elemento e al final
    
    public boolean add(int index, E element);

    public E removeFirst();
    
    public E removeLast();
    
    public E remove(int index);
    
    //Bbusqueda.................................................................
    public int indexOf(E e);
    
    public boolean contains(E e);
    
    
}
