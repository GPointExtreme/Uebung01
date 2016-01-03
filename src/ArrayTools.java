
public class ArrayTools {
	
	public static int[] intersectCount(int[] data1, int[] data2) {
		int counter = 0;
		for (int i = 0; i < data1.length; i++) {
			for (int j = 0; j < data2.length; j++) {
				if (data1[i] == data2[j]) {
					counter++;
				}
			}
		}
		int[] newArray = new int[counter];
		int newCounter = 0;
		for (int i = 0; i < data1.length; i++) {
			for (int j = 0; j < data2.length; j++) {
				if (data1[i] == data2[j]) {
					newArray[newCounter]=data1[i];
					newCounter++;
				}
			}
		}
		return newArray;
	}
	
	public static int[] distinct(int[] data) {
		int counter = 0;
		int prosition = 1;
		for (int i = 0; i < data.length; i++) {
			if (prosition == data[i]) {
					prosition++;
					counter++;
			}	
		}
		int[] newArray = new int[counter];
		int newCounter = 0;
		int newProsition = 1;
		for (int i = 0; i < data.length; i++) {
			if (newProsition == data[i]) {
				newArray[newCounter]=data[i];
				newProsition++;
				newCounter++;
			}
		}
		return newArray;
	}
	
	public static boolean isSorted(int[] data) {
		boolean rueckgabe = false;
		for (int i = 1; i < data.length; i++) {
			if (data[i-1] < data[i]) {
				rueckgabe = true;
			}
			else return false;
		}
		return rueckgabe; 
	}

}
