class IdenticalArray{
    public static void main(String[] args) {

        int a[][]={{1,2,3},{1,2,3}};
        int b[][]={{1,2,3},{1,2,5}};
        if(isIdentical(a,b)){
            System.out.println("yes");
        }
        else{
            System.out.println("false");
        }
    }

    public static boolean isIdentical(int [][]a,int [][]b){
        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                if(a[i].length==b[i].length){
                    for(int j=0;j<a[i].length;j++){
                        if(a[i][j]!=b[i][j]){
                            return false;
                        }
                    }
                }
            }
        }
        else{
            return false;
        }

        return true;
    }
}