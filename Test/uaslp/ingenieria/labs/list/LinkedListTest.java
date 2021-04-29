package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LinkedListTest {

    @Test
    public void CheckListCountIncrement(){
        LinkedList<Integer> lista = new LinkedList<>();

        int listsCount=LinkedList.getListsCount();

        assertEquals(5,listsCount);
    }

    @Test
    public void CheckCreatedListIfEmpty(){

        LinkedList<Integer> lista = new LinkedList<>();

        int size = lista.getSize();

        assertEquals(0,size);
    }

    @Test
    public void CheckAddingElementSizeOne(){
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(5);

        assertEquals(1,lista.getSize());
        assertEquals(5,lista.get(0));
    }

    @Test
    public void CheckListElementCorrectSize_WhenDeleteElement(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        lista.delete(0);

        assertEquals(2,lista.getSize());
        assertEquals(10,lista.get(0));
        assertEquals(50,lista.get(1));
    }

    @Test
    public void CheckListElement_WhenElementInMiddleIsDeleted(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        lista.delete(1);

        assertEquals(2,lista.getSize());
        assertEquals(5,lista.get(0));
        assertEquals(50,lista.get(1));
    }

    @Test
    public void CheckListElement_WhenDeleteLastElement(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        lista.delete(2);

        assertEquals(2,lista.getSize());
        assertEquals(5,lista.get(0));
        assertEquals(10,lista.get(1));
    }

    @Test
    public void CheckListElement_WhenAllDeleted(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        lista.delete(2);
        lista.delete(1);
        lista.delete(0);

        assertEquals(0,lista.getSize());
    }

    @Test
    public void CheckListElement_WhenDeleteNonElement(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        lista.delete(3);

        assertEquals(3,lista.getSize());
    }

    @Test
    public void CheckListElementIterator_WhenCalled(){
        Integer element=0;
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(6);

        Iterator<Integer> it = lista.getIterator();

        while(it.hasNext()){
            element = it.next();
        }

        assertEquals(6,element);
    }

    @Test
    public void CheckListElementReverseIterator_WhenCalled(){
        Integer element=0;
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(6);

        Iterator<Integer> it = lista.getReverseIterator();

        while(it.hasNext()){
            element = it.next();
        }

        assertEquals(6,element);
    }
}