import java.util.Random;

public class Test {
	
	public static void main(String[] args) {
	SortingAlgorithms SortingA = new SortingAlgorithms();
	
	
	System.out.println("RANDOMIZEDQUICKSORT TEST:");
	double duration = 0;
	long startTime = System.currentTimeMillis();
	int numIters = 3;
	double overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(100,6));
		SortingA.randomizedQuickSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.randomizedQuickSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.randomizedQuickSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	
	long endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	
	System.out.println();
	System.out.println();
	System.out.println("After randomizedQuickSort with array of 100 integers: ");
	SortingA.print(SortingA.getlist1());
	System.out.println();
	SortingA.print(SortingA.getlist2());
	System.out.println();
	SortingA.print(SortingA.getlist3());
	System.out.println();
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(1000,6));
		SortingA.randomizedQuickSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.randomizedQuickSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.randomizedQuickSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After randomizedQuickSort with array of 1,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
//	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(10000,4));
		SortingA.randomizedQuickSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.randomizedQuickSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.randomizedQuickSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After randomizedQuickSort with array of 10,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
//	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(100000,2));
		SortingA.randomizedQuickSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.randomizedQuickSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.randomizedQuickSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After randomizedQuickSort with array of 100,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
//	
//	
//	
	System.out.println("HYBRIDSORT TEST:");
	duration = 0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(100,6));
		SortingA.hybridSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.hybridSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.hybridSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
//	
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
//	
	System.out.println();
	System.out.println();
	System.out.println("After hybridSort with array of 100 integers: ");
	SortingA.print(SortingA.getlist1());
	System.out.println();
	SortingA.print(SortingA.getlist2());
	System.out.println();
	SortingA.print(SortingA.getlist3());
	System.out.println();
	System.out.println("Total time without overhead: " + duration + " milliseconds");
//	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(1000,6));
		SortingA.hybridSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.hybridSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.hybridSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After hybridSort with array of 1,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
//	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(10000,4));
		SortingA.hybridSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.hybridSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.hybridSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After hybridSort with array of 10,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
//	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(100000,2));
		SortingA.hybridSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.hybridSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.hybridSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After hybridSort with array of 100,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	
	System.out.println("SHAKERSORT TEST:");
	duration = 0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(100,6));
		SortingA.shakerSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.shakerSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.shakerSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
//	
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
//	
	System.out.println();
	System.out.println();
	System.out.println("After shakerSort with array of 100 integers: ");
	SortingA.print(SortingA.getlist1());
	System.out.println();
	SortingA.print(SortingA.getlist2());
	System.out.println();
	SortingA.print(SortingA.getlist3());
	System.out.println();
	System.out.println("Total time without overhead: " + duration + " milliseconds");
//	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(1000,6));
		SortingA.shakerSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.shakerSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.shakerSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After shakerSort with array of 1,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(10000,4));
		SortingA.shakerSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.shakerSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.shakerSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After shakerSort with array of 10,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(100000,2));
		SortingA.shakerSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.shakerSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.shakerSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After shakerSort with array of 100,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	
	System.out.println("HEAPSORT TEST:");
	duration = 0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(100,6));
		SortingA.heapSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.heapSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.heapSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
//	
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
//	
	System.out.println();
	System.out.println();
	System.out.println("After heapSort with array of 100 integers: ");
	SortingA.print(SortingA.getlist1());
	System.out.println();
	SortingA.print(SortingA.getlist2());
	System.out.println();
	SortingA.print(SortingA.getlist3());
	System.out.println();
	System.out.println("Total time without overhead: " + duration + " milliseconds");
//	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(1000,6));
		SortingA.heapSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.heapSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.heapSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After heapSort with array of 1,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
