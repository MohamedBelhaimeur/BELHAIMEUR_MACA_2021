package ampoule

import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Title

@Title("Cette classe teste les comportements d'une ampoule relatifs à l'état éteinte")
@Subject(AmpouleEteinte)
class AmpouleEteinteTest extends AmpouleIOFixtures {
    def ampoule

    def "initially, an ampoule is eteinte"() {
        when: "a new ampoule"
            ampoule = new Ampoule()
        then: "the ampoule is eteinte"
             ampoule.getState() == AmpouleEteinte.instance()
        and : "the ampoule's usages count equals zero"
            ampoule.usages() == 0
    }

    def "an ampoule goes from eteinte to allumee on allumer"() {
        given: "a new ampoule"
            ampoule = new Ampoule()
            def usages = ampoule.usages()
        when: "allumer occurs"
            ampoule.allumer()
        then: "the ampoule goes to allumee"
            ampoule.getState() == AmpouleAllumee.instance()
        and: "the number of usages has incremented by 1"
            ampoule.usages() == usages + 1
        and:  "states the message: -> allumée"
            "-> allumée" == bos.toString().trim()
    }

    def "an ampoule eteinte stays eteinte on eteindre"() {
        given: "a new ampoule"
            ampoule = new Ampoule()
        when: "eteindre occurs"
            ampoule.eteindre()
        then: "the ampoule's stays eteinte"
            ampoule.getState() == AmpouleEteinte.instance()
        and:  "states the message: déjà éteinte"
            "déjà éteinte" == bos.toString().trim()
    }

    def "an ampoule eteinte stays eteinte on reparer"() {
        given: "a new ampoule"
            ampoule = new Ampoule()
        when: "reparer occurs"
            ampoule.reparer()
        then: "the ampoule's stays eteinte"
            ampoule.getState() == AmpouleEteinte.instance()
    }

    def "an ampoule allumee then eteinte resets its usages count on reparer"() {
        given: "a new ampoule allumee"
            ampoule = new Ampoule()
        and: "the ampoule is allumee then eteinte"
            ampoule.allumer()
            ampoule.eteindre()
            bos.reset()
        when: "reparer occurs"
            ampoule.reparer()
        then: "the ampoule's usages count resets to zero"
            ampoule.usages() == 0
    }
}
