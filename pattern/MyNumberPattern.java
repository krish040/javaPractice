public class MyNumberPattern {
    public static void main(String[] args) {
        int n=5,reverse=1;
        for(int i=1;i<=n;i++){
            reverse=i;
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    System.out.print(reverse+" ");
                    reverse--;
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
