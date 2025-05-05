public class FindNumberAppearedOnce {

    public static int find(int arr[]){
        int n = arr.length;

        // XOR all the elements:
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[]={4,1,2,2,1};
        System.out.println(find(arr));
    }
}
