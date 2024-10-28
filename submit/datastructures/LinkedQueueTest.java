package datastructures;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

/**
 * ITSC 2214 Melody
 * Instructor-provided code.
 */
public class LinkedQueueTest {
    LinkedQueue<Integer> queue;

    /**
     * Initialize the LinkedQueue instance.
     */
    @Before
    public void setup() {
        queue = new LinkedQueue<Integer>();
    }

    /**
     * Test of enqueue method, of class LinkedQueue.
     */
    @Test
    public void testEnqueue() {
        assertTrue(queue.isEmpty());
        queue.enqueue(4);
        queue.enqueue(1);
        assertEquals(4, (int) queue.frontValue());
        assertEquals(queue.size(), 2);
    }

    /**
     * Test of isEmpty method, of class LinkedQueue.
     */
    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.enqueue(6);
        assertFalse(queue.isEmpty());
    }
    
    /**
     * Test of dequeue method, of class LinkedQueue.
     * Test the dequeue() when the queue is not empty.
     */
    @Test
    public void testDequeue1() {
        queue.enqueue(23);
        int beta = queue.size();
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertNotEquals(beta, queue.size());
    }
    /**
     * Test of dequeue method, of class LinkedQueue.
     * Test the dequeue() when the queue is empty.
     */
    @Test
    public void testDequeue2() {
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
        assertNull(queue.dequeue());
    }

    /**
     * Test of first method, of class LinkedQueue.
     */
    @Test
    public void testFrontValue1() {
        assertEquals(0, queue.size());
        assertNull(queue.frontValue());
    }
        
    /**
     * Test of first method, of class LinkedQueue.
     */
    @Test
    public void testFrontValue2() {
        queue.enqueue(4);
        assertEquals(queue.frontValue().intValue(), 4);
        queue.enqueue(6);
        assertEquals(queue.frontValue().intValue(), 4);
        queue.dequeue();
        assertEquals(queue.frontValue().intValue(), 6);
    }

    /**
     * Test of size method, of class LinkedQueue.
     */
    @Test
    public void testSize() {
        queue.enqueue(4);
        assertEquals(queue.size(), 1);
        queue.dequeue();
        assertEquals(queue.size(), 0);
    }

    /**
     * Test of clear() method, of class LinkedQueue.
     */
    @Test
    public void testClear() {
        queue.enqueue(4);
        queue.enqueue(4);
        queue.clear();
        assertEquals(0, queue.size());
        assertNull(queue.frontValue());
    }
}
