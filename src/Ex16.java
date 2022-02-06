public class Ex16 {

    public static boolean isGreenLight = false;

    public static boolean getSpeed(int speedOfPlayer) {
        boolean Speed = false;
        if (speedOfPlayer > 0) {
            if (!isGreenLight)
                Speed = true;
        } else {
            Speed = false;
        }
        return Speed;

    }


}
