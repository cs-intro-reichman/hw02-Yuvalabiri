public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); 
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= (n * 2); b++){
				if ((b % 2 == 0) & (a % 2 == 0)) {
					System.out.print("*");
				} else if ((b % 2 != 0) & (a % 2 != 0)) {
					System.out.print("*");
				} else {
				System.out.print(" ");
				}
			}
			System.out.println(); 
		}
		
	}

}
		
	

