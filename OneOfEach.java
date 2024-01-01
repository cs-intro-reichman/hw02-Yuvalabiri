public class OneOfEach {
	public static void main (String[] args) {
		boolean girl = false;
		boolean boy = false;
		int children = 0;
		while (!(boy && girl)){
			double i = Math.random();
			if (i < 0.5){
				boy = true;
				System.out.print("b ");
			} else {
				girl = true; 
				System.out.print("g ");

			} 
			children++;
		}
		System.out.println("\nYou made it... and you now have " + children + " cildren.");
	}

}
		