package validadores;

import java.util.regex.Pattern;

public class DataValidador {
    public static boolean match(String inicio, String fim) {
        Pattern dataPattern = Pattern.compile("^[0123][0-9]\\/[01][0-9]\\/[12][09][0-9][0-9]");

        match(inicio, dataPattern, "A data de inicio é inválida!");
        match(fim, dataPattern, "A data de fim é inválida!");

        return true;
    }

    private static String match(String match, Pattern matchPattern, String message) {
        if (match == null)
            throw new IllegalArgumentException(message);

        var matchMatcher = matchPattern.matcher(match);

        if (!matchMatcher.matches())
            throw new IllegalArgumentException(message);

        return matchMatcher.group(0);
    }
}
