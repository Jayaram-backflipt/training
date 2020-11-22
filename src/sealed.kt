sealed class Seal
data class A(var value: Int):Seal()
data class B(var value: Int):Seal()
fun main(){
    var dummy=A(4)
    fun1(dummy)

}
fun fun1(c:Seal){

    when(c){
        is A -> println("A")
        is B -> println("B")
    }
}