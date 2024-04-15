package com.example

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.getNotes(){
    routing {
        get("/aman") {
            call.respondText("Aman is testing")
        }
    }
}