//	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(10000,4));
		SortingA.heapSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.heapSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.heapSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After heapSort with array of 10,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(100000,2));
		SortingA.heapSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.heapSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.heapSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After heapSort with array of 100,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");

	
	System.out.println("COMBSORT TEST:");
	duration = 0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(100,6));
		SortingA.combSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.combSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.combSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	
	System.out.println();
	System.out.println();
	System.out.println("After combSort with array of 100 integers: ");
	SortingA.print(SortingA.getlist1());
	System.out.println();
	SortingA.print(SortingA.getlist2());
	System.out.println();
	SortingA.print(SortingA.getlist3());
	System.out.println();
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(1000,6));
		SortingA.combSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.combSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.combSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After combSort with array of 1,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(10000,4));
		SortingA.combSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.combSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.combSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After combSort with array of 10,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(100000,2));
		SortingA.combSort(SortingA.getlist1(), 0 , SortingA.getlist1().length-1);
		SortingA.combSort(SortingA.getlist2(), 0 , SortingA.getlist2().length-1);
		SortingA.combSort(SortingA.getlist3(), 0 , SortingA.getlist3().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After combSort with array of 100,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	
	System.out.println("ITERATIVEMERGESORT TEST:");
	duration = 0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(128,6));
		SortingA.iterativeMergeSort(SortingA.getlist1());
		SortingA.iterativeMergeSort(SortingA.getlist2());
		SortingA.iterativeMergeSort(SortingA.getlist3());
	}

	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	
	System.out.println();
	System.out.println();
	System.out.println("After iterativeMergeSort with array of 128 integers: ");
	SortingA.print(SortingA.getlist1());
	System.out.println();
	SortingA.print(SortingA.getlist2());
	System.out.println();
	SortingA.print(SortingA.getlist3());
	System.out.println();
	System.out.println("Total time without overhead: " + duration + " milliseconds");

	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(1024,6));
		SortingA.iterativeMergeSort(SortingA.getlist1());
		SortingA.iterativeMergeSort(SortingA.getlist2());
		SortingA.iterativeMergeSort(SortingA.getlist3());
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After iterativeMergeSort with array of 1,024 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(8192,4));
		SortingA.iterativeMergeSort(SortingA.getlist1());
		SortingA.iterativeMergeSort(SortingA.getlist2());
		SortingA.iterativeMergeSort(SortingA.getlist3());
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After iterativeMergeSort with array of 8,192 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");

	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindLists(131072,2));
		SortingA.iterativeMergeSort(SortingA.getlist1());
		SortingA.iterativeMergeSort(SortingA.getlist2());
		SortingA.iterativeMergeSort(SortingA.getlist3());
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After iterativeMergeSort with array of 131,072 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	
	System.out.println("BUCKETSORT TEST:");
	duration = 0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindListsForBuckets(100,3));
		SortingA.bucketSort(SortingA.getlist1R(), 0, SortingA.getlist1R().length-1);
		SortingA.bucketSort(SortingA.getlist2R(), 0, SortingA.getlist2R().length-1);
		SortingA.bucketSort(SortingA.getlist3R(), 0, SortingA.getlist3R().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After bucketSort with array of 100 integers: ");
	for (Record i :SortingA.getlist1R()){
		System.out.print(i + ", ");
	}
	System.out.println();
	for (Record i :SortingA.getlist2R()){
		System.out.print(i + ", ");
	}
	System.out.println();
	for (Record i :SortingA.getlist3R()){
		System.out.print(i + ", ");
	}
	System.out.println();
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	duration = 0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindListsForBuckets(1000,3));
		SortingA.bucketSort(SortingA.getlist1R(), 0, SortingA.getlist1R().length-1);
		SortingA.bucketSort(SortingA.getlist2R(), 0, SortingA.getlist2R().length-1);
		SortingA.bucketSort(SortingA.getlist3R(), 0, SortingA.getlist3R().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After bucketSort with array of 1,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	duration = 0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindListsForBuckets(10000,3));
		SortingA.bucketSort(SortingA.getlist1R(), 0, SortingA.getlist1R().length-1);
		SortingA.bucketSort(SortingA.getlist2R(), 0, SortingA.getlist2R().length-1);
		SortingA.bucketSort(SortingA.getlist3R(), 0, SortingA.getlist3R().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After bucketSort with array of 10,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	duration = 0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindListsForBuckets(100000,3));
		SortingA.bucketSort(SortingA.getlist1R(), 0, SortingA.getlist1R().length-1);
		SortingA.bucketSort(SortingA.getlist2R(), 0, SortingA.getlist2R().length-1);
		SortingA.bucketSort(SortingA.getlist3R(), 0, SortingA.getlist3R().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After bucketSort with array of 100,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	
	System.out.println("RADIXSORT TEST:");
	duration = 0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindListsForRadixSort(100,6));
		SortingA.radixSort(SortingA.getlist4(), 0 , SortingA.getlist4().length-1);
		SortingA.radixSort(SortingA.getlist5(), 0 , SortingA.getlist5().length-1);
		SortingA.radixSort(SortingA.getlist6(), 0 , SortingA.getlist6().length-1);
	}
	
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	
	System.out.println();
	System.out.println();
	System.out.println("After radixSort with array of 100 integers: ");
	for(int i: (SortingA.getlist4())){
		System.out.print(i + ", ");
	}
	System.out.println();
	for(int i: (SortingA.getlist5())){
		System.out.print(i + ", ");
	}
	System.out.println();
	for(int i: (SortingA.getlist6())){
		System.out.print(i + ", ");
	}
	System.out.println();
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindListsForRadixSort(1000,6));
		SortingA.radixSort(SortingA.getlist4(), 0 , SortingA.getlist4().length-1);
		SortingA.radixSort(SortingA.getlist5(), 0 , SortingA.getlist5().length-1);
		SortingA.radixSort(SortingA.getlist6(), 0 , SortingA.getlist6().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After radixSort with array of 1,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindListsForRadixSort(10000,4));
		SortingA.radixSort(SortingA.getlist4(), 0 , SortingA.getlist4().length-1);
		SortingA.radixSort(SortingA.getlist5(), 0 , SortingA.getlist5().length-1);
		SortingA.radixSort(SortingA.getlist6(), 0 , SortingA.getlist6().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After radixSort with array of 10,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	duration=0;
	startTime = System.currentTimeMillis();
	numIters = 3;
	overHeadTime = 0;
	for(int i = 0;i < numIters; i++) {
		overHeadTime += (SortingA.makeKindListsForRadixSort(100000,2));
		SortingA.radixSort(SortingA.getlist4(), 0 , SortingA.getlist4().length-1);
		SortingA.radixSort(SortingA.getlist5(), 0 , SortingA.getlist5().length-1);
		SortingA.radixSort(SortingA.getlist6(), 0 , SortingA.getlist6().length-1);
	}
	endTime = System.currentTimeMillis();
	duration = ((double) (endTime - startTime)) / numIters;
	duration = duration-overHeadTime;
	System.out.println();
	System.out.println();
	System.out.println("After radixSort with array of 100,000 integers: ");
	System.out.println("Total time without overhead: " + duration + " milliseconds");
	}
	
}
