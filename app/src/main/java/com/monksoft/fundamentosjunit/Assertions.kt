package com.monksoft.fundamentosjunit

class Assertions {
    private val user = User("Brian", 29)
    private var location = "US"

    fun setLocation(location : String) {
        this.location = location
    }

    fun getLuckyNumbers(): Array<Int>{
        return arrayOf(12, 25)
    }

    fun getName(): String{
        return user.name
    }

    fun checkHuman(user: User): Boolean {
        return user.isHuman
    }

    fun checkHuman(user: User? = null): Boolean? {
        return if(user == null) null else user?.isHuman
    }

    fun isAdult(user: User): Boolean{
        if (user.isHuman) return true

        return if (location == "US") user.age >= 21
        else user.age >= 18
    }
}