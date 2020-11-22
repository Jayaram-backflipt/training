data class Person1(var name: String,var age:Int){
    var gender:Char='M'   //this does not include in data class functions
    fun p(){
        println("HIII")
    }
}
//class dummy{
//    var a:Int=10
//}
fun main(){
    var p1=Person1("ram",10)
    p1.p()
    println(p1.toString())
    println(p1.component1())
//    var d1=dummy()
//    d1.component1()
}

