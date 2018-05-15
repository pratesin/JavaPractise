package com.company;
import java.util.Scanner;
public class Main {

       public static int sum(int n) {
                if(n/10==0){
                    System.out.println("from if\t"+n);
                    return n;
                }
                else{
                    System.out.println("from else\t "+n);
                    System.out.println("Sum value \t"+"\t"+n%10+"\t"+(n%10 + sum(n/10)));
                    return n%10 + sum(n/10);
                }   //write the logic here
            }
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                BinarySearch s = new BinarySearch();
                int n = scan.nextInt();
                int inputArr[] = new int[n];
                for (int i =0;i<n;i++){
                    inputArr[i] = scan.nextInt();
                }
                int key = scan.nextInt();
                System.out.println(inputArr[inputArr.length/2]);
                //int [] temp = s.subsetArray(inputArr,inputArr.length/2+1,inputArr.length);
                //s.printArray(temp);
            }

        }


