import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {

    static int countBits(int number) {

        int count = 0;

        while (number > 0) {
            count += number % 2;
            number = number / 2;
        }

        return count;
    }

    static List<String> readBinaryWatch(int turnedOn) {

        List<String> result = new ArrayList<>();

        for (int hour = 0; hour < 12; hour++) {

            for (int minute = 0; minute < 60; minute++) {

                int totalBits = countBits(hour) + countBits(minute);

                if (totalBits == turnedOn) {

                    String time = hour + ":";

                    if (minute < 10) {
                        time += "0";
                    }

                    time += minute;

                    result.add(time);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int turnedOn = 1;

        System.out.println("Possible times:");

        for (String time : readBinaryWatch(turnedOn)) {
            System.out.println(time);
        }
    }
}