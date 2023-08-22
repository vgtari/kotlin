package oop

class Hod (name:String,
email:String,
password:String):Teacher(name, email, password){
    fun suspendTeacher(){
        println("Yeah, i can suspend a teacher")
    }

    fun scheduleMeeting(){
        println("Yeah, i can schedule a meeting")
    }
}