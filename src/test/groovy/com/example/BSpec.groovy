package com.example

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class BSpec extends Specification implements DomainUnitTest<B> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
