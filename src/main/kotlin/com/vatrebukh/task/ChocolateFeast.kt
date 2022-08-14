package com.vatrebukh.task

/*
 * Complete the 'chocolateFeast' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER c
 *  3. INTEGER m
 */

fun chocolateFeast(n: Int, c: Int, m: Int): Int {
    var count = n / c
    var bars: Int
    var wraps = n / c

    while (wraps >= m) {
        bars = wraps / m
        count += bars
        wraps -= bars * (m - 1)
    }

    return count
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val c = first_multiple_input[1].toInt()

        val m = first_multiple_input[2].toInt()

        val result = chocolateFeast(n, c, m)

        println(result)
    }
}