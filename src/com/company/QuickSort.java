public class QuickSort {

    int partition(int inputArray[], int smaller, int greater) {
        int pivot = inputArray[greater];
        int i = (smaller - 1);
        for (int j = smaller; j < greater; j++) {

            if (inputArray[j] <= pivot) {
                i++;
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
            }
        }

        int temp = inputArray[i + 1];
        inputArray[i + 1] = inputArray[greater];
        inputArray[greater] = temp;

        return i + 1;
    }


    void quickSort(int inputArray[], int smaller, int greater) {
        if (smaller < greater) {
            int k = partition(inputArray, smaller, greater);
            quickSort(inputArray, smaller, k - 1);
            quickSort(inputArray, k + 1, greater);
        }
    }

}
