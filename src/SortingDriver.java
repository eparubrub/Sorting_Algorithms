/** A Driver class for SortingAlgorithms.java */

public class SortingDriver {
	public static void main(String[] args) {
		SortingAlgorithms SortingA = new SortingAlgorithms();
		Comparable[] a = {6, 1, 9, 2, 5, 8, 9, 3, 6, 4};
		System.out.println("Array before shakerSort:");
		SortingA.print(a);
		SortingA.shakerSort(a,0,9);
		System.out.println();
		System.out.println("Array after Shaker Sort:");
		SortingA.print(a);
		System.out.println();
		
		Comparable[] c = {12, 2, 7, 5, 8, 9, 3, 6, 4, 13};
		System.out.println();
		System.out.println("Array before heapSort:");
		SortingA.print(c);
		SortingA.heapSort(c, 3,7);
		System.out.println("Array after heapSort:");
		SortingA.print(c);
		System.out.println();
		
		String[] rgb = {"b", "r", "g", "g", "g", "b", "r", "g", "r", "r", "g", "b", };
		System.out.println();
		System.out.println("Array before RGBSort: ");
		SortingA.print(rgb);
		SortingA.rgbSort(rgb);
		System.out.println();
		System.out.println("Array after RGBSort:" );
		SortingA.print(rgb);
		System.out.println();
		System.out.println();
		
		Comparable[] b = {5, 2, 9, 12, 6, 8, 3, 7};
		System.out.println("Array before randomized quick sort:" );
		SortingA.print(b);
		SortingA.randomizedQuickSort(b, 0, 7);
		System.out.println(); 
		System.out.println("Array before randomized quick sort:" );
		SortingA.print(b);
		System.out.println();
		System.out.println();
		System.out.println("external sort: ");
		SortingA.externalSort("integerArray.txt", "banana", 10, 3);
		System.out.println();

		
		Comparable[] d = {13, 9, 6, 8, 2, 10, 4, 5, 17, 1};
		System.out.println("Array before combSort:");
		SortingA.print(d);
		SortingA.combSort(d,0,9);
		System.out.println();
		System.out.println("Array after combSort:");
		SortingA.print(d);
		System.out.println();
		System.out.println();
		
		Comparable[] e = {15, 3, 7, 10, 9, 1, 18, 6, 4, 8, 12, 67, 17, 13, 8, 2};
		System.out.println("Array before iterativeMergeSort:");
		SortingA.print(e);
		SortingA.iterativeMergeSort(e);
		System.out.println();
		System.out.println("Array after iterativeMergeSort:");
		SortingA.print(e);
		System.out.println();
		System.out.println();


		
		int[] f = {55, 3, 7, 10, 9, 1, 18, 6, 4, 8, 12, 67, 17, 13, 8, 2};
		System.out.println("Array before radixSort:");
		for(int i=0; i<f.length; i++){
			System.out.print(f[i] + " ");
		}
		SortingA.radixSort(f, 4, 9);
		System.out.println("Array after radixSort: (testing from 4-9)");
		for(int i=0; i<f.length; i++){
			System.out.print(f[i] + " ");
		}
		System.out.println();
		System.out.println();

		
		Comparable[] g = {15, 3, 7, 10, 9, 1, 18, 6, 4, 8, 12, 67, 17, 13, 8, 2};
		System.out.println("Array before hybridSort:");
		SortingA.print(g);
		System.out.println();
		SortingA.hybridSort(g, 2 , 7);
		System.out.println();
		System.out.println("Array after hybridSort: (testing from 2-7)");
		SortingA.print(g);
		System.out.println();
		System.out.println();


		
		Record R1 = new Record(5, 1);
		Record R2 = new Record(10, 1);
		Record R3 = new Record(2, 1);
		Record R4 = new Record(21, 1);
		Record R5 = new Record(17, 1);
		Record R6 = new Record(4, 1);
		Record R7 = new Record(14, 1);
		Record R8 = new Record(10, 1);
		Record[] bucketArray = {R1, R2, R3, R4, R5, R6, R7, R8};
		System.out.println("Array before bucketSort:");
		for (Record i :bucketArray){
			System.out.println(i);
		}
		SortingA.bucketSort(bucketArray, 3, 7);
		System.out.println();
		System.out.println("Array after bucketSort: (testing from 3-7)");
		for (Record i :bucketArray){
			System.out.println(i);
		}
	}
}
