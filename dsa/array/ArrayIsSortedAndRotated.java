class ArrayIsSortedAndRotated {
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Compare current element with next element (circularly)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        // There should be at most one "drop" (decrease) in a rotated sorted array
        return count <= 1;
    }
    public static void main(String[] args) {
        // int arr[]={5,4,3,2,1}; //false
        // int arr[]={1,2,3,4,5}; //true
        // int arr[]={4,5,1,2,2,3}; // true
        int arr[]={2,1,3,4}; // false
        System.out.println(check(arr));
    }
}
