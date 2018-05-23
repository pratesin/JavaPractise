public class InsertionSort {

    public static int insertionSortComparision(int[] inputArray) {

        int comparision = 0;
        int n = inputArray.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int startValue = inputArray[i];
            while (j > -1 && inputArray[j] > startValue) {
                inputArray[j + 1] = inputArray[j];
                j--;
                comparision = comparision + 1;
            }

            inputArray[j + 1] = startValue;
            ArrayUtility.printArray(inputArray);
            System.out.println("--------------");

        }
        return comparision;
    }

    public void insertionSort(int[] inputArray) {

        int n = inputArray.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int startValue = inputArray[i];
            while (j > -1 && inputArray[j] > startValue) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }

            inputArray[j + 1] = startValue;

        }

    }

    public void insertionSort(String[] inputArray, boolean status) {

        int n = inputArray.length;
        if (status) {
            for (int i = 1; i < n; i++) {
                int j = i - 1;
                String startValue = inputArray[i];
                while (j > -1 && inputArray[j].compareTo(startValue) > 0) {
                    inputArray[j + 1] = inputArray[j];
                    j--;
                }

                inputArray[j + 1] = startValue;

            }
        } else {
            for (int i = 1; i < n; i++) {
                int j = i - 1;
                String startValue = inputArray[i];
                while (j > -1 && inputArray[j].compareTo(startValue) < 0) {
                    inputArray[j + 1] = inputArray[j];
                    j--;
                }

                inputArray[j + 1] = startValue;

            }

        }

    }
}
