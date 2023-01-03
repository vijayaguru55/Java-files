/*
 * 91.Java Program to sort the characters in a word in descending.
 */
public class Q91 {
    static void sortBydescending(String s){
       char[] characters = s.toCharArray();
       int i=0;
		int j=i+1;
		while(i<characters.length-1) {
            String c1 = String.valueOf(characters[i]), c2=String.valueOf(characters[j]);
			if(c1.compareTo(c2)<0) {
				char word = characters[i];
				characters[i] = characters[j];
				characters[j] =word;
			}
			if(j==characters.length-1) {
				i++;
				j=i+1;
			}else {
				j++;
			}
		}

        for (char c : characters) {
            System.out.print(c);
        }
    }
    public static void main(String[] args) {
        String word = "Transparent";
        sortBydescending(word);
    }
}
