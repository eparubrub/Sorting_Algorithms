import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;
public class SortingAlgorithms implements SortInterface {
	private static Comparable[] list1 = {};
	private static Comparable[] list2 = {};
	private static Comparable[] list3 = {};
	private static Record[] list1R = {};
	private static Record[] list2R = {};
	private static Record[] list3R = {};
	private static int[] list4 = {};
	private static int[] list5 = {};
	private static int[] list6 = {};
	public Comparable[] getlist1(){
		return list1;
	}
	
	public Comparable[] getlist2(){
		return list2;
	}
	
	public Comparable[] getlist3(){
		return list3;
	}
	public Record[] getlist1R(){
		return list1R;
	}
	
	public Record[] getlist2R(){
		return list2R;
	}
	
	public Record[] getlist3R(){
		return list3R;
	}
	public int[] getlist4(){
		return list4;
	}
	
	public int[] getlist5(){
		return list5;
	}
	
	public int[] getlist6(){
		return list6;
	}
	
	@Override
	public void shakerSort(Comparable[] array, int lowindex, int highindex) {
		for (int i = 0; i < (highindex-lowindex)/2; i++) {
			boolean swapTF = false;
			//goes from beginning to end of the array and swaps if the comparable before it is
			//bigger than the current comparable
			for (int j = lowindex+1; j <= highindex; j++) {
				if (array[j].compareTo(array[j - 1])<0) {
					Comparable tmp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = tmp;
					swapTF = true;
				}
			}

			//goes from the end to beginning of the array and swaps if the comparable before it
			//is smaller than the current comparable
			for (int j = highindex-1; j >= lowindex; j--) {
				if (array[j].compareTo(array[j + 1])>0) {
					Comparable tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
					swapTF = true;
				}
			}
			
			//breaks if it the array is already sorted
			if(swapTF == false) {
				break;
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void heapSort(Comparable[] array, int lowindex, int highindex) {
		//swaps down smaller values from beginning to end by comparing parent and child
		//and the children with which is bigger. Then whole function for making it a max heap
		//is O(2n) which we drop the constant and get O(n)
			for (int i = 0; i < array.length; i++) {
				if (rightChild(i)<highindex && leftChild(i)<highindex){
						if(array[(i)].compareTo(array[rightChild(i)])<0 && (array[leftChild(i)].compareTo(array[rightChild(i)])<0)){
							swap(array, i, rightChild(i));
							
							
						}
						else if(array[(i)].compareTo(array[rightChild(i)])<0 && (array[leftChild(i)].compareTo(array[rightChild(i)])>0)){
							swap(array, i, leftChild(i));
							
						}
						else if(array[(i)].compareTo(array[leftChild(i)])<0 && (array[leftChild(i)].compareTo(array[rightChild(i)])>0)){
							swap(array, i, leftChild(i));
						
						}
				}
			}
			
			//swaps up bigger values from end to beginning
			for (int i = array.length-1; i> 0; i--) {
//				System.out.println();
//				print(array);
				if ((array[parent(i)].compareTo(array[i])<0)){
					swap(array, parent(i), i);
				}
			}
//			System.out.println();
//			System.out.println("Max heap: " );
//			print(array);
//			System.out.println();
			//bubbles down everything that is the biggest in the heap within the
			//high and low indexO(nlogn)
			for (int j = highindex; j>lowindex-1; j--){
				for (int i=lowindex; i<j; i++){
					if (array[i].compareTo(array[i+1])>0){
						swap(array, i, i+1);
					}
				}
			}
		  
	}

	@Override
	public void randomizedQuickSort(Comparable[] array, int lowindex, int highindex) {
		int pivot;
		//recursively calls randomized quicksort
		if (lowindex < highindex) {
			pivot = partition(array, lowindex, highindex);
			shakerSort(array, lowindex, pivot - 1);
			shakerSort(array, pivot + 1, highindex);
		}
	}

	//sorts the array and returns the place in which the array splits
	//in order to call randomizedQuickSort on the left and right
	//of the partition
	private int partition(Comparable arr[], int low, int high) {
		int pivot;
		int tmp;
		int max = high;
		int mid = (int) getRandomIntInclusive(low, high); 
		//switches the pivot point with the end to get it out of the way
		tmp = (int) arr[mid];
		arr[mid] = arr[high];
		arr[high] = tmp;
		pivot = (int) arr[high];
		low--;
		//keep doing this while low<high
		do {
			//while the array pointer (low) on the left is less than the pivot it moves right
			while ((int)arr[++low] < pivot)
				;
			//while the array pointer (high) on the right is more than the pivot it moves left
			while ((low < high) && ((int)arr[--high] > pivot))
				;
			//switches the high and low
			tmp = (int) arr[low];
			arr[low] = arr[high];
			arr[high] = tmp;
		} while (low < high);
		//switches the low with the pivot then returns it
		tmp = (int) arr[low];
		arr[low] = arr[max];
		arr[max] = tmp;
		return low;
	}

	@SuppressWarnings({ "unchecked", "resource" })
	@Override
	public void externalSort(String inputFile, String outputFile, int n, int m) {
		//reads in the file with bufered reader while there are no empty lines
		//also puts it into a readable array called ListNums
		BufferedReader br = null;
		FileReader fr = null;
		String[] ListNums = null;
		try {
			fr = new FileReader(inputFile);
			br = new BufferedReader(fr);
			BufferedReader br2 = new BufferedReader(fr);
			String sCurrentLine;
			int fileLineCount = 0;
			br = new BufferedReader(new FileReader(inputFile));
			while ((sCurrentLine = br.readLine()) != null) {
				fileLineCount++;
			}
			ListNums = new String[fileLineCount];
			int brCount = 0;
			while ((sCurrentLine = br2.readLine()) != null && brCount<n) {
//				System.out.println("INPUT: " + sCurrentLine);
				ListNums[brCount] = sCurrentLine;
				brCount++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//makes a new list for the Sublist names for reading it in later
		int count =0;
		String[] SublistNames = new String[(int) Math.floor(n/m)+1];
		int SublistCount = 0;
		int parseCount = 0;
		//all reading in the files, making a new array for each, quicksorting them
		//then outputing them into respective files
		while(count<n){
			int newCount = 0;
			int[] newArray = new int[m];
			//makes an array of the values in the file
			while (newCount<m&&count<n){
				newArray[newCount] = Integer.parseInt(ListNums[count]);
				newCount++;
				count++;
			}
			//had to make a new array because randomized quicksort runs only if
			//the array is first an integer array then cast to a comparable
			Comparable[] newComparableArray = new Comparable[newArray.length];
			int arrayCount = 0;
			//gets an array count for all the new integers in the array
			for(int a:newArray){
				if(a ==0){
					newComparableArray[arrayCount] = -1;
					arrayCount++;
				}
				else{
					newComparableArray[arrayCount] = a;
					arrayCount++;
				}
			}
			//sorts the arrays individually
			shakerSort(newComparableArray, 0, m-1);
			String outputString = "";
			for(Comparable a:newComparableArray){
				outputString = outputString + a + "\n";
			}
			try {
				//outputs the values of each new array after they are sorted
				SublistNames[SublistCount] = ("ParsedAt" + parseCount + "Results.txt");
				SublistCount++;
				PrintWriter writer = new PrintWriter("ParsedAt" + parseCount + "Results.txt", "UTF-8");
				writer.println(outputString);
				writer.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}			
			parseCount = parseCount + m;
		}
		//makes new list that is output into a txt for the final array
		Comparable[] outputList = new Comparable[n];
		int totalDmem = n/m +1;
		//makes an array of bufferedreaders
		BufferedReader[] readers = new BufferedReader[totalDmem]; 
		for(int i = 0; i<totalDmem;i++){
			try {
				int inputInt = i*m;
				readers[i] = new BufferedReader(new FileReader("ParsedAt" + (inputInt) + "Results.txt"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		//makes a temporary array of each file integers as long as they dont have -1;
		Comparable[] readersArray = new Comparable[totalDmem];
		for (int i=0; i<totalDmem; i++){
			try {
				String tempString = readers[i].readLine();
				if (tempString.compareTo("-1")==0){
					while(tempString.compareTo("-1")==0){
						tempString = readers[i].readLine();
					}
				}
				readersArray[i] = Integer.parseInt(tempString);
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		}
		
		Comparable[] sortedArray = readersArray;
		shakerSort(sortedArray, 0, sortedArray.length-1);
		//goes through both arrays, one sorted and one in order to get the placement of 
		//where the integer is in the buffered reader. We go through and check which one
		//to read more in the file. Once we do we add the number to the output then we 
		//read deeper into the file and add it to the reader and sort it in the sorted list
		//then do it all over again
		int banana=0;
		do{
		int imRunningOutOfNames = 0;
		for(int readersParse=0; readersParse<totalDmem; readersParse++){
			for(int sortParse=0; sortParse<totalDmem; sortParse++){
				if(sortedArray[sortParse]==(readersArray[readersParse]) && !(sortedArray[sortParse]).equals(-1) && imRunningOutOfNames <1){
					try {
						outputList[banana] = sortedArray[sortParse];
						String tmpStr = (readers[readersParse].readLine());
						int tmpInt=-1;
						if (!tmpStr.equals("")){
							tmpInt = Integer.parseInt(tmpStr);
						}
						
					if (tmpInt!=-1 || tmpInt!=0){
						readersArray[readersParse] = tmpInt;
					}
					if(tmpInt==-1){
						readersArray[readersParse] = -1;
					}
					sortedArray=readersArray;
					imRunningOutOfNames++;
					shakerSort(sortedArray, 0, sortedArray.length-1);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}banana++;		
		}while(banana<n);
		//outputs Final String
		PrintWriter writer =null;
		try {
			writer = new PrintWriter("output", "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
//		System.out.println();
		for(Comparable i: outputList){
//			System.out.println("OUTPUT: " + i);
			writer.println(i);
		}
		writer.close();

		
	}

	//note: on the instructions it says this algorithm must have run time of O(n)
	//not Theta(n) and my algorithm has a run time of 2n but the run time is still
	//technically O(n) because we drop constants when looking at runtime
	@Override
	public void rgbSort(String[] array) {
		int j = 0;
		int i = 1;
		int index = 0;
		//goes through array and switches the r values to the front
		for (int b = 0; b < array.length-1; b++){
			if (array[j].compareTo("r")!=0 && array[i].compareTo("r")==0){
//				System.out.println();
//				print(array);
				String tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
				j++;
				i++;
				index++;
			}
			else if (array[j].compareTo("r")!=0 && array[i].compareTo("r")!=0){
				i++;
			}
			else if (array[i].compareTo("r")==0){
				j++;
				i++;
				index++;
			}
		}
		j = 0 + index;
		i = 1 + index;
		//goes through second array, and switches g values to front of r values
		//based on the index value
		for (int b = index; b < array.length-1; b++){
			if (array[j].compareTo("g")!=0 && array[i].compareTo("g")==0){
//				System.out.println();
//				print(array);
				String tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
				j++;
				i++;
			}
			else if (array[j].compareTo("g")!=0 && array[i].compareTo("g")!=0){
				i++;
			}
			
			else if (array[j].compareTo("g")==0){
				i++;
				j++;
			}
			
		}
//		System.out.println();
//		print(array);
		
	}
	
	@Override
	public void combSort(Comparable[] array, int lowindex, int highindex) {
		
		int n = ((highindex-lowindex) + 1);
		double k = 1.3;
		double gap = n/k;
		//bubble sorts with the low and highindex depending on the gap
		//uses the gap and moves through untill the high end of it hits
		//the high index. It swaps and moves then when it stops the gap
		//gets smaller by a factor of k, in this method its by 1.3
		while(gap>=1){
			int hightmp = (int) (lowindex+gap);
			int lowtmp = lowindex;
			while (hightmp<= highindex){
				if (array[lowtmp].compareTo(array[(int) (hightmp)])>0){
					swap(array, lowtmp, hightmp);
				}
				lowtmp++;
				hightmp++;
//			System.out.println();
//			print(array);
			}gap = Math.floor(gap/k);
//			System.out.println("BREAK");
		}
		//additional passes for bubble sort when gap=1
		//keeps running bubble sort until there are no swaps
		//made in previous pass
		boolean TF = false;
		while (TF==false){
			TF=true;
			for (int i=lowindex; i<highindex; i++){
				if (array[i].compareTo(array[i+1])>0){
					swap(array, i, i+1);
					TF=false;
//					System.out.println();
//					print(array);
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void iterativeMergeSort(Comparable[] array) {
		//start with gap = 1 because we combine numbers in twos first.
		int gap = 1;
		int numberOfRuns = array.length/2;
		int index1, index1end, index2, index2end;
		int increment = 0;
		//temp array that stores vairables after comparing
		Comparable[] tmpArray = new Comparable[array.length];
		//goes through an array while the gap is less than or equal to
		//the array length divided by two. If it is the array length divided by two
		//that means the two intervals we are comparing are the sublists within the 
		//array which are two halves of the array. After that there is nothing else
		//to compare because thats the whole array.
		while(gap<=array.length/2){
			increment = 0;
			numberOfRuns = array.length/(gap*2);
			//goes through each pair of sublists from left to right until the increment
			// is equal to the number of runs(-1 because the list starts at 0)
			while (increment <= numberOfRuns-1){
				index1 = 0;
				index1 = increment*(gap*2);
				index1end = index1 + gap;
				index2 = index1end;
				index2end = index1end + gap;
				int k = index1;
				int kEnd = index1 + (gap*2);
				//compares the left and right sublists and iterates through them and compares
				//them respectively. They add the smallest number to the temp array then continues to 
				//increment
				while (k<kEnd && index1<index1end+1 && index2<index2end+1){
					if(index1==index1end){
						tmpArray[k] = array[index2];
						k++;
						index2++;
					}
					else if(index2==index2end){
						tmpArray[k] = array[index1];
						k++;
						index1++;
					}
					else if (array[index1].compareTo(array[index2])<0){
						tmpArray[k] = array[index1];
						k++;
						index1++;
					}
					else{
						tmpArray[k] = array[index2];
						k++;
						index2++;
					}
//					System.out.println();
//					print(tmpArray);
				}
				increment++;
			}
			//makes the original array equal the new sorted temp array
			for(int i=0; i< array.length; i++){
				array[i] = tmpArray[i];
			}
			//gap is increased by 2
			gap = gap*2;
		}
	}

	@Override
	public void radixSort(int[] array, int lowindex, int highindex) {
		// First, compute the number of digits in each key
		// Since we assume they all have the same # of digits,
		// it's enough to compute the # of digits in the first key
		if (array.length == 0)
			return;
		int ndigits = (int) (Math.log10(array[0]) + 1);
//		System.out.println();
		int[] temp = new int[(highindex-lowindex)+1];
		
		int[] count = new int[10]; // count array for counting sort
		for (int i = 0, place = 1; i < ndigits; i++, place *= 10) {
			// place will be 1, then 10, then 100, then 1000, etc.
			// initialize count array with all 0s
			for (int j = 0; j < 10; j++){
				count[j] = 0;
			}
			
			// iterate over arr and fill out count array for the placement
			//its looking at
			for (int j = lowindex; j < highindex+1; j++) {
				int k = (array[j] / place) % 10;
				count[k]++;
			}
			 // modified count array to edit. adds values each time
			//it goes over a value
			for (int j = 1; j < 10; j++){
				count[j] += count[j - 1];
			}
			
			// puts result in temp
			for (int j = highindex; j >= lowindex; j--){
				temp[--count[(array[j] / place) % 10]] = array[j];
			}
			
			// copy the result back into arr
			for (int j = lowindex; j <= highindex; j++) {
				array[j] = temp[j-lowindex];
			}
		}
	}
	
	@Override
	public void hybridSort(Comparable[] array, int lowindex, int highindex) {
		int pivot;
		double sizeOfTheDataSet = (highindex-lowindex);
		double tenPercentOfArray = (array.length*.10);
		//recursively calls randomized quicksort unless the size (highindex-lowindex) is
		//%10 or less of the size of the array in which we call insertion sort which makes
		//the quicksort quicker because it has a smaller size of the sublist so insertion sort
		//is more efficient in this case
		if (lowindex < highindex && sizeOfTheDataSet>tenPercentOfArray) {
			pivot = partition(array, lowindex, highindex);
			hybridSort(array, lowindex, pivot - 1);
			hybridSort(array, pivot + 1, highindex);
		}
		else if (lowindex<highindex){
			insertionSort(array, lowindex, highindex);
		}
	}
	
	@Override
	public void bucketSort(Record[] array, int lowindex, int highindex) {
		ArrayList<LinkedList<Record>> buckets = new ArrayList<LinkedList<Record>>(); 
		int numOfBuckets = (highindex-lowindex + 1) / 2;
		int highestNum = 0;
		//gets the highest number in the array
		for (Record i: array){
			if(i.key()>highestNum){
				highestNum = i.key();
			}
		}
		int range = (highestNum/numOfBuckets) + 1;
		//initialize the buckets list
		for (int i = 0; i< numOfBuckets; i++){
			buckets.add(new LinkedList<Record>());
		}
//		for (LinkedList i:buckets){
//			System.out.println("BUCKT!@#E: " + i);
//		}
		//goes through each Record in the array
		//then adds them to the corresponding linkedList
		//in the ArrayList based on their "bucketIndex"
		//which is based on the size of the key
		for (int i = lowindex; i < highindex+1; i++){
			int bucketIndex = array[i].key()/range;
			//adds the record if the linked list is empty
			if (buckets.get(bucketIndex).isEmpty()){
				buckets.get(bucketIndex).add(array[i]);
			}
			else{
				int iterateNum = 0;
				int BSIZE = buckets.get(bucketIndex).size();
				boolean TF = false;
				//adds the Record in order
				while(iterateNum<BSIZE && TF==false){
					if (buckets.get(bucketIndex).get(iterateNum).key() >= array[i].key() && buckets.get(bucketIndex).size()==1){
						buckets.get(bucketIndex).addFirst(array[i]);		
						TF=true;
					}
					else if (buckets.get(bucketIndex).get(iterateNum).key() >= array[i].key()){
						buckets.get(bucketIndex).add(iterateNum, array[i]);
						
						TF=true;
					}
					iterateNum++;
				}
				if(TF == false){
					buckets.get(bucketIndex).addLast(array[i]);
				}
			}
		}
		//uncomment to check buckets
//		for (LinkedList i:buckets){
//			System.out.println("BUCKETS: " + i);
//		}
		//adds the numbers in temp back to the array
		//based on their position with the lowindex
		//and highindex
		int count = lowindex;
		while(count<highindex){
			for (LinkedList i:buckets){
				for (int j = 0; j<i.size(); j++){
					array[count] = (Record) i.get(j);
					count++;
				}
			}
		}
	}
	
	
	//prints values in a given array 
	public void print(Comparable[] a) {
		for (int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	//insertion sort
	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	private void insertionSort(Comparable[] array,int lowindex, int highindex){
		 Comparable temp;
		 //go through array and sends the smallest number down by comparing
		 //the number with number before it
	        for (int i = lowindex + 1; i < highindex+1; i++) {
	            for(int j = i ; j > lowindex ; j--){
	                if(array[j].compareTo(array[j-1])<0){
	                    temp = array[j];
	                    array[j] = array[j-1];
	                    array[j-1] = temp;
	                }
	            }
	        }		
	}
	
	//gets a random integer between two numbers
	private double getRandomIntInclusive(int min, int  max) {
		  double minR = Math.ceil(min);
		  double maxR = Math.floor(max);
		  return Math.floor(Math.random() * (maxR - minR + 1)) + minR;
	}
	
	private int parent(int pos) {
		return Math.floorDiv(pos, 2) ;
	}
	
	private int leftChild(int pos) {
		return 2 * pos + 1;
	}
	
	private int rightChild(int pos) {
		return 2 * pos + 2;
	}
	
	private void swap(Comparable[] array, int pos1, int pos2) {
		Comparable tmp;
		tmp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = tmp;
	}
	
	public static double makeKindLists(int listSize, int numIters){
		list1 = new Comparable[listSize];
		list2 = new Comparable[listSize];
		list3 = new Comparable[listSize];
		long startTimeOverhead = System.currentTimeMillis();
			for(int i = 0;i < numIters; i++) { // generate a random list
				Random rand = new Random();
				//sorted list
				
				for (int v=0; v < listSize; v++){
					int  n = v + 2;
					list1[v] = n;
				}
				
				//random list
				for (int j=0; j < listSize; j++){
					int  n = rand.nextInt(listSize);
					list2[j] = n;
				}
				
				//descending list
				int k = listSize-1;
				for (int g=0; g < listSize; g++){
					int  n = k+2;
					list3[g] = n;
					k--;
				}
				
			}
			if(listSize==100){
			System.out.println();
			System.out.println("List1 sorted list:");
			for (Comparable v: list1){
				System.out.print(v + " ");
			}
			System.out.println();
			System.out.println("List2 random list:");
			for (Comparable v: list2){
				System.out.print(v + " ");
			}
			System.out.println();
			System.out.println("List3 descending list:");
			for (Comparable v: list3){
				System.out.print(v + " ");
			}
			}
		long endTimeOverhead = System.currentTimeMillis();
		double durationOverhead = ((double) (endTimeOverhead - startTimeOverhead)) / numIters;
		return durationOverhead;
	}
	
	public static double makeKindListsForRadixSort(int listSize, int numIters){
		list4 = new int[listSize];
		list5 = new int[listSize];
		list6 = new int[listSize];
		long startTimeOverhead = System.currentTimeMillis();
			for(int i = 0;i < numIters; i++) { // generate a random list
				Random rand = new Random();
				//sorted list
				
				for (int v=0; v < listSize; v++){
					int  n = v + 2;
					list4[v] = n;
				}
				
				//random list
				for (int j=0; j < listSize; j++){
					int  n = rand.nextInt(listSize);
					list5[j] = n;
				}
				
				//descending list
				int k = listSize-1;
				for (int g=0; g < listSize; g++){
					int  n = k+2;
					list6[g] = n;
					k--;
				}
				
			}
			if(listSize==100){
			System.out.println();
			System.out.println("List4 sorted list:");
			for (Comparable v: list4){
				System.out.print(v + " ");
			}
			System.out.println();
			System.out.println("List5 random list:");
			for (Comparable v: list5){
				System.out.print(v + " ");
			}
			System.out.println();
			System.out.println("List6 descending list:");
			for (Comparable v: list6){
				System.out.print(v + " ");
			}
			}
		long endTimeOverhead = System.currentTimeMillis();
		double durationOverhead = ((double) (endTimeOverhead - startTimeOverhead)) / numIters;
		return durationOverhead;
	}
	
	public static double makeKindListsForBuckets(int listSize, int numIters){
		list1R = new Record[listSize];
		list2R = new Record[listSize];
		list3R = new Record[listSize];
		long startTimeOverhead = System.currentTimeMillis();
			for(int i = 0;i < numIters; i++) { // generate a random list
				Random rand = new Random();
				//sorted list
				
				for (int v=0; v < listSize; v++){
					int  n = v + 2;
					Record Rname = new Record(n, 1);
					list1R[v] = Rname;
				}
				
				//random list
				for (int j=0; j < listSize; j++){
					int  n = rand.nextInt(listSize);
					Record Rname = new Record(n, 1);
					list2R[j] = Rname;
				}
				
				//descending list
				int k = listSize-1;
				for (int g=0; g < listSize; g++){
					int  n = k+2;
					Record Rname = new Record(n, 1);
					list3R[g] = Rname;
					k--;
				}
				
			}
			if(listSize==100){
			System.out.println();
			System.out.println("List1 sorted list:");
			for (Record i :list1R){
				System.out.print(i + ", ");
			}
			System.out.println();
			System.out.println("List2 random list:");
			for (Record i :list2R){
				System.out.print(i + ", ");
			};
			System.out.println();
			System.out.println("List3 descending list:");
			for (Record i :list3R){
				System.out.print(i + ", ");
			}
			}
		long endTimeOverhead = System.currentTimeMillis();
		double durationOverhead = ((double) (endTimeOverhead - startTimeOverhead)) / numIters;
		return durationOverhead;
	}
	

}
