import java.util.Scanner;

public class problem4 {
	
	static Scanner scan = new Scanner(System.in);
		
	public boolean check(node n) {
		if (n.getheur()==0) {
			System.out.println("Arrived at Bucharest!");
			return true;
		}
		else { return false;}
	}
	
	public void expand(queue frontier) {
		
		node n = frontier.take();
		System.out.print("node: ");
		n.print();
		if(check(n)) {
			return;
		}
		
		
	}
	
	public void addnodes(queue frontier, int num) {
		for(int i=0; i<num; i++) {
			System.out.print("add node: ");
			frontier.addnode(new node(scan.next(), scan.nextInt(), scan.nextInt()));
		}
	}
	
	public static void main(String[] args) {
		
		queue frontier = new queue();
		
		System.out.println("Enter initial state: ");
		
		node node1 = new node(scan.next(), scan.nextInt(), scan.nextInt());
		
		frontier.addnode(node1);
		
	}

}
