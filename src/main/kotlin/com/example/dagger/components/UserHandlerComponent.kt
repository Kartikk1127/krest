package com.example.dagger.components

import com.example.dagger.modules.UserHandlerModule
import com.example.dagger.modules.UserServiceModule
import com.example.handlers.UserHandler
import dagger.Component

@Component(modules = [UserHandlerModule::class, UserServiceModule::class])
interface UserHandlerComponent {
    fun getUserHandlerComponent(): UserHandler
}