public class Main {

    public static void main(String[] args) {


        int[]speeds = new int[3];
        speeds[0] = 1;
        speeds[1] = 0;
        speeds[2] = 3;

        Ex17.printDelim();
        System.out.println("Количество выбывших");
        int amountRetired = Ex17.amountRetired(speeds);
        System.out.println(amountRetired);

        Ex17.printDelim();
        System.out.println("Массив из скоростей выбывших");
        int[]ArrayRetired = Ex17.ArrayRetired(speeds);
        for (int i = 0; i < ArrayRetired.length; i++) {
                System.out.println(ArrayRetired[i]);
        }

        Ex17.printDelim();
        System.out.println("Массив из скоростей не выбывших");
        int[]ArrayNotRetired = Ex17.ArrayNotRetired(speeds);
        for (int i = 0; i < ArrayNotRetired.length; i++) {
            System.out.println(ArrayNotRetired[i]);
        }

    }

}
