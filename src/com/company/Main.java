import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        String names[] = new String[size];
        int lengthNames[] = new int[size];

        for (int i = 0; i < size; i++) {
            names[i] = scan.next();
        }
        for (int i = 0; i < size; i++) {
            lengthNames[i] = names[i].length();
        }


        //int[] randomArray = {2,4,6,8,10,12,14,16,18,20};
        QuickSort qSort = new QuickSort();
        //System.out.println(InsertionSort.insertionSortComparision(randomArray));
        qSort.quickSort(lengthNames, 0, lengthNames.length - 1);
        ArrayUtility.printArray(lengthNames);
        ArrayUtility.printNameWithLength(names, lengthNames);
    }
}
