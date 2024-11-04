public class LacosInfinitosV3{
	
	public static void main (String[] args) {
		int x = 1;
		for ( ; ; ){
			if (x > 10){ //for desmontado
				break;
			}
			System.out.print(x + " ");
			x++;
			
		}
		System.out.print("\n>>>" + x);
	}
}

