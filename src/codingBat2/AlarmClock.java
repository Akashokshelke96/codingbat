package codingBat2;

public class AlarmClock {
    public static void main(String[] args) {
        System.out.println(alarmClock(2,true));
    }
    public static String alarmClock(int day, boolean vacation) {
        if((day >= 1  && day <=5) && vacation == false){
            return "7:00";
        }
        else if ((day == 0  || day > 5)  && vacation == true){
            return "off";

        }
        else if ((day >= 1  && day <=5) && vacation == true){
            return "10:00";

        }
        else if ((day == 0  || day > 5)  && vacation == false){
            return "10:00";
        }
        return "7:00";
    }
}//solution to alarmClock from codingbat by Akash Shelke
