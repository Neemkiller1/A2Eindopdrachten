
package nl.drenthecollege.modules.a2.eindopdrachten;

/**
 *
 * @author Erik Mast <e.mast@drenthecollege.nl>
 */
public class Opdracht1 {
	
    public static void main(String[] args){
        String formule = "4+3";
        Integer resultaat = FormuleBereken.bereken(formule);
        System.out.println(formule + " = "+resultaat);
        
        formule = "4 *3 + 2";
        resultaat = FormuleBereken.bereken(formule);
        System.out.println(formule + " = "+resultaat);
        
        /* hier kun je de andere formules ook nog uitwerken en 
           je eigen formules toevoegen
        */
    } 
	
}
