package com.example.dagger.modules

import com.example.handlers.UserHandler
import com.example.handlers.impl.UserHandlerImpl
import com.example.services.UserService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UserHandlerModule {

    @Provides
    fun provideUser(service: UserService): UserHandler{
        return UserHandlerImpl(service)
    }
}