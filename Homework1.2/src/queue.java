
public class queue {
	
	int size;
	node[] heap = new node[1];
	
	public queue() {
		size = 0;
	}
	
	public void addnode(node n) {
		
		if(size==0) {heap[0]=n; size++; return;}
		
		size++;
		
		node[] temp = new node[size];
		for(int i=0; i<size-2; i++) {
			temp[i] = heap[i];
		}
		temp[size-1] = n;
		
		temp = bubbleUp(temp, (size-2)/2);
		
		heap = temp;
				
	}
	
	public node take() {
		
		node top = heap[0];
		
		size--;
		node[] temp = new node[size];
		for(int i=0; i<size; i++) {
			temp[i] = heap[i+1];
		}
		heap = temp;
		
		return top;
	}
	
	private node[] bubbleUp(node[] arr, int p) {
		
		int left = (2*p)+1;
		int right = (2*p)+2;
		int small = 0;
		
		if (left <arr.length && arr[left].gettotal() < arr[p].gettotal()) {
			small = left;
		}
		else { small = p;}
		
		if (right <arr.length && arr[right].gettotal() < arr[small].gettotal()) {
			small = right;
		}
		
		if (small != p) {
			node temp = arr[p];
			arr[p] = arr[small];
			arr[small] = temp;
			/**if (arr[left].gettotal() > arr[right].gettotal()) { 
				node temp1 = arr[left];
				arr[left] = arr[right];
				arr[right] = temp1;
			}**/
			bubbleUp(arr, (p-1)/2);
		}
		
		return arr;
		
	}
	
	public void printqueue() {
		for(node n:heap) {
			n.print();
		}
	}

}
