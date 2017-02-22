package com.sapient.java.sort;

public class MS {
    private int arr[];
    private int tempArr[];
    private int length;

    public static void main(String[] args) {
           int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
           new MS().sort(inputArr);
           for(int i:inputArr){
                  System.out.println(i);
           }
    }

    private void sort(int[] inputArr){
           this.arr = inputArr;
           this.length = inputArr.length;
           this.tempArr = new int[length];
           doMergeSort(0,length-1);
           
    }

    private void doMergeSort(int lowerIndex, int higherIndex){
           if(lowerIndex < higherIndex){
                  int midIndex = lowerIndex+((higherIndex-lowerIndex)/2);
                  doMergeSort(lowerIndex, midIndex);
                  doMergeSort(midIndex+1, higherIndex);
                  mergeParts(lowerIndex,midIndex,higherIndex);
           }
    }

    private void mergeParts(int lowerIndex,int midIndex,int higherIndex){
           System.arraycopy(arr, 0, tempArr, 0, length);
           int i = lowerIndex;
           int j = midIndex+1;
           int k = lowerIndex;
           while(i<= midIndex && j<= higherIndex){
                  if(tempArr[i] < tempArr[j]){
                        arr[k] = tempArr[i];
                        i++;
                  }else{
                        arr[k] = tempArr[j];
                        j++;
                  }
                  k++;
           }
           while(i<= midIndex){
                  arr[k] = tempArr[i];
                  i++;
                  k++;
           }
           while(j<= higherIndex){
                  arr[k] = tempArr[i];
                  j++;
                  k++;
           }
    }
}
