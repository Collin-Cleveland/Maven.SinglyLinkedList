package com.zipcodewilmington.singlylinkedlist;

import org.junit.Test;
import org.testng.Assert;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testAdd() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();

        sll.add(3);
        sll.add(10);
        sll.add(5);
        sll.add(17);

        Assert.assertTrue(sll.contains(3));
        Assert.assertTrue(sll.contains(10));
        Assert.assertTrue(sll.contains(5));
        Assert.assertTrue(sll.contains(17));
    }

    @Test
    public void testGet() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();

        sll.add(1);
        sll.add(2);
        sll.add(3);

        int actual = sll.get(1);
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContains(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();

        sll.add(4);
        sll.add(9);
        sll.add(17);
        sll.add(69);

        Assert.assertTrue(sll.contains(4));
        Assert.assertTrue(sll.contains(9));
        Assert.assertTrue(sll.contains(17));
        Assert.assertTrue(sll.contains(69));
    }

}
