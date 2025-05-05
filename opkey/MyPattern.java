public class MyPattern{
    public static void pattern(int row){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=2*row-1;j++){
                
                if(j>i && j<=2*row-i-1)
                System.out.print("  ");
                else
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //lowercase
        for(int i=row-1;i>0;i--){
            for(int j=1;j<=2*row-1;j++){
        
                if(j>i && j<=2*row-i-1)
                    System.out.print("  ");
                else
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void anurag(int n){     

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(j==1 || j==n || i==j ||(i+j)==(n+1)|| i==((n+1)/2)) {
                    System.out.print(j+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {
        // pattern(3);
        anurag(5); // in this we pass all rows not just half part rows
    }
}

/*
 * 1       5 
 * 1 2   4 5 
 * 1 2 3 4 5 
 * 1 2   4 5 
 * 1       5
 */