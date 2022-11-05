public class Test {
    private static TelephoneNumber telephoneNumber;
    public static final String[] valid = new String[] {"(84)-(0978489648)", "(84)-(0234489648)"};
    public static final String[] invalid = new String[] {"(a8)-(22222222)", "(aisa)-(2222222222sds2)"};

    public static void main(String[] args) {
        telephoneNumber = new TelephoneNumber();
        for (String a : valid) {
            boolean isValid = telephoneNumber.validate(a);
            System.out.println("class name: " + a + " is valid " + isValid);
        }

        for (String a : invalid) {
            boolean isValid = telephoneNumber.validate(a);
            System.out.println("class name: " + a + " is valid " + isValid);
        }
    }
}
