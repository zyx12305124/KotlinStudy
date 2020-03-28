package learn.gouzi.com.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() { //extends implements
	//https://blog.csdn.net/c10WTiybQ1Ye3/article/details/90386181
    //java里不赋值的话 成员变量有默认值，但局部变量里没有默认值。（）
    //kotlin 都没有默认值
    //字符串换行 三对单引号
    //!! 断言运算符 确定不为空 为空就报错
    //str1!!.length str1?.length
    // open关键字定义类可继承
    // 被继承类后面括号的意思
    // 主构造函数和次构造函数
    // kotlin 中的抽象方法
    // kotlin 构造方法
    // kotlin 中的get set方法
    // 注意区分字段和属性的区别 幕后字段 field
    // lateinit使用规则
    override fun onCreate(savedInstanceState: Bundle?) { //@Override
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
