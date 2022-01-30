public class Main {

    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 9;
        int speedOfPlayer3 = 3;

        int retired = 0;


        if (isGreenLight) { //если зеленый
            System.out.println("все проходят");
        } else { //если не зеленый
            if (speedOfPlayer1 > 0)
                retired = retired + 1;

            if (speedOfPlayer2 > 0)
                retired = retired + 1;

            if (speedOfPlayer3 > 0)
                retired = retired + 1;

        }

        System.out.println("Выбыло игроков: " + retired);
        // Допишите здесь логику так, что будет подсчитано и выведено
        // количество игроков, которые выбывают.
        // Если свет зелёный, то проходят все игроки (0 выбывают).
        // Если свет красный, то выбывает каждый, чья скорость не 0.
    }

}
