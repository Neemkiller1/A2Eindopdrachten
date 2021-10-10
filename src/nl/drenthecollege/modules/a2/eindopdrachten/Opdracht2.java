
package nl.drenthecollege.modules.a2.eindopdrachten;

/**
 * @author Davey Paulussen <115704@student.drenthecollege.nl>
 */
public class Opdracht2 {

    public static void main(String[] args) {
        String tekst
                = "Dit is een tekst met \" en ** en ?? "
                + "en allerlei andere niet wenselijke tekens zoals ® etc. ";
        System.out.println(CharacterCleaning.cleanString(tekst));
        System.out.println(CharacterCleaning.cleanString(tekst, "[\\?|\\*|\\®|\"]"));
    }
}
