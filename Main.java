import java.util.Scanner;

public class Main {

    public static Scanner sc;
    public static int worldTime, hour, min, day, year, tDay, fDay;


    public static void main(String[] args) {
        allFunctions();
        System.out.println();
        allFunctions();
        System.out.println();
        allFunctions();
    }
    public static void allFunctions(){
        enterWT();
        System.out.println();
        hour = calcHour(hour);
        min = calcMin(min);
        day = calcDay(day);
        year = calcYear(year);
        tDay = calcTramCycle(tDay);
        fDay = calcFeluCycle(fDay);
        print();
    }
    public static void enterWT() {
        System.out.print("Enter World Time: ");
        sc = new Scanner(System.in);
        worldTime = sc.nextInt();
    }
    public static int calcHour(int hour) {
        hour = ((worldTime / 60) % 24);
        return (hour);
    }
    public static int calcMin(int min) {
        min = worldTime % 60;
        return (min);
    }
    public static int calcDay(int day) {
        day = ((worldTime / 1440) % 365) + 1;
        return (day);
    }
    public static int calcYear(int year) {
        year = (worldTime / 1440 / 365) + 1;
        return (year);
    }
    public static int calcTramCycle(int tDay) {
        tDay = ((worldTime / 1440) + 1) % 9;
        return (tDay);
    }
    public static int calcFeluCycle(int fDay) {
        fDay = ((worldTime / 1440) + 1) % 14;
        return (fDay);
    }
    public static void print() {
        System.out.println("worldTime: " + worldTime);
        System.out.print("It is " + hour + ":");
        System.out.printf("%02d ", min);
        System.out.print("on day " + day + " of the year " + year + ".\n");
        System.out.println("Trammel is in day " + tDay + " of its 9 day cycle.");
        System.out.println("Felucca is in day " + fDay + " of its 14 day cycle.");
    }
}
