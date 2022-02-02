package codingBat2;

public class CaughtSpeeding {
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int lolimit = 60;
        int highlimit = 80;

        if( isBirthday == true) {
            lolimit = lolimit + 5;
            highlimit = highlimit + 5;
            if( speed > lolimit && speed <= highlimit) {
                return 1;
            }
            else if (speed > highlimit){
                return 2;
            }
        }
        else if (isBirthday ==  false){
            if( speed > lolimit && speed <= highlimit) {
                return 1;
            }
            else if (speed >= highlimit){
                return 2;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(caughtSpeeding(80,true));
    }
}//solution to caughtSpeeding from codingbat by Akash Shelke
