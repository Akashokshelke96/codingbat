package codingBat2;

public class FrontStr {
    public static String front3(String str) {
        if(str.length() > 3) {
            String front = str.substring(0,3);
            return front + front + front;
        }

        else{ return str.substring(0,str.length()) + str.substring(0,str.length()) + str.substring(0,str.length());

        }
    }

    public static void main(String[] args) {
        System.out.println(front3("cocacola"));
    }
}
