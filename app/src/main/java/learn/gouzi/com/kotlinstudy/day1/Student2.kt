package learn.gouzi.com.kotlinstudy.day1

class Student2(val sno :Int,val grade:String, age :Int, name:String) :Person(name,age) {
    constructor(age :Int, name:String):this(1,"er",age,name){
        println("constructor1")
    }
    constructor():this(0,""){
        println("constructor2")
    }
}