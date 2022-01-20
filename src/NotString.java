public class NotString {
    public static void main(String[] args) {
        System.out.println(notString("hello"));
    }

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }
}

//    public static void main(String[] args) {
//        System.out.println(parrotTrouble(true, 10));
//
//    }
//
//    public static boolean parrotTrouble(boolean talking, int hour) {
//
//        return (talking && (hour < 7 || hour > 20));
//    }
//}
//learning nad solving questions from codingbat by akash shelke