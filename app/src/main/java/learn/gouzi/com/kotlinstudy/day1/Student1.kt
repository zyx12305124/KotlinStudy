package learn.gouzi.com.kotlinstudy.day1

class Student1:Person {
    // 首先Student类的后面没有显示地定义主构造函数，同时又因为定义了次构造函数 ，
    // 所以现在Student类是没有主构造函数的。
    // 那么既然没有主构造函数，继承Person类的时候也就不需要再加上括号了。
    constructor(name:String,age:Int):super(name,age){

    }
}