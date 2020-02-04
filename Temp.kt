import kotlin.math.abs

fun main(args: Array<String>) {

    print("Enter your temperature:")
    var input = readLine()!!.toFloat()


    if (input <= 97.4) {
        print("$input is low")
    }
    else  if (input >= 99.6) {
        print("$input is high")
    }
    else if (input in 97.5..99.5){
        print("$input is normal")
    }


}