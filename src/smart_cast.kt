import kotlin.reflect.typeOf

open class Base(var age:Int)
class Derived(var age1:Int):Base(age1)

var a:Int=20
 val b:Int=a

fun smart_cast(x:Any) {
    if (x is String) {
        println(x.length)

    }
    if (x is Int) {
        println(x + 10)
    }

}

//template

fun <T>smart_cast_generic(x:T){
    println(if (x is String) x.length else if (x is Int) x+10 else "not String or Null")
//    println(x.toString().length)
//    println(x.toString().toInt()+10)
}


//fun <T>filter_even(l:List<T>):List<T>{
//
//    println(l.fold(listOf<Int>()){ acc, ele -> if(ele%2==0)(acc + ele) else acc})
//    println(l.fold(listOf<Int>()){ acc, ele -> (acc+ ele*ele) })
//
//
//    return  l.filter { it%2==0 }
//
//
//    }
//    return l1
//using fold

data class Person2(val name:String, val age:Int)
{
    var dummy:Int=10
}
operator fun Person2.plus(p: Person2):String{
    return this.name+p.name
}
operator fun Person2.unaryPlus():String{
    return "Unary Plus"
}



class person3{
    val name:String="rrr"
}





fun main(){
    var str:String="Hello"
    var ch:Char=str[0]
//    println(ch is String)
    smart_cast(str)
    smart_cast_generic(str)
    smart_cast_generic(10)

//    var l:Double=33.0

    val x = 1
    when (x) {
        1 -> println("zero")
        in 1..9 -> println("single digit")
        else -> println("multiple digits")
    }
    var a= listOf<Int>(1,2,3)
    println(a+10)
    val p=Triple(1,2,"k")

    var x1:String
//    if(x1 is null){
//
//    }

//    val l1= listOf<Int>(1,2,"3")
    var l2:List<Any> = listOf(2,"3")

    var p3_obj1=person3()
    var p3_obj2=person3()


    var p2_obj1=Person2("ram",20)
    var p2_obj2:Person2 = p2_obj1.copy()
    p2_obj1.dummy=20
    println(p2_obj2)
    println(p2_obj2.dummy)
    println("${p2_obj1.hashCode()},${p2_obj1.hashCode()}")
    println(p2_obj1.equals(p2_obj2))
    println(p2_obj1==p2_obj2)
    println(p2_obj1===p2_obj2)
    println("${p3_obj1.hashCode()},${p3_obj2.hashCode()}")
    println(p3_obj1.equals(p3_obj2))
    println(p3_obj1==p3_obj2)
    println(p3_obj1===p3_obj2)


//    filter_even(mutableListOf(1,2,3,4))
    var l3= listOf(1,2,"a")
    var l4= listOf(1,2,"a")
    println(l3===l3)

    val map = mutableMapOf<Int,String>()
    map.put(1,"Ishita")
    map.put(2,"Kamal")
    map.put(3,"Kanika")
    map.put(4,"Minal")
    map.put(5,"Neha")
    map.put(6,"Pratyush")
    map.put(7,"Shagun")
    map.put(8,"Shashank")
    map.put(9,"Uday")
    map.put(10,"Vandit")
    println("Initial map is")
    println(map)
    // Destructuring a map entry into key and values
    val newmap = map.mapValues { (it.value + "Hello") }
    println("Map after appending Hello")
    println(newmap)
    var f1:Float=1.1f
    var f2:Float=1.1f
    var f3=f1
    println(f1===f2)
    println(f1===f3)
    println(p2_obj1+p2_obj2)
    println( + p2_obj1)

}