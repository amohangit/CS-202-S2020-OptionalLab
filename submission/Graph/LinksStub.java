import java.util.ArrayList;
public class LinksStub {
	public static void main(String args[]) {
		Links link = new Links();
		/* adding nodes to linked list */
		for (int i =0; i < 10; i++){
			link.add(i);
		}
		System.out.println("--------------------------------------------------------");
		/* displaying nodes by getting the nodes 
			in the linked list */

		for (int i =0; i < link.size(); i++){
			System.out.print(link.get(i) + "\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------");
		/* deleting (1/4th) of the nodes from the linked list */

		for (int i =0; i < 5; i++){
			link.remove(i);
		}
		for (int i =0; i < link.size(); i++){
			System.out.print(link.get(i) + "\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------");
		

	} 
		
} // LinksStub
