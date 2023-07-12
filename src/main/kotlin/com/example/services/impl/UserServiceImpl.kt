package com.example.services.impl

import com.example.models.User
import com.example.services.UserService

class UserServiceImpl: UserService {
    override fun createUser(payload: User): Boolean {
        println("service -> create user")
        return true
    }
}