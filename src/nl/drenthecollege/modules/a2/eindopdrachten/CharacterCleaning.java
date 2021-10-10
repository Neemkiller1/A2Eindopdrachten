package nl.drenthecollege.modules.a2.eindopdrachten;

/**
 * @author Davey Paulussen <115704@student.drenthecollege.nl>
 */
public class CharacterCleaning {
    public static String cleanString(String input) {
        String result = "";
        for (Character x : input.toCharArray()) {
            if (x.toString().matches("[a-zA-Z\\.\\n\\s]")) result += x;
        }
        return result;
    }

    public static String cleanString(String input, String blacklistPattern) {
        String result = "";
        for (Character x : input.toCharArray()) {
            if (!x.toString().matches(blacklistPattern)) result += x;
        }
        return result;
    }
}
