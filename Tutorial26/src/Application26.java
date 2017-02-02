
public class Application26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		plant2.grow();
		
		tree.shedLeaves();
		doGrow(tree);
		doGrow(plant);
	}
	
	public static void doGrow(Plant plant){
		plant.grow();
	}

}
