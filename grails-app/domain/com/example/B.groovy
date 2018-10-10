package com.example

class B extends A {

    String anotherProperty

    static constraints = {
        anotherProperty nullable: true
    }
}
