// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>)
{
    if(args.size != 3)
    {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    //s = semiperimeter 
    val a : Float = args[0].toFloat()
    val b : Float = args[1].toFloat()
    val c : Float = args[2].toFloat()
    var s : Float = (0.5 * (a + b + c)).toFloat()
    var A = sqrt(s * (s - a) * (s-b) * (s-c))

    println("Area = %.5f".format(A))
}