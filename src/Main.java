public class Main {

    public static final int firstDayOfMonth = 1;

    public static String nextDayCaculator(int day, int month, int year){
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;
        if(day == getDayOfMonth(month,year)){
            if(month == 12){
                nextDay = firstDayOfMonth;
                nextMonth = 1;
                nextYear++;
            } else {
                nextDay = firstDayOfMonth;
                nextMonth++;
            }
        } else {
            nextDay++;
        }

        return  (nextDay + "/" + nextMonth +"/" + nextYear);
    }

    //
    private static boolean isLapYear(int year){
        return (year % 400 == 0)|(year % 4 == 0 && year != 100);

    }
    //
    private static int getDayOfMonth(int mounth, int year) {
        switch (mounth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return isLapYear(year)? 29 : 28;
            default:
                return 30;
        }
    }





}
