class CompareString{
    static String s;
    public static void main(String[] args){
        // String s1="hello";
        // String s2="hello";
        // System.out.println(s1.equals(s2)); //true
        // System.out.println(s1==s2); //true


        // String s3=new String("hello");
        // String s4=new String("hello");
        // System.out.println(s3.equals(s4)); //true
        // System.out.println(s3==s4); //false

        //System.out.println(s1.length); //error only used with array

        System.out.println(s);//static 

        //upper case to lower case 
        String s5="HElLO";
        String s6=null;
        
        for(int i=0;i<s5.length();i++){
            if(s5.charAt(i)>=65 && s5.charAt(i)<=90){
                char ch=(char) (s5.charAt(i)+32);
                s6=s6+ch;
            }
            else{
                s6=s6+s5.charAt(i);
            }
        }
        System.out.println(s6);
    }
}