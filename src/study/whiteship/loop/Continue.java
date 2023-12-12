package study.whiteship.loop;

public class Continue {

    public static void main(String[] args) {
        String searchMe = "peter piper picked a peck of pickled pepers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            if(searchMe.charAt(i) != 'p') {
                continue;
            }
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}
