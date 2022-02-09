public class Ex17 {

    public static void printDelim() {
        System.out.println();
        System.out.println();
    }

    public static boolean isGreenLight = false;

    public static int amountRetired(int[] speeds) { //количество выбывающих
        int amountRetired = 0;
        if (!isGreenLight) {
            for (int i = 0; i < speeds.length; i++) {
                if (speeds[i] > 0) {
                    amountRetired++;
                }
            }
        }
        return amountRetired;
    }


    public static int[] ArrayRetired(int[] speeds) { //массив из скоростей выбывающих
        int count = 0;
        if (!isGreenLight) {
            for (int i = 0; i < speeds.length; i++) {
                if (speeds[i] > 0) {
                    count++;
                }
            }
        }

        int[] speedsRetired = new int[count];
        int countAdd = 0;
        if (!isGreenLight) {
            for (int i = 0; i < speeds.length; i++) {
                if (speeds[i] > 0) {
                    speedsRetired[countAdd] = speeds[i];
                    countAdd++;
                }
            }
        }
        return speedsRetired;
    }

    public static int[] ArrayNotRetired(int[] speeds) { //массив из скоростей не выбывающих
        int count = 0;
        if (!isGreenLight) {
            for (int i = 0; i < speeds.length; i++) {
                if (speeds[i] == 0) {
                    count++;
                }
            }
        }

        int[] NotRetired = new int[count];
        int countAdd = 0;
        if (!isGreenLight) {
            for (int i = 0; i < speeds.length; i++) {
                if (speeds[i] == 0) {
                    NotRetired[countAdd] = speeds[i];
                    countAdd++;
                }
            }
        }

        return NotRetired;
    }

}
