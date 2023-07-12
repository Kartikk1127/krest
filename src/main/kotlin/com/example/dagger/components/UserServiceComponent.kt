package com.example.dagger.components

import com.example.dagger.modules.UserServiceModule
import com.example.services.UserService
import dagger.Component

@Component(modules = [UserServiceModule::class])
interface UserServiceComponent {
    fun getUserServiceComponent(): UserService
}