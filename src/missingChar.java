public class missingChar {
    public static void main(String[] args) {
        System.out.println(missingChar("hellows",7));
    }
        public static String missingChar(String str, int n) {
            String front = str.substring(0, n);
            String back = str.substring(n +1 , str.length());
            return front + back;
        }
    }
