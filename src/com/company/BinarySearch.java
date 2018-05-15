package com.company;

import java.util.Scanner;

public class BinarySearch {

/*    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        int count = 0;
        if(inputArr[inputArr.length/2]==key){
            count = count;
        }
        if(inputArr[inputArr.length/2]<key){
            getBinarySearchUnsuccessfulComparisonCount(subsetArray(inputArr,(inputArr.length/2)+1,inputArr.length),(inputArr.length/2)+1);
            count = count+1;
        }
        if(inputArr[inputArr.length/2]>key){
            getBinarySearchUnsuccessfulComparisonCount(subsetArray(inputArr,(inputArr.length/2)-1),(inputArr.length/2)-1);
            count = count+1;
        }
        else{ count = count+1;}
        return count;
    }*/

    int count = 0;

    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {

        if(inputArr.length==0){
            return -1;
        }

        return binarySearch(inputArr,key,0,inputArr.length-1);
    }

    public int binarySearch(int[] inputArr, int key, int start, int end){

        int mid = (start+end)/2;

        if(inputArr[mid] == key){
            count = count;
        }
        else if(inputArr[mid]<key){
            start = mid +1;
            count = count +1;
            binarySearch(inputArr,key,start,end);
        }
        else if(inputArr[mid]>key){
            end = mid-1;
            count = count+1;
            binarySearch(inputArr,key,start,end);
        }
        else{return -1;}

        return count;
    }

    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        BinarySearch s = new BinarySearch();
        int n = scan.nextInt();
        int inputArr[] = new int[n];
        for (int i = 0; i < n; i++) {
            inputArr[i] = scan.nextInt();
        }
        int key = scan.nextInt();
        System.out.println(s.getBinarySearchUnsuccessfulComparisonCount(inputArr, key));
    }

}
