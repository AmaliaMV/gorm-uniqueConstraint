package gorm.uniqueconstraint

import com.example.C

class BootStrap {

    def init = { servletContext ->

        C c = new C(name: 'c name')

        if (c.validate()) {
            c.save(flush: true)
        }

    }
    def destroy = {
    }
}
