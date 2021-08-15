import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;


public class DFS {
	
	
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
		
		DFS dfsGraph = new DFS();
		System.out.println("The DEPTH FIRST traversal of graph using recursion is: ");
		dfsGraph.dfs(n1);
	}  // main method ends here

	
static class Node{
	int data;
	boolean visited;
	List<Node> partners;
	
	
	Node(int data){
		this.data = data;
		this.partners = new ArrayList<>();
	}
	
	public void addNumbers(Node partnerNode) {
		this.partners.add(partnerNode);
	} //end
	
	
	public List<Node> getPartners(){
		return partners;
	} //end
	
	
	public void setNeighbours(List<Node> partners) {
		this.partners = partners;
	}    //end
} // node class ends here

	public void dfs (Node node) {
		
		System.out.print(node.data+" ");
		List<Node> adding = node.getPartners();
		node.visited = true;
			for(int loop=0; loop<adding.size(); loop++) {
				Node n = adding.get(loop);
					if (n!=null && !n.visited) {
						dfs(n);
					}  // if loop ends here
					
			} // for loop ends here
		
	}  //dfs function ends here
	
}  //DFS class ends here
