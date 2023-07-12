package com.example.handlers

import com.example.models.User

interface UserHandler {
    fun createUser(payload: User): Boolean
}