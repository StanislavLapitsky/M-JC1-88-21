import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HomeWork hw = new HomeWork();
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();

        System.out.println("Please, enter the year");
        int year;
        do {
            year = in.nextInt();
            if (year < 0 || (!hw.digitsYear(year))) {
                System.out.println("Wrong input data! Enter the right data!");
            }
        } while (!(hw.digitsYear(year)));
        calendar.set(Calendar.YEAR, year);

        System.out.println("Please, enter the month. The numeration of month begins from 0");
        int month;
        boolean flag = true;
        do {
            month = in.nextInt();
            if ((month < 0 || month > 11)) {
                System.out.println("Wrong input data! Enter the right data!");
                flag = false;
            } else flag = true;
        } while (!flag);
        calendar.set(Calendar.MONTH, month);

        System.out.println("Please, enter the day of month");
        int day;
        do {
            day = in.nextInt();
            if (day < 0 || day > 31) {
                System.out.println("Wrong input data! Enter the right data!");
                flag = false;
            } else flag = true;
        } while (!flag);
        calendar.set(Calendar.DAY_OF_MONTH, day);

        hw.printData(year, month, day);

        if (hw.checkDate(calendar))
            System.out.println("There is a number 2 in your data! ");
        else System.out.println("There isn't a number 2 in your data! ");

        // task 2
        System.out.println("Please, enter the time. Format is: HH:MM:SS");
        String str = in.next();
        if (hw.getTime(str))
            System.out.println("The time is right");
        else System.out.println("The time is wrong");
    }

    public boolean checkDate(Calendar calendar) {
        boolean flag = false;
        int temp = 0;
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        while (year != 0) {
            temp = year % 10;
            if (temp == 2) {
                flag = true;
                break;
            } else temp = 0;
            year /= 10;
        }
        if (flag)
            return true;
        else if (month % 10 == 2 || month / 10 == 2)
            return true;
        else if (day % 10 == 2 || day / 10 == 2)
            return true;
        else return false;
    }

    public boolean digitsYear(int year) {
        int counter = 0;
        while (year != 0) {
            year /= 10;
            counter++;
        }
        if (counter != 4)
            return false;
        else return true;
    }
    public void printData(int year, int month, int day) {
        if (day / 10 != 0 && month / 10 != 0)
            System.out.println("Your data is: " + "\n" + day + "." + month + "." + year);
        else if(day/10==0 && month/10==0)
            System.out.println("Your data is: " + "\n" + "0" + day + ".0" + month + "." + year);
        else if (day / 10 != 0 && month / 10 == 0)
            System.out.println("Your data is: " + "\n" + day + ".0" + month + "." + year);
        else
            System.out.println("Your data is: " + "\n" + "0" + day + "." + month + "." + year);
    }
    public boolean getTime(String timeStr) {
        double h, m, s;
        boolean flagH = false, flagMin = false, flagSec = false;
        StringTokenizer stringTokenizer = new StringTokenizer(timeStr, ":");
        while (stringTokenizer.hasMoreTokens()) {
            h = Double.parseDouble(stringTokenizer.nextToken());
            if (checkHours(h))
                flagH = true;
            else flagH = false;
            m = Double.parseDouble(stringTokenizer.nextToken());
            if (checkMinSec(m))
                flagMin = true;
            else flagMin = false;
            s = Double.parseDouble(stringTokenizer.nextToken());
            if (checkMinSec(s))
                flagSec = true;
            else flagSec = false;
        }
        if (flagH && flagMin && flagSec)
            return true;
        else return false;
    }

    public boolean checkHours(double f) {
        if (f >= 0 && f <= 23)
            return true;
        else return false;
    }

    public boolean checkMinSec(double f) {
        if (f >= 0 && f <= 59)
            return true;
        else return false;
    }
}
