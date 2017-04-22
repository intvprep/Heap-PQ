import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinaryHeap2Test {
	
	BinaryHeap2 heap;
	@Before
	public void setUp(){
		heap = new BinaryHeap2(3);
	}
	
	@Test
	public void test() {
		heap.offer(7);
		heap.offer(6);
		heap.offer(3);
		heap.offer(2);
		heap.offer(1);
		heap.offer(5);
		heap.offer(4);
		heap.offer(3);
		heap.offer(2);	
		heap.display();
		assertEquals(1, heap.peek());
		assertEquals(heap.poll(), 1);
		assertEquals(heap.poll(), 2);
		assertEquals(heap.poll(), 2);
		assertEquals(heap.poll(), 3);
		assertEquals(heap.poll(), 3);
		assertEquals(heap.poll(), 4);
		heap.offer(1);
		heap.display();
		assertEquals(heap.poll(), 1);
		assertEquals(heap.poll(), 5);
		assertEquals(heap.poll(), 6);
		assertEquals(heap.poll(), 7);	
		heap.display();
		
	}
	
	@Test
	public void test2(){
		heap.offer(300);
		heap.offer(200);
		heap.offer(100);
		
		assertEquals(100, heap.poll());
		heap.display();
		assertEquals(200, heap.poll());
		heap.display();
		assertEquals(300, heap.poll());
		heap.display();
		heap.offer(2);
		assertEquals(2, heap.peek());
		heap.offer(100);
		heap.offer(1);
		heap.offer(5);
		assertEquals(1, heap.poll());
		assertEquals(2, heap.poll());
		assertEquals(5, heap.poll());
		assertEquals(100, heap.poll());
	}

	@Test
	public void test3(){
		heap.offer(1);
		heap.offer(2);
		heap.offer(3);
		heap.offer(4);
		assertEquals(1, heap.poll());
		assertEquals(2, heap.poll());
		assertEquals(3, heap.poll());
		assertEquals(4, heap.poll());		
	}
	@Test
	public void test4(){
		heap.offer(4);
		heap.offer(3);
		heap.offer(2);
		heap.offer(1);
		assertEquals(1, heap.poll());
		assertEquals(2, heap.poll());
		assertEquals(3, heap.poll());
		assertEquals(4, heap.poll());		
	}
}
