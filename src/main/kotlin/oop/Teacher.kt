package oop

open class Teacher(name:String,
              email:String,
              password:String):Student(name, email, password){
    fun checkAttendance(){
        println("Yeah, I can check the attendance")
    }
    fun submitResults(){
        println("Yeah, I can submit results")
    }
}