package com.vatrebukh.task

/*
 * Complete the 'beautifulTriplets' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER d
 *  2. INTEGER_ARRAY arr
 */

fun beautifulTriplets(d: Int, arr: Array<Int>): Int {

    var count = 0

    for (i in 0..arr.size - 3) {
        for (j in i+1 .. arr.size - 2) {
            if (arr[j] - arr[i] != d) {
                continue
            }
            for (k in j + 1 until arr.size) {
                if (arr[k] - arr[j] == d && arr[j] - arr[i] == d ) {
                    count++
                }
            }
        }
    }

    return count

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = beautifulTriplets(d, arr)

    println(result)
}