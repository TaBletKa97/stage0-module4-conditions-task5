package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        year = year == 1900 ? ++year : year;
        switch (year % 4) {
            case 0:
                System.out.println("leap");
                break;
            default:
                System.out.println("not leap");
        }
    }
}
