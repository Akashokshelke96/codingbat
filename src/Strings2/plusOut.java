package Strings2;

public class plusOut {
    //Given a string and a non-empty word string, return a version of the original String where all
    // chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
    public static void main(String[] args) {
        System.out.println(plusOut("aaancbxyacnmxyw","xy"));
    }
    public static String plusOut(String str, String word) {
        int slen = str.length();
        int wlen = word.length();
        String fin = "";

        for (int i = 0; i < slen; i++) {
            if (i <= slen - wlen) {
                String tmp = str.substring(i,i+wlen);
                if (tmp.equals(word)) {
                    fin += word;
                    i += wlen-1;
                }
                else
                    fin += "+";
            }
            else
                fin += "+";
        }

        return fin;
    }
}
