package com.example.handlers.impl

import com.example.handlers.UserHandler
import com.example.models.User
import com.example.services.UserService
import javax.inject.Inject

class UserHandlerImpl @Inject constructor(private val service: UserService): UserHandler {
    override fun createUser(payload: User): Boolean {
        println("inside user handler create user")
        return service.createUser(payload)
    }
}