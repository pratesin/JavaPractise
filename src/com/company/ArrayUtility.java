public class ArrayUtility {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printNameWithLength(String[] names, int[] lengthNames) {

        for (int i = 0; i < names.length; i++) {

            for (int j = 0; j < lengthNames.length; j++) {
                if (names[j].length() == lengthNames[i]) {
                    System.out.println(names[j]);
                    break;
                }
            }

        }


    }
}