package Java.daily.day1.controlflow;

public class SwitchStatement {
    public static void main(String[] args) {
        String day = "Sat";
        switch (day){
            case "Mon":
                System.out.println("Today is Monday."); break;
            case "Tue":
                System.out.println("Today is Tue."); break;
            case "Wed":
                System.out.println("Today is Wed."); break;
            case "Thu":
                System.out.println("Today is Thu."); break;
            case "Fri":
                System.out.println("Today is Fri."); break;
            default:
                System.out.println("Sat & Sun Day");
        }
    }
}
