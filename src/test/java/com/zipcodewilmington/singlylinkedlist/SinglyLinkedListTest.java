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
    public void testContainsInteger(){
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

    @Test
    public void testContainsString(){
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();

        sll.add("Hello");
        sll.add("world");
        sll.add("17");
        sll.add("JAVA");

        Assert.assertTrue(sll.contains("Hello"));
        Assert.assertTrue(sll.contains("world"));
        Assert.assertTrue(sll.contains("17"));
        Assert.assertTrue(sll.contains("JAVA"));
    }

    @Test
    public void testContainsIntegerNotExist(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();

        sll.add(4);
        sll.add(9);
        sll.add(17);
        sll.add(69);

        Assert.assertFalse(sll.contains(100));
    }

    @Test
    public void testFind(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        sll.add(54);
        sll.add(23);
        sll.add(17);
        sll.add(1000);

        int actual = sll.find(17);
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindNotExist(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        sll.add(54);
        sll.add(23);
        sll.add(17);
        sll.add(1000);

        int actual = sll.find(69);
        int expected = -1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        sll.add(54);
        sll.add(23);
        sll.add(17);
        sll.add(1000);

        int actual = sll.size();
        int expected = 4;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSizeEmpty(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        int actual = sll.size();
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCopy(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        sll.add(100);
        sll.add(500);
        sll.add(999);

        SinglyLinkedList<Integer> actual = sll.copy();

        Assert.assertTrue(sll.equals(actual));
    }

    @Test
    public void testRemove(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        sll.add(100);
        sll.add(200);
        sll.add(300);
        sll.add(400);
        sll.add(500);

        sll.remove(2);

        Assert.assertFalse(sll.contains(300));
    }
    @Test
    public void testRemoveFirstElement(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();

        sll.add(1000);
        sll.add(2000);
        sll.add(3000);

        sll.remove(0);

        Assert.assertFalse(sll.contains(1000));
    }
    @Test
    public void testRemoveLastElement(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        sll.add(1);
        sll.add(2);
        sll.add(3);

        sll.remove(2 );

        Assert.assertFalse(sll.contains(3));
    }

    @Test
    public void testSort(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> sort = new SinglyLinkedList<>();

        sll.add(245);
        sll.add(123);
        sll.add(334);

        sort.add(123);
        sort.add(245);
        sort.add(334);

        sll.sort();

//        System.out.println(sll.getHead().getValue());
//        System.out.println(sll.getHead().getNextNode().getValue());
//        System.out.println(sll.getHead().getNextNode().getNextNode().getValue());
//
//        System.out.println(sort.getHead().getValue());
//        System.out.println(sort.getHead().getNextNode().getValue());
//        System.out.println(sort.getHead().getNextNode().getNextNode().getValue());

        Assert.assertTrue(sll.equals(sort));
    }

}
