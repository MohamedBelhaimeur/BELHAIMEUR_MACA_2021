package ampoule

import spock.lang.Narrative
import spock.lang.Specification
import spock.lang.Title

@Title("Cette classe définit les fixtures pour la sortie console, communs aux classes de test")
@Narrative("Le test des sorties console empêche la parallélisation des cas de test")
class AmpouleIOFixtures extends Specification {

    PrintStream stdout = System.out
    ByteArrayOutputStream bos = new ByteArrayOutputStream()

    def setup() {
        stdout.flush()
        System.setOut(new PrintStream(bos))
    }

    def cleanup(){
        bos.flush()
        bos.reset()
        System.setOut(stdout)
    }
}
