import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneNumber {
    private static final String TELEPHONE_NUMBER = "^\\(\\d{2}\\)-\\(\\d{10}\\)$";

    public TelephoneNumber() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(TELEPHONE_NUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
