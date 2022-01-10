public class monkeyTrouble {
    public static void main(String[] args) {

            boolean aSmile = true;
            boolean bSmile = true;
            System.out.println(monkeyTrouble(aSmile, bSmile));
        }
        public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
            return ((aSmile && bSmile) || (!aSmile && !bSmile));
        }

    }
    //2 monkeys smiling trouble question.

