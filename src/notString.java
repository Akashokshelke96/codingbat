public class notString {
    public void main(String[] args) {
        System.out.println(notString("hello"));
    }

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }
}