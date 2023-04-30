fun main(args: Array<String>) {
//    val person = Person("Michel", 25)
//    person.greet()
//
//    println("=======================================")
//    val student = Student("Kim", 24 )
//    student.greet()
//    student.study()
    val openButton: Button = OpenButton()
    val closeButton:Button = CloseButton()

    openButton.onCLick()
    closeButton.onCLick()

    println(openButton)
    println(closeButton)
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

