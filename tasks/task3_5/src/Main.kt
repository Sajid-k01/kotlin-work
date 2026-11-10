// Task 3.5: simple file I/O



fun main() {
    // Add your code here
    print("Enter a value for x: ")
    var x = readln().toInt()
    x = if (x > 100) 100 else x

    println(x)
}
