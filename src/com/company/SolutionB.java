import java.util.Scanner;

public class SolutionB {

    public static void main(String[] args) {

        int length;
        int key;
        int inputArray[];
        int sortedinputArray[];
        int index;

        Scanner sc = new Scanner(System.in);

        //Input the length of inputArray from user
        System.out.println("Enter the length of inputArray");
        length = sc.nextInt();

        //Input the key to be searched
        System.out.println("Enter the key");
        key = sc.nextInt();

        //Input the elements of inputArray
        inputArray = new int[length + 1];
        System.out.println("Enter the elements for inputArray");
        for (int i = 1; i <= length; i++) {
            inputArray[i] = sc.nextInt();
        }

        //Search for key
        index = binarySearch(inputArray, 1, 1, key);
        if (index == -1)
            System.out.println("NOT_FOUND");
        else
            System.out.println(index);
    }


    // binary search algorithm by not using length of array. 
    static int binarySearch(int inputArray[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (inputArray[mid] == x)
                return mid;
            if (inputArray[mid] > x)
                return binarySearch(inputArray, l, mid - 1, x);
            try {
                return binarySearch(inputArray, mid + 1, r * 2, x); // searching in the upper part of array by increasing r.
            } catch (ArrayIndexOutOfBoundsException e) {
                return binarySearch(inputArray, l, mid - 1, x); // if we have passed the last element of array the searching in lower part.
            }
        }
        return -1;
    }
}
