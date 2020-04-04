package learn.gouzi.com.kotlinstudy

import learn.gouzi.com.kotlinstudy.day1.Person
import learn.gouzi.com.kotlinstudy.day1.Student
import learn.gouzi.com.kotlinstudy.day1.Student2
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test1(){
//        val p = Person()
//        p.name = "kila"
//        p.age = 25
//        p.eat()

//        val p = Person("kila",6)

        val s = Student(111,"yi",4,"jack")
    }

    @Test
    fun test2(){
        val s = Student(111,"yi",4,"jack")
        val s1 = Student2(111,"yi")
        val s2 = Student2()
    }
}
