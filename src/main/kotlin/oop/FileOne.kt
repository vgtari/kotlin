package oop

fun main(args: Array<String>) {
    println("Welcome to oop")
    var firstcar = Car("Prado", "V8", "KDN222G")
    var secondcar = Car("Mercedes", "C200", "KDG777L")
    println(secondcar.model)

    var firstFruit = Fruit("Mango", "Yellow", 35.00)
    var secondFruit = Fruit("Apple", "Pink", 40.00)
    println(firstFruit.name)

    var firstPhone = Phone("Samsung", "Android", "Type C")
    firstPhone.call("0715606446")

    var firstStudent = Student("Vicky", "iamvicky@gmail.com", "user123")
    firstStudent.regtister()
    firstStudent.login()
    firstStudent.logout()

    var firstTeacher = Teacher("Wanyama", "wanyama@test.com", "123pass")

    firstTeacher.regtister()
    firstTeacher.login()
    firstTeacher.logout()
    firstTeacher.checkAttendance()
    firstTeacher.submitResults()

    var firstHod = Hod("Hod", "wanyama@test.com", "123pass")

    firstHod .regtister()
    firstHod .login()
    firstHod .logout()
    firstHod .checkAttendance()
    firstHod .submitResults()

    firstStudent.setIdNumber("42498979")
    println(firstStudent.getIdNummber())

    var maths = Maths()
    maths.grading()
    maths.standardizeResults( )
}
