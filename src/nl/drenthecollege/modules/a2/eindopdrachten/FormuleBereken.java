package nl.drenthecollege.modules.a2.eindopdrachten;
import java.util.ArrayList;
import java.util.regex.*;

/**
 * @author Davey Paulussen <115704@student.drenthecollege.nl>
 */
public class FormuleBereken {
    public static String calculateAdvanced(String formula) {
        formula = formula.replaceAll("\\s+","");
        String[] formulas = formula.split("=");
        String latestFormula = formulas[formulas.length - 1];
        if (latestFormula.matches("^\\-?\\d*$")) {
            // Formule is alleen een getal, oftewel opgelost
            return formula;
        }
        // Kijken of er niet-geneste haakjes zijn die opgelost kunnen worden
        Matcher matcher = Pattern.compile("\\(\\d+(?:[\\+\\-\\*]\\d+)*\\)").matcher(latestFormula);
        if (matcher.find()) {
            // Haakjes gevonden, vind nu een alleenstaand haakje
            String found = matcher.group().replaceAll("[\\(\\)]", "");
            String answer = calculateSimple(found);
            if (answer.matches("^.*[\\*\\+\\-].*$")) {
                answer = "(" + answer + ")";
            }
            latestFormula = latestFormula.replace("(" + found + ")", answer);
        } else {
            // Geen haakjes meer gevonden, simpele oplossing mogelijk
            latestFormula = calculateSimple(latestFormula);
        }
        return calculateAdvanced(formula + "=" + latestFormula) ;
    }

    private static String calculateSimple(String formula) {
        Matcher matcher = Pattern.compile("(?=(\\d+)([\\*\\+\\-])(\\d+)).").matcher(formula);
        ArrayList<Match> matches = new ArrayList<>();
        Integer i = 0;
        while (matcher.find()) matches.add(new Match(matcher, i++));
        if (matches.isEmpty()) return formula;
        matches.sort((o1, o2) -> o2.Priority.compareTo(o1.Priority));
        Match match = matches.get(0);
        return formula.replace(match.Source, match.getResultString());
    }
}
