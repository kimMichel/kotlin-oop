fun main(args: Array<String>) {
//    val person = Person("Michel", 25)
//    person.greet()
//
//    println("=======================================")
//    val student = Student("Kim", 24 )
//    student.greet()
//    student.study()

//    val openButton: Button = OpenButton()
//    val closeButton:Button = CloseButton()
//
//    openButton.onCLick()
//    closeButton.onCLick()
//
//    println(openButton)
//    println(closeButton)

    val shapes = arrayOf(
        Rectangle("Rectangle 1", 5.0, 3.0),
        Circle("Circle 1", 2.0)
    )
    for (shape in shapes) {
        println("Area of ${shape.name}: ${shape.getArea()}")
    }
}

// Herança
open class Person(val name: String,val age: Int) {
    fun greet() {
        println("Hi, my name is $name and i have $age years old.")
    }
}

class Student(name: String, age: Int): Person(name, age) {
    fun study() {
        println("$name is studying.")
    }
}

// Polimorfismo
interface Button {
    fun onCLick() {
        println("i was clicked")
    }
}

class OpenButton(): Button {
    override fun onCLick() {
        println("open button was clicked")
    }
}

class CloseButton(): Button {
    override fun onCLick() {
        println("close button was clicked")
    }
}

// Abstração
abstract class Shape(val name: String) {
    abstract fun getArea(): Double
}

class Rectangle(name: String, val width: Double, val height: Double): Shape(name) {
    override fun getArea(): Double {
        return width * height
    }
}

class Circle(name: String, val  radius: Double): Shape(name) {
    override fun getArea(): Double {
        return Math.PI * (radius * radius)
    }
}



