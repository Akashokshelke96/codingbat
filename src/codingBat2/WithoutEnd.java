package codingBat2;

public class WithoutEnd {
    public static String withoutEnd2(String str) {
        if (str.length() > 2)
        {
            return str.substring(1,str.length() - 1);
        }
        else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(withoutEnd2("hello"));
    }
}
