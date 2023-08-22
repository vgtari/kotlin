package oop

open class Student(open var name:String,
                   open var email:String,
                   open var password:String) {
    //encapsulation
    private var gender:String = ""
    fun setGender(gender:String) {
        this.gender
    }
    fun getGender():String{
        return this.gender
    }

    private var idNumber:String = ""
    fun setIdNumber(idNumber:String){
        this.idNumber = idNumber
    }
fun getIdNummber():String {
    return this.idNumber
}

    fun regtister(){
        println("Yeah, I can register")
    }

    fun login(){
        println("Yeah, I can login")
    }

    fun logout(){
        println("Yeah, I can logout")
    }
}