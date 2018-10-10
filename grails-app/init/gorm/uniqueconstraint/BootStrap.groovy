package gorm.uniqueconstraint

import com.example.C

class BootStrap {

    def init = { servletContext ->

        C.withNewSession {
            C.withNewTransaction {
                C c = new C(name: 'c name')

                println "c will be validated"
                if (c.validate()) {
                    println "c was validated"

                    c.save(flush: true)
                }
            }
        }


    }
    def destroy = {
    }
}
