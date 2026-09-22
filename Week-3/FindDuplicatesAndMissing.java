public class FindDuplicatesAndMissing {

    static void findNumbers(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                System.out.println("Duplicate: " + Math.abs(arr[i]));
            }
            else {
                arr[index] = -arr[index];
            }
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                System.out.println("Missing: " + (i + 1));
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4, 5};

        findNumbers(arr);
    }
}