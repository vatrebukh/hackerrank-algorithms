package com.vatrebukh.task

/*
 * Complete the 'workbook' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER k
 *  3. INTEGER_ARRAY arr
 */

fun workbook(chapters: Int, pageSize: Int, problemsInChapter: Array<Int>): Int {
    var count = 0

    val book: MutableMap<Int, Pair<Int, Int>> = HashMap()
    var pageNumber = 1
    problemsInChapter.forEach {
        val pages = it / pageSize
        for (i in 0 until pages) {
            book[pageNumber++] = i * pageSize + 1 to (i+1) * pageSize
        }
        if (it % pageSize != 0) {
            book[pageNumber++] = pages * pageSize + 1 to it
        }
    }

    book.forEach{
        if (it.key >= it.value.first && it.key <= it.value.second) {
            count++
        }
    }

    return count
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = workbook(n, k, arr)

    println(result)
}