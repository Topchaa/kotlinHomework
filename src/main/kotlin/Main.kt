import java.text.SimpleDateFormat
import java.util.Date

fun main() {
//--------
var num = arrayOf<Int>(1,2,3,4,5,6,7,8)
println(taskone(num))
//--------
var text : String = "radar"
  println(tasktwo(text))
//-------



}



//---------
fun taskone(num: Array<Int>):Int {
var sum = 0
    var  quantity = 0
for (i in num){
   if ( num.indexOf(i)%2 == 0){
        sum+=i
       quantity+=1
   }
}
return (sum/quantity)
}
//---------
fun tasktwo(text: String): Boolean {
var reversed = text.reversed()
return text.equals(reversed)


}
//--------
fun Date.formatToString(): String {
    val format = SimpleDateFormat("dd/MM/yyyy")
    return format.format(this)
}