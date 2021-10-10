package nl.drenthecollege.modules.a2.eindopdrachten;

/**
 * @author Davey Paulussen <115704@student.drenthecollege.nl>
 */
public class Opdracht1 {
    public static void main(String[] args){
        processFormula("4 + 3");
        processFormula("4 *3 + 2");
        processFormula("(3+4)*3");
        processFormula("( ( 2 +1) * 4) + (2 * 3) ");
        processFormula("( ( 2 +1) * 4) + (26 + 2 * 3)  ");
        processFormula("(3+4)*3+(13*6) ");
        processFormula("((9+14)*2) - (5 + 8 * 8) ");
    } 
    public static void processFormula(String formula){
        String resultaat = FormuleBereken.calculateAdvanced(formula);
        System.out.println(resultaat.replaceAll("=", "=\n"));
  
    }
}
