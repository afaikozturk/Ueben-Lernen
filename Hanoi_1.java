import java.util.Arrays;
import java.util.Stack;

/**
 * Created by afaik on 04.11.2020
 */

public class Hanoi_1 {
	
	private static Stack<Integer> quelle = new Stack<Integer>();
	private static Stack<Integer> hilfe = new Stack<Integer>();		
	private static Stack<Integer> ziel = new Stack<Integer>();
		
	private static void init(int n) {		
	for (int i = n; i>0; i--) {
			quelle.push(i);
				
		}
	}
		
	private static void show() {
		System.out.println (Arrays.toString(quelle.toArray()));
		System.out.println (Arrays.toString(hilfe.toArray()));
		System.out.println (Arrays.toString(ziel.toArray()));
		System.out.println();
			
	}
		
	private static void  bewege(int n, Stack<Integer> a, Stack<Integer> b, Stack<Integer> c) {
		if(n>0) {
			bewege(n-1,a,c,b);
		
			//groﬂe scheibe bewegen
			
			Integer tmp = a.pop();
			c.push(tmp);
			show();
			bewege (n-1, b,a,c);
		}
	}
		
	public static void main(String[] args) {
		init(7);
		show(); 
		bewege(7,quelle,hilfe,ziel);
	}
	
}

