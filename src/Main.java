public class Main {

    public static void main(String[] args) {

        Ex16.isGreenLight = true;
        if (Ex16.getSpeed(9)) {
            System.out.println("Игрок выбыл");
        } else {
            System.out.println("Игрок проходит");
        }
    }

}
