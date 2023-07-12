package com.example.dagger.modules

import com.example.services.UserService
import com.example.services.impl.UserServiceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UserServiceModule {

    @Provides
    fun provideUserService(): UserService{
        return UserServiceImpl()
    }
}