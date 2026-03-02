public class ControlStatements {

    public static void main(String[] args) {

        // ===== IF-ELSE Example =====
        int number = 10;

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // ===== SWITCH Example =====
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // ===== FOR LOOP Example =====
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // ===== WHILE LOOP Example =====
        System.out.println("While Loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // ===== DO-WHILE LOOP Example =====
        System.out.println("Do-While Loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        // ===== BREAK and CONTINUE Example =====
        System.out.println("Break and Continue:");

        for (int k = 1; k <= 5; k++) {

            if (k == 3) {
                continue;  // skips 3
            }

            if (k == 5) {
                break;     // stops loop at 5
            }

            System.out.println(k);
        }
    }
}
