 
public class XmasDecs {

	public static void main(String[] args) {
		Plain tree = new Tree();
		
		System.out.println(tree.get_name());
		
		/*
		 * Now decorate the tree!
		 *
		 */
		
		//with Tinsel
		tree = new TinselDecoration(tree);
		System.out.println(tree.get_name());
		
		
		//with Baubles
		tree = new BaublesDecoration(tree);
		System.out.println(tree.get_name());
		
		//with a Fairy
		tree = new FairyDecoration(tree);
		System.out.println(tree.get_name());
	}

}
