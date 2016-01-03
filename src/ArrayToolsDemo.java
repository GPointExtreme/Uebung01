
public class ArrayToolsDemo {

	public static void main(String[] args) {
		
		int[] data1 = {1, 2, 3, 4};
		int[] data2 = {3, 4, 5, 6};
		
		int[] array = ArrayTools.intersectCount(data1, data2);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("--------------");
		
		int[] data3 = {1, 2, 3, 2, 3, 4};
		
		int[] array1 = ArrayTools.distinct(data3);
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("--------------");
		
		int[] data4 = {1, 2, 3, 4};
		
		System.out.println(ArrayTools.isSorted(data4));
		
	}

}
