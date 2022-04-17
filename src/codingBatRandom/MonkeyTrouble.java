package codingBatRandom;

public class MonkeyTrouble {
    public static void main(String[] args) {

            boolean aSmile = true;
            boolean bSmile = true;
            System.out.println(monkeyTrouble(true,true));

            System.out.println(" +\"\"\"\"\"+ ");
            System.out.println("[| o o |]");
            System.out.println(" |  ^  | ");
            System.out.println(" | '-' | ");
            System.out.println(" +-----+ ");
        }
        public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
            return ((aSmile && bSmile) || (!aSmile && !bSmile));
        }

    }
    //2 monkeys smiling trouble question.
//learning nad solving questions from codingbat by akash shelke

