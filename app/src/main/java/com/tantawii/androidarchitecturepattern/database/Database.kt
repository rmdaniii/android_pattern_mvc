package com.tantawii.androidarchitecturepattern.database

import com.tantawii.androidarchitecturepattern.data.User

object Database {

    fun getCurrentUser() : User{
        return User("tantawii", "<PASSWORD>")
    }

}