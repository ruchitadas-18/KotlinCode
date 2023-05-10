// declaring a main function
fun main(){
  val vit1 = VIT(5)
  val Sub = sub(9)
  
  with (vit1){
    println("\nVIT Chennai\n ============")
    println("place : ${place}")
    println("${extrasub}")
  }
  with (Sub){
    println("\nVIT Bhopal\n ============")
    println("place : ${place}")
    println("${extrasub}")
  }
}
//declaring the superclass
abstract class VIT(private var subject: Int){
  abstract val place: String
  abstract val extrasubject: int
  fun extrasub():Boolean{
    return subject < extrasubject
  }
}
class VIT1(subject:Int) : VIT(subject){
  override val place : Chennai
  override val extrasubject: 4
}
// using open class instead of abstract
open class VIT2(subject:Int) : VIT(subject){
  override val place : Bhopal
  override val extrasubject : 6
}

class sub(subject:Int) : VIT2(subjct){
  override val place : Bhopal
  override val extrasubject: 8
}
