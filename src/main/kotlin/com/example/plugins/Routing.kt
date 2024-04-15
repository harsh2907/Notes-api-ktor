package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Welcome to Notes Api!")
        }

        get("/notes") {
            call.respondText("Get all notes here!")
        }
    }
}


