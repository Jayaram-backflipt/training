enum class Direction(var value: Int){
    NORTH(1),
    WEST(2),
    SOUTH(3),
    EAST(4);
    fun shout(){
        println("Shouted")
    }
}
fun main(){
    println(Direction.EAST.value)
    Direction.EAST.shout()
}