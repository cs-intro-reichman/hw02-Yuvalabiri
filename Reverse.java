public class Reverse{

    public static void main(String[]args) {
        String og = args[0]; 
        int length = og.length();
        for (int index = 0; index < length; index++) {
            char chr = og.charAt(length - 1 - index);
            System.out.print(chr);    
        }
        System.out.println();
        if (length % 2 == 0){
        System.out.println("The  middle character is" + " " + og.charAt((length - 1) / 2));
        } else {
            System.out.println("The  middle character is" + " " + og.charAt(length / 2));
        } 
    
	}

}
