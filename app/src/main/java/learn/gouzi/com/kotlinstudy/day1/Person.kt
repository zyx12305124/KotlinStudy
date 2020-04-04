package learn.gouzi.com.kotlinstudy.day1

import org.jetbrains.annotations.TestOnly

open class Person (val name:String,val age :Int){

    init {
        eat()
    }

    fun eat(){
//        println(name + " is eating. She is " + age + " years old.")
    }



}