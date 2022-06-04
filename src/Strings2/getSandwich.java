package Strings2;

public class getSandwich {
    public static void main(String[] args) {
//A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
// appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
        System.out.println(getSandwich("akashbreadshelkebread"));
    }

    public static String getSandwich(String str) {
        String bread = "bread";
        int front = -1;
        int back = -1;

        for (int i = 0 ; i < str.length()-5 ; i++) {
            if (str.substring(i, i + 5).equals(bread)) {
                front = i;
                break;
            }
        }
        for(int j = str.length()-5 ; j>=0 ; j--){
            if (str.substring(j, j + 5).equals(bread)) {
                back = j;
                break;
            }
        }
        if(front!=-1 && back!=-1 && front!= back){
            return str.substring(front+5,back);
        }
        return "";
    }
//if this code helped you please consider FOLLOWING on github, i am open to collaborations . Happy Coding!!
}