package com.lkb.dsal

import androidx.constraintlayout.solver.widgets.Rectangle
import java.io.File

/*
* Single responsibility
* Open close
* Liskov substitution
* Interface segregation
* Dependency inversion
* */
class Task {
    fun downloadFile(path: String) {}
    fun parseFile(file: File) {}
    fun persistData(data: File) {}
}


open class Shape {}
class Rectangle : Shape() {}
class Square : Shape() {}
class Area {
    fun calculateShape(shapes: Array<Shape>) {
        shapes.forEach {
            if (it is Rectangle) {
                //Todo
            } else {
                //Todo
            }
        }
    }
}


// if super class is replaceable


