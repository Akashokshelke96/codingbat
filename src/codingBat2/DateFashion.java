package codingBat2;

public class DateFashion {
    public static void main(String[] args) {
        System.out.println(dateFashion(6,9));
    }
    public static int dateFashion(int you, int date) {
        if(you > 2 && date > 2){
            if (you >= 8 || date >=8 ){
                return 2;
            }
            else{
                return 1;
            }
        }
            return 0;
        }
    }
