package Strings2;

public class prefixAgain {
    public static void main(String[] args) {
        //Given a string, consider the prefix string made of the first N chars of the string.
        // Does that prefix string appear somewhere else in the string?
        System.out.println(prefixAgain("abcXYabc",3));
    }
    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0,n);

        for(int i = n;i <= str.length()-n ; i++){
            if(str.substring(i,i+n).equals(prefix)){
                return true;
            }
        }return false;
    }
}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!

