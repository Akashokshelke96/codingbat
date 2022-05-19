package Strings2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class repeatSeperator {
    public static void main(String[] args) {

       // Given two strings, word and a separator sep, return a big string made of count occurrences
        // of the word, separated by the separator string.
        System.out.println(repeatSeparator("akash", "coder", 8));
    }

    public static String repeatSeparator(String word, String sep, int count) {

        String result = word;
        if (count == 0) return "";
        for (int i = 1; i < count; i++) {
            result = result + sep + word;
        }
        return result;
    }
}//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!