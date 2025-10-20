// Task 5.2.2: conversion of marks into grades, using a function
fun main(args:Array<String>){
    for (i in args){
        val grade = i.toInt()
        val mark = grade(grade)
        println("%grade is a $mark")
    }
}

fun grade(mark: Int): String {
    when (mark) {
        in 0..39   -> return "Fail"
        in 40..69  -> return "Pass"
        in 70..100 -> return "Distinction"
        else       -> return "?"
    }
}