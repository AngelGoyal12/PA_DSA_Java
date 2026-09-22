public class HouseRobber {

    static int rob(int[] money) {

        if (money.length == 0) {
            return 0;
        }

        if (money.length == 1) {
            return money[0];
        }

        int previousTwo = money[0];
        int previousOne = Math.max(money[0], money[1]);

        for (int i = 2; i < money.length; i++) {

            int current = Math.max(
                    previousOne,
                    previousTwo + money[i]
            );

            previousTwo = previousOne;
            previousOne = current;
        }

        return previousOne;
    }

    public static void main(String[] args) {

        int[] money = {2, 7, 9, 3, 1};

        System.out.println("Maximum money: " + rob(money));
    }
}