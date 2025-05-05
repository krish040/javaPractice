public class palindrome {
    public static void main(String[] args) {
        String str="A man, a plan, a canal, Panama!";
        str=str.toUpperCase();
        String ori="";
        String rev="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                ori=ori+str.charAt(i);
                rev=str.charAt(i)+rev;
            } 
        }
        if(ori.equals(rev)) 
        System.out.println("yes");
        else 
        System.out.println("no");
    }
}
