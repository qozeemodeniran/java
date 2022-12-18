package inheritance;

public class Grandson extends Odeniran {
    private int grandsons = 45;

    public static void main(String[] args) {

        Grandson obj = new Grandson();
        obj.share();

        System.out.println("\r\nSadly, the number of grandsons left is " + obj.grandsons + ", which is 1o greater than his properties.\r\n");
    }
}
