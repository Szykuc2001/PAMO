package com.example.kotlinexercises

/**
 * Szymon Kuczyński s22466
 * Exercise 1
 * Write a function called circleArea that takes the radius of a circle in integer format as a parameter and outputs the area of that circle.
 */

import kotlin.math.PI fun circleArea(radius: Int): Double { return PI * radius * radius } fun main() { println(circleArea(2)) // 12.566370614359172
}
