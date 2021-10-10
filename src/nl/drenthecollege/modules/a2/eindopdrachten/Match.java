package nl.drenthecollege.modules.a2.eindopdrachten;
import java.util.regex.Matcher;

/**
 * @author Davey Paulussen <115704@student.drenthecollege.nl>
 */
public class Match {
    public final String Source;
    public final Integer One;
    public final Integer Two;
    public final String Operator;
    public final Integer Index;
    public final Integer Priority;

    public Match(Matcher matcher, Integer index) {
        Integer one = Integer.parseInt(matcher.group(1));
        String operator = matcher.group(2);
        Integer two = Integer.parseInt(matcher.group(3));

        Source = one + operator + two;
        One = one;
        Two = two;
        Operator = operator;
        
        Index = index;
        Priority = operator.charAt(0) == '*' ? 1 : 0;
    }

    public String getResultString() { 
        return getResult().toString();
    }

    private Integer getResult() {
        switch (Operator) {
            case "*": return One * Two;
            case "+": return One + Two;
            case "-": return One - Two;
            default: return 0;
        }
    }
}

