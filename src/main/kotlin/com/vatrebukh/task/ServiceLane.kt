package com.vatrebukh.task

/*
 * Complete the 'serviceLane' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. 2D_INTEGER_ARRAY cases
 */

fun serviceLane(widths: Array<Int>, cases: Array<Array<Int>>): Array<Int> {

    return cases.map {widths.copyOfRange(it[0], it[1]+1).minOrNull()!!}.toTypedArray()

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val width = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val cases = Array(t) { Array(2){ 0 } }

    for (i in 0 until t) {
        cases[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = serviceLane(width, cases)

    println(result.joinToString("\n"))
}