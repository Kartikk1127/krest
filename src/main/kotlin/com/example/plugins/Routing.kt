package com.example.plugins

import com.example.dagger.components.DaggerUserHandlerComponent
import com.example.models.User
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*

fun Application.configureRouting() {


    val users = mutableListOf<User>()

    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        post("/users"){
            val payload = call.receive<User>()
            users.add(payload)
            call.respond("User has been created")
        }

        get("/users"){
            val handler = DaggerUserHandlerComponent.create().getUserHandlerComponent()
            handler.createUser(User(id = 1, username = "Kartik"))
            call.respond(users)
        }
    }
}
