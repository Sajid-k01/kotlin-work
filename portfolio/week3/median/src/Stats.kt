// Task 7.7.1: statistics functions

fun median(data: List<Float>): Float {
    require(data.isNotEmpty()) { "Cannot calculate median of empty data" }

    val sorted = data.sorted()
    val middle = sorted.size / 2

    return if (sorted.size % 2 == 1) {
        sorted[middle]
    } else {
        (sorted[middle - 1] + sorted[middle]) / 2
    }
}

fun displayStats(data: List<Float>) {
    require(data.isNotEmpty()) { "Cannot calculate statistics for empty data" }

    println("Minimum: ${data.min()}")
    println("Maximum: ${data.max()}")
    println("Mean: ${data.average()}")
    println("Median: ${median(data)}")
}
