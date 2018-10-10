package com.example

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ASpec extends Specification implements DomainUnitTest<A> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
