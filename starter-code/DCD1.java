/*
Add the honor code statement here. 
*/
import java.util.*;
public class DCD1{
	public static int[] generateSet(int[] coin_weights){
		Random rand = new Random(); 
		int genuine_weight = rand.nextInt(100);
		int defective_weight = rand.nextInt(genuine_weight-1);
		int defective_position = rand.nextInt(coin_weights.length);
		for (int i = 0; i < coin_weights.length; i++){
			if (i != defective_position )
				coin_weights[i] = genuine_weight;
		}
		coin_weights[defective_position] = defective_weight;
		System.out.println("The Weight of the coins in the set are: ");
		System.out.println(Arrays.toString(coin_weights));
		System.out.println("-----------------------------------------");
		return coin_weights;
	}
	public static void main(String[] args){
		int[] coin_weights = new int[7]; // a set of coins and their respective weights. 
		/* does a random distribution of weights, while still 
		making sure to be within the scope of the problem definition,
		that is, all values except one will be the same. 
		*/
		int[] weights = generateSet(coin_weights);

		/*
		Add your logic below to find the defective coin
		using the brute force algorithm. 
		It is acceptable to create a new method and call the 
		method from here.
		*/
		
	}
}