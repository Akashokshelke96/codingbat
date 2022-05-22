package logic1;

public class RedTicket {
    public static void main(String[] args) {
        System.out.println(redTicket(12,13,14));
    }
    public static int redTicket(int a, int b, int c) {
        if((a == 2) &&  (b == 2) && (c == 2)){
            return 10;
        }
        else if((a == b) && (b == c)){
            return 5;
        }
        else if((b!=a)&& (c!=a)){
            return 1;
        }

        return 0;
    }
//IF THIS HELPED PLEASE GIVE ME FOLLOW ON GITHUB, IT WILL REALLY MEANT A LOT..THANKS..HAPPY CODING!!

}
