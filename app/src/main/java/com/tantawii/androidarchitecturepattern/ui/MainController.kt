package com.tantawii.androidarchitecturepattern.ui

import com.tantawii.androidarchitecturepattern.database.Database

class MainController {

    fun login(username: String, password: String):Int{
        return  if (
            username == Database.getCurrentUser().username &&
            password == Database.getCurrentUser().password)
            1
            else 0
    }

}