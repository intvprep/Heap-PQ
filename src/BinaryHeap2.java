import java.util.Arrays;

public class BinaryHeap2 {
	private int[] heap;
	private int size;
	private int capacity;
	
	public BinaryHeap2(){
		capacity = 100;
		size = 0;
		heap = new int[capacity];
	}
	
	public BinaryHeap2(int capacity){
		this.capacity = capacity;
		size = 0;
		heap = new int[this.capacity];
	}
	
	public void offer(int i){
		
		if(size>=capacity){
			capacity = capacity*2;
			int[] tmp = new int[capacity];
			System.arraycopy(heap, 0, tmp, 0, heap.length);
			heap = tmp;
		}
		
		heap[size++] = i;
		
		heapifyUp(size-1);
		
	}
	
	private void heapifyUp(int position){
		int parent = (position-1)/2;
		while(heap[parent]>heap[position]){
			swap(parent,position);
			position = parent;
			parent = (position-1)/2;
		}
	}
	
	private void swap(int i, int j){
		int t = heap[i];
		heap[i] = heap[j];
		heap[j] = t;
	}
	
	public int peek(){
		return heap[0];
	}
	
	public int poll(){
		int min = heap[0];
		heap[0] = heap[size-1];
		size--;
		if(size>1)
			heapifyDown(0);
		return min;
	}
	
	public int getSize(){
		return size;
	}
	
	private void heapifyDown(int i) {
		int leftChild = 2*i+1;
		int rightChild = 2*i+2;
		int childToSwap = heap[leftChild]<heap[rightChild]?leftChild:rightChild;		
		while(heap[i]> heap[childToSwap]){
			swap(i,childToSwap);
			i = childToSwap;
			leftChild = 2*i+1;
			rightChild = 2*i+2;
			if(rightChild>=size||leftChild>=size)break;
			childToSwap = heap[leftChild]<heap[rightChild]?leftChild:rightChild;
		}
		
	}

	public void display(){
		System.out.println(Arrays.toString(heap));
	}
	
	
}
