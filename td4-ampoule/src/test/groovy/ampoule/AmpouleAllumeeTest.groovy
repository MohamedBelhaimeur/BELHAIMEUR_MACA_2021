package ampoule

import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Title

@Title("Cette classe teste les comportements d'une ampoule relatifs à l'état allumée")
@Subject(AmpouleAllumee)
class AmpouleAllumeeTest extends AmpouleIOFixtures {
    def ampoule = new Ampoule()

    def "an ampoule allumee goes to eteinte on eteindre"() {
        given: "an ampoule allumee"
            ampoule.allumer()
            bos.reset()
        when: "eteindre occurs"
            ampoule.eteindre()
        then: "the ampoule goes to eteinte"
            ampoule.getState() == AmpouleEteinte.instance()
        and: "states the message: -> éteinte"
            "-> éteinte" == bos.toString().trim()
    }

    def "an ampoule allumee stays allumee and does not increment its usages on allumer"() {
        given: "an ampoule allumee"
            ampoule.allumer()
            bos.reset()
            def usages = ampoule.usages()
        when: "allumer occurs"
            ampoule.allumer()
            //ampoule.eteindre() -- pour illustrer la clarte des rapports d'erreur
        then: "the ampoule stays allumee"
            ampoule.getState() == AmpouleAllumee.instance()
        and: "the ampoule did not increment its usages"
            usages == ampoule.usages()
        and:  "states the message: déjà allumée"
            "déjà allumée" == bos.toString().trim()
    }

    def "an ampoule allumee does not reset its usages on reparer"() {
        given: "an ampoule allumee"
            ampoule.allumer()
            bos.reset()
        when: "reparer occurs"
            ampoule.reparer()
        then: "the ampoule does not reset its usages"
            ampoule.usages() != 0
        and:  "states the message: déjà allumée"
            "pas possible" == bos.toString().trim()
    }

    def "an ampoule allumee stays allumee on reparer"() {
        given: "an ampoule allumee"
            ampoule.allumer()
            bos.reset()
        when: "reparer occurs"
            ampoule.reparer()
        then: "the ampoule stays allumee"
            ampoule.getState() == AmpouleAllumee.instance()
        and:  "states the message: déjà allumée"
            "pas possible" == bos.toString().trim()
    }
}
