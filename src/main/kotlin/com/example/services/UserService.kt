package com.example.services

import com.example.models.User

interface UserService {
    fun createUser(payload: User): Boolean
}