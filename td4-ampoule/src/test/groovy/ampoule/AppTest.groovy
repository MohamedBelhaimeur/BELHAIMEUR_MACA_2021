package ampoule

import spock.lang.Specification

class AppTest extends AmpouleIOFixtures {
    private String[] args
    String expected = '''\
déjà éteinte
-> allumée
déjà allumée
-> éteinte
-> allumée
-> éteinte
-> cassée'''

    def "The App brings an ampoule to different states"() {
        when: "the App's scenario is invoked"
            App.main(args)
        then: "its ampoule goes through: déjà éteinte -> allumée -> déjà allumée -> éteinte -> allumée -> éteinte -> cassée"
            expected == bos.toString().trim()
    }
}
