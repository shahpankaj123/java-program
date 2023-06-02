public class ArraySeparation {
    public static void main(String[] args) {
        int[] originalArray = {2, 5, 8, 9, 12, 15, 18, 21, 24, 27};
        int[] evenArray = new int[10];
        int[] oddArray = new int[10];
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] % 2 == 0) {
                evenArray[evenCount] = originalArray[i];
                evenCount++;
            } else {
                oddArray[oddCount] = originalArray[i];
                oddCount++;
            }
        }

        System.out.println("Original Array: ");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }

        System.out.println("\nEven Array: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }

        System.out.println("\nOdd Array: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
    }
}
