package com.example

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class CSpec extends Specification implements DomainUnitTest<C> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
