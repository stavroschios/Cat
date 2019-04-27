public class PlayingCat {



        public static boolean isCatPlaying (boolean summer, int temperature){
            while( summer == false) {
                if ((temperature >= 25) && (temperature <= 35)) {
                    return true;
                } else {
                    return false;
                }
            }
            while(summer == true) {
                if ((temperature >= 25) && ( temperature <= 45)) {
                    return true;
                }
                else {
                    return false;
                }
            }

            return false;
        }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,33));
    }
}
