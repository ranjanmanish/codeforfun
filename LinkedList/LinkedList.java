import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	Node first;
public static void main (String args[]){
	ArrayList<Node> listNode = new ArrayList<Node>();
	//Node node = new Node (1);
	//listNode.add(node);
	listNode = addNnode(n);
	print(listNode);
}
/**
*This method will print the node data
*/
static void print(ArrayList<Node> listNode){
	for(Node node:listNode)
		System.out.println("Data->"+node.data);
	}

static ArrayList<Node> addNnode(int n){
	ArrayList<Node> listOfNode = new ArrayList<Node>();
	Node iterator;
	iterator = first
	for(int i = 0 ; i < n ; i++){
		if(i ==0 ) {		
		Node n = new Node(i);
		}
		else{
		Node n = new Node(i);
		iteartor.next = n;
		iterator = iterator.next;  
		}
	}
}
}
