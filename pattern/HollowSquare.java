class HollowSquare{
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(i==1 || i==n-1 || j==1 || j==n-1){
                    //System.out.print(i+""+j);
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}