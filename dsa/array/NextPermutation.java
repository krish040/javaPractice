public class NextPermutation {

    public static void nextGreaterPermutation(int[] A) {
        int n = A.length;

        // Step 1: Find the break point
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: If no break point, reverse entire array
        if (ind == -1) {
            reverse(A, 0, n - 1);
            return;
        }

        // Step 3: Find the next greater element and swap
        for (int i = n - 1; i > ind; i--) {
            if (A[i] > A[ind]) {
                int temp = A[i];
                A[i] = A[ind];
                A[ind] = temp;
                break;
            }
        }

        // Step 4: Reverse the right half
        reverse(A, ind + 1, n - 1);
    }

    // Helper method to reverse array between two indices
    public static void reverse(int[] A, int start, int end) {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 5, 4, 3, 0, 0};

        nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (i != A.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
