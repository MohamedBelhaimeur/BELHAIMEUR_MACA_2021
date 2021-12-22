package ampoule

import spock.lang.Shared
import spock.lang.Stepwise
import spock.lang.Subject
import spock.lang.Title

@Title("Cette classe teste les comportements d'une ampoule relatifs à l'état cassée")
@Subject(AmpouleCassee)
@Stepwise
class AmpouleCasseeTest extends AmpouleIOFixtures {
    @Shared def ampoule = new Ampoule()

    def "an ampoule eteinte that reached its max usage count breaks on allumer"() {
        def maxUsage = Ampoule.MAX_USAGES
        given: "an ampoule allumee and eteinte max times"
            for(i in 1..maxUsage) {
                ampoule.allumer()
                ampoule.eteindre()
                //bos.flush()
                bos.reset()
            }
        when: "the ampoule is allumee again"
            ampoule.allumer()
        then: "its breaks"
            ampoule.getState() == AmpouleCassee.instance()
        and: "states the message: -> cassée"
            "-> cassée" == bos.toString().trim()
    }

    def "an ampoule cassee stays cassee on allumer"() {
        when: "an ampoule is cassee and allumee occurs"
            ampoule.allumer()
        then: "it stays cassee"
            ampoule.getState() == AmpouleCassee.instance()
        and: "states the message: cassée"
            "cassée" == bos.toString().trim()
    }

    def "an ampoule cassee stays cassee on eteindre"() {
        when: "an ampoule is cassee is and eteindre occurs"
             ampoule.eteindre()
        then: "it stays cassee"
            ampoule.getState() == AmpouleCassee.instance()
        and: "states the message: cassée"
            "cassée" == bos.toString().trim()
    }

    def "an ampoule cassee becomes eteinte and resets its usages count on reparer"() {
        when: "an ampoule is cassee and reparer occurs"
            ampoule.reparer()
        then: "it becomes eteinte "
            ampoule.getState() == AmpouleEteinte.instance()
        and: "it resets its usage count"
            ampoule.usages() == 0
        and: "states the message: réparée"
            "réparée" == bos.toString().trim()
    }

    def "an ampoule reparee lights up again on allumer"() {
        def usageCount = ampoule.usages()
        when: "an ampoule is reparee and allumer occurs"
            ampoule.allumer()
        then: "it becomes allumee"
            ampoule.getState() == AmpouleAllumee.instance()
        and: "its usage count increments by 1"
            ampoule.usages() == usageCount + 1
    }
}
