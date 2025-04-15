class AmanSirPattern{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1){
                    System.out.print("*");
                }
                else{
                    if(j<i||j==i){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("* ");
                        j++;
                    }
                }
            }
            System.out.println();
        }
    }
}