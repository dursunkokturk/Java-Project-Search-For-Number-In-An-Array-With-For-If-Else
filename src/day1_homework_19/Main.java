package day1_homework_19;

public class Main {

	public static void main(String[] args) {
		
		// Array Icinde Aranan Sayi Var Mi Yok Mu
		int[] numbers = new int[] {1,2,5,7,9,0};
		int searchNumber = 5;
		
		boolean isThere = false;
		
		for (int search : numbers) {
			if (search == searchNumber) {
				isThere = true;
				break;
			}
		}
		
		if (isThere){
			System.out.println("Say� Var");
		}else {
			System.out.println("Say� Yok");
		}
	}
}