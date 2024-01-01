public class InOrder {

	public static void main (String[] args) {
		int random1 = ((int)((Math.random() * 10) + 1));
		System.out.print(random1 + " ");
		int random2 =  random1;
		do {
			random2 = ((int)((Math.random() * 10) + 1));
			if (random2 >= random1) {
				System.out.print(random2 + " ");
				random1 = random2;
			} else {
				break;
			}	
		} while (random2 >= random1);

	}

}
