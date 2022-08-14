package com.vatrebukh.task

/*
 * Complete the 'howManyGames' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER p
 *  2. INTEGER d
 *  3. INTEGER m
 *  4. INTEGER s
 */

fun howManyGames(price: Int, discount: Int, minPrice: Int, s: Int): Int {
    var count = 0
    var currentPrice = price
    var sum = s

    while (sum >= currentPrice) {
        count++
        sum -= currentPrice
        if (currentPrice > minPrice) {
            currentPrice = Math.max(minPrice, currentPrice - discount)
        }
    }
    return count
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val p = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val m = first_multiple_input[2].toInt()

    val s = first_multiple_input[3].toInt()

    val answer = howManyGames(p, d, m, s)

    println(answer)
}
