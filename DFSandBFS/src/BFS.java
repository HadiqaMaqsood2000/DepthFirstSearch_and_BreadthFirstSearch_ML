
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;


public class BFS{
	private Queue<Node> queue;
	static ArrayList<Node> nodes = new ArrayList<Node>();

	
	public static void main(String args[]) {
		
		Node n1 = new Node(12);
		Node n2 = new Node(34);
		Node n3 = new Node(86);
		Node n4 = new Node(20);
		Node n5 = new Node(22);
		Node n6 = new Node(03);
		Node n7 = new Node(30);
		Node n8 = new Node(4);
		Node n9 = new Node(27);
		
		
		n1.addNumbers(n3);
		n1.addNumbers(n6);
		n1.addNumbers(n4);
		n1.addNumbers(n7);
		n1.addNumbers(n8);
		n1.addNumbers(n6);
		n1.addNumbers(n5);
		n1.addNumbers(n9);
		n1.addNumbers(n2);
		n1.addNumbers(n1);
		n1.addNumbers(n9);
		
		System.out.println("The BREADTH FIRST traversal of graph is: ");
		BFS bfsGraph = new BFS();
			bfsGraph.bfs(n1);
	}  // main method ends here

static class Node{
	int data;
	boolean visited;
	List<Node> partners;
	
	Node(int data) {
		this.data = data;
		this.partners = new ArrayList<>();
	}  // constructor ends here
	
	
	public void addNumbers(Node partnerNode) {
		this.partners.add(partnerNode);
	} //end
	
	
	public List<Node> getPartners(){
		return partners;
	} //end
	
	
	public void setNeighbours(List<Node> partners) {
		this.partners = partners;
	}    //end
	
} //node class ends here


public BFS() {
	queue = new LinkedList<Node>();
}  //end


public void bfs (Node node) {
	queue.add(node);
	node.visited = true;
	while(!queue.isEmpty()) {
		Node element = queue.remove();
		System.out.print(element.data+" ");
		
		List<Node> adding = element.getPartners();
		for(int loop=0; loop<adding.size(); loop++) {
			Node n = adding.get(loop);
				if (n!=null && !n.visited) {
					queue.add(n);
					n.visited = true;
				}  // if loop ends here
				
		} // for loop ends here
		
	} // while loop ends here
	
	System.out.println("\n \n");
	
}  //bfs function ends here

} //BFS class ends here
