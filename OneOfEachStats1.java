public class OneOfEachStats1 {
	public static void main (String[] args){
		int T = Integer.parseInt(args[0]);
		int fw2 = 0;
		int fw3 = 0;
		int fw4 = 0; 
		int count = 0;
		for ( int a = 1; a <= T; a++){
		boolean girl = false;
		boolean boy = false;
		int children = 0;
			while (!(boy && girl)){
				double i = Math.random();
				if (i < 0.5){
					boy = true;
				} else {
					girl = true; 
				} 
				children++;
			}
			if (children == 2){
				fw2 ++;
			} else if (children == 3){
				fw3 ++;
			} else {
				fw4 ++;
			}
		count += children;
		}	
		double average = ((double)count) / T;
		System.out.println("Average: " + average +  " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + fw2);
		System.out.println("Number of families with 3 children: " + fw3);
		System.out.println("Number of families with 4 or more children: " + fw4);
		if(fw2 >= fw3 && fw2 >= fw4){
			System.out.println("The most common number of children is 2.");
		} else if(fw3 > fw2 && fw3 >= fw4){
			System.out.println("The most common number of children is 3.");
		} else if(fw4 > fw2 && fw4 > fw2){
			System.out.println("The most common number of children is 4 or more.");
		}

	}

}