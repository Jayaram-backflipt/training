typealias int=Int

fun main(){

    println("Sriram is rajtarun")

    var p = Person("ram",22)
    p.jay_upper()
    print(p.toString())
    var s=Student("rammm",100)
    print(s.getName1())
    print(p.abc)
    var c = child()
    c.one()
    c.isEmpty
    var m_l= MutableList<Int>(5){1}
    m_l.swap(1,2)

    var l = List<Int>(5){10}
    l.forEach { print(it) }
    println()

    var set1= mutableSetOf<Int>(1,2,3,1)
    set1.forEach{ print(it)}
    println()

    var map1= mutableMapOf<Int,Int>()
    map1[2]=3
    map1[2]=8
    map1.keys.forEach{ println(map1[it])}
    map1.filter { it.key>0 }.also { print(it.keys) }

    var l1=l.mapIndexed { index, i ->index*i  }
    println(l1)
    println(l1.filter { i -> i>10 })

    println(l+l1)

    val numbers = listOf("one", "two", "three", "four", "five" ,"one")
    println(numbers.groupBy { it })

    println(numbers.groupBy { it.first().toUpperCase() })
    println(numbers.groupBy(keySelector = { it.first() }, valueTransform = { it.toUpperCase() }))
    println(map1)

    val sum1 = { x: Int -> (x + 2).also { print(x+2) } }
    l.forEach({ sum1(it)})

//    var n:String?=null
//    println(n.length)
    var l2:int=10


}

open class Person( var name:  String,var age:Int){
    var abc:Int=10001

    init {
        println("Primary constructor called")
    }
    fun jay_upper(){
        println( name)
    }
}
class Student( name: String,age: Int):Person(name="ram",age = 10){
    fun  getName1():String{
        return super.name
    }
}
interface parent{
    fun one()
    fun two(){
        print("hii")
    }
}
class child:parent{
    var age:Int = 5

    val isEmpty: Boolean  get() { return 0 == 0}

    override fun one(){
        println("child class")
    }
}
fun MutableList<Int>.swap(a:Int,b:Int){
    println("Swapped")
}

