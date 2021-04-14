public class Main {

    public static final int FIRSTOFMONTH = 1;
    public static final String CHARACTERMATCH = "/";
    public static final int LASTOFYEAR = 12;
    public static final int FIRSTOFYEAR = 1;

    public static String nextDayCaculator(int day, int month, int year){
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;
        if(day == getDayOfMonth(month,year)){
            if(month == LASTOFYEAR){
                nextDay = FIRSTOFMONTH;
                nextMonth = FIRSTOFYEAR;
                nextYear++;
            } else {
                nextDay = FIRSTOFMONTH;
                nextMonth++;
            }
        } else {
            nextDay++;
        }


        return  (nextDay + CHARACTERMATCH + nextMonth + CHARACTERMATCH + nextYear);
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
