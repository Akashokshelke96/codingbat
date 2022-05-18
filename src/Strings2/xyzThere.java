package Strings2;

public class xyzThere {
    public static void main(String[] args) {
        System.out.println(xyzThere("abc.xxy.yxyz"));
    }
    public  static boolean xyzThere(String str) {
        if(str.length() >= 3 && str.substring(0, 3).equals("xyz"))
            return true;

        for(int i = 1; i < str.length() - 2; i++) {
            if(str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz"))
                return true;
        }

        return false;
    }

}
