import java.util.Scanner;

public class SolutionA {

    public static void main(String[] args) {


        int length;
        int inputArray[];

        Scanner sc = new Scanner(System.in);

        //Input the length of inputArray from user
        System.out.println("Enter the length of inputArray");
        length = sc.nextInt();

        //Input the elements of inputArray
        inputArray = new int[length + 1];
        System.out.println("Enter the elements for inputArray");
        for (int i = 1; i <= length; i++) {
            inputArray[i] = sc.nextInt();
        }

        //Print the element for which index value is same else print NOT_FOUND
        if (binarySearch(inputArray, 0, inputArray.length) > 0) {
            System.out.println(binarySearch(inputArray, 0, inputArray.length));
        } else {
            System.out.println("NOT_FOUND");
        }

    }

    // Modified binary search to address the requirement of assignment to search element == index in log(n) time complexity.
    // Therefore, modified binary search to just search for element == index and not any key.
    static int binarySearch(int arr[], int l, int r) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == mid)
                return mid;
            if (arr[mid] > mid)
                return binarySearch(arr, l, mid - 1);
            return binarySearch(arr, mid + 1, r);
        }
        return -1;
    }

}

