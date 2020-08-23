package hw_9_Double_Linked_List;

import junit.framework.TestCase;
import org.junit.Before;
import java.util.ArrayList;
import java.util.Collection;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class MyDoubleLinkedListTest extends TestCase {
    MyDoubleLinkedList l_filled;
    MyDoubleLinkedList l_empty;
    String[] arr;
    Collection<String> col1;

    @Before
    public void setUp(){
        arr = new String[]{"A", "B", "C"};
        l_filled = new MyDoubleLinkedList();
        l_empty = new MyDoubleLinkedList();
        l_filled.addAll(arr);
    }
    public void testIsEmpty() {
        assertTrue(l_empty.isEmpty());
        assertFalse( l_filled.isEmpty());
    }

    public void testAdd() {
        assertTrue(l_empty.add("A"));
        assertTrue(l_filled.add("E"));
    }

    public void testAddAllArr() {
        assertTrue(l_filled.addAll(arr));
        assertTrue(l_empty.addAll(arr));
    }
    public void testAddAllCol() {
        col1 = new ArrayList<>();
        col1.add("D");
        col1.add("E");
        assertTrue(l_filled.addAll(col1));
        assertTrue(l_empty.addAll(col1));
    }


    public void testDeleteByIndex() {
        assertFalse(l_filled.delete(22));
        assertTrue(l_filled.delete(2));
    }

    public void testTestDelete() {
        assertFalse(l_filled.delete("Z"));
        assertTrue(l_filled.delete("A"));
    }

    public void testGet() {
        assertThat(l_filled.get(0), is("A"));
    }

    public void testContains() {
        assertTrue(l_filled.contains("B"));
        assertFalse(l_filled.contains("F"));
    }

    public void testClear() {
        assertTrue(l_empty.clear());
        assertTrue(l_filled.clear());
        //Не понимаю какой вариант правильнее для тестов верхний или нижний ¯\_(ツ)_/¯
        assertThat(l_empty.size(), is(0));
        assertThat(l_filled.size(), is(0));
    }

    public void testSize() {
        assertThat(l_empty.size(), is(0));
        assertThat(l_filled.size(), is(3));
    }
    public void testTrim() {
        l_filled.add(null);
        l_filled.addAll(arr);
        assertTrue(l_filled.trim());
    }

    public void testCompare() {
        col1 = new ArrayList<>();
        MyDoubleLinkedList col2 = new MyDoubleLinkedList();
        col1.add("A");
        col1.add("B");
        col2.add("A");
        col2.add("B");
        assertTrue(col2.compare(col1));
        col2.add("C");
        assertFalse(col2.compare(col1));

    }
}
