public class BubbleSort {

    public void bubbleSort(int[] inputArray) {

        int n = inputArray.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (inputArray[j - 1] > inputArray[j]) {
                    swap(inputArray, j - 1, j);
//                    int temp = inputArray[j-1];
//                    inputArray[j-1]=inputArray[j];
//                    inputArray[j]=temp;
                }
            }
        }

    }

    public int bubbleSort(int[] inputArray, int numberOfIteration) {

        int count = 0;
        for (int i = 0; i < numberOfIteration; i++) {
            for (int j = 1; j < inputArray.length - i; j++) {
                if (inputArray[j - 1] < inputArray[j]) {
                    swap(inputArray, j - 1, j);
                    count = count + 1;

                }
            }
        }
        return count;
    }

    public void swap(int[] inputArray, int firstIndex, int secondIndex) {
        int temp;
        temp = inputArray[firstIndex];
        inputArray[firstIndex] = inputArray[secondIndex];
        inputArray[secondIndex] = temp;
    }
}
