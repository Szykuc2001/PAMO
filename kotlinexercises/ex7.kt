package com.example.kotlinexercises

/**
 * Szymon Kuczyński s22466
 * Exercise 2
 * Rewrite the circleArea function from the previous exercise as a single-expression function.
 */

import kotlin.math.PI fun circleArea1(radius: Int): Double = PI * radius * radius fun main() { println(
    circleArea1(2)
)} // 12.566370614359172 }