public class LinkedListBasic {
public static void main ( String args[]){
	appendToTail(1)
}

void appendToTail(int d){
	Node end  = new Node(d);
	Node n = this;
	while(n.next != null){
	 n = n.next;
	}
	n.next = end;
}
}
