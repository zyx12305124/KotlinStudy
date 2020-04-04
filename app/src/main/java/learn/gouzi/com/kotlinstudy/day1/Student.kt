package learn.gouzi.com.kotlinstudy.day1

//在Student类的主构造函数中增加name和age这两个字段时不能再将它们声明成val，
// 因为在主构造函数中声明成val或者var的参数将成为全局变量，
// 这就会导致和父类中同名的name和age字段造成冲突。
class Student(val sno :Int,val grade:String, age :Int, name:String) :Person(name,age){
    init {
        println("sno is " + sno)
        println("grade is " + grade)
    }
}