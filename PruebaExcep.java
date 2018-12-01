public class PruebaExcep {
	public static void main(String[] args){
		int numeros[] = new int[5];
		
		for (int i = 0; i <= 5; i++) {
			try {
				numeros[i] = i;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		}
	}
}