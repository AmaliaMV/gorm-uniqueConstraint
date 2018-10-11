package gorm.uniqueconstraint

import com.example.C

class BootStrap {

    def init = { servletContext ->

        C.withNewSession {
            C.withTransaction {

                String sameName = 'c name'

                C c = new C(name: sameName, anotherProperty: "c")

                if (c.validate()) {
                    println "object c passed the validation"
                    c.save(flush: true)
                    println "object c saved"
                }

                C c1 = new C(name: sameName, anotherProperty: "c1")

                if (c1.validate()) {
                    println "object c1 passed the validation"
                    c1.save(flush: true)
                    println "object c1 saved"
                }

                C objectPersisted = C.findByName(sameName)
                assert objectPersisted.name == c.name
                assert objectPersisted.anotherProperty == c.anotherProperty
            }
        }


    }
    def destroy = {
    }
}
