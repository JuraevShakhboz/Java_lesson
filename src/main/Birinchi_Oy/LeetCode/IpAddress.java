public class IpAddress {
    public static void main(String[] args) {
        String ipadress = "1.1.1.1.1";

        ipadress = ipadress.replace(".","[.]");

        System.out.println(ipadress);
    }
}
