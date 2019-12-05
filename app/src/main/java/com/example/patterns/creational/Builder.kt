package com.example.patterns.creational

import java.io.File

fun main() {

    val mail = Mail("lavsexpert@gmail.com").message("Had I earned an A exam mark automatically?")

}

data class Mail(val to: String,
                var title: String = "",
                var _message: String = "",
                val cc: List<String> = listOf(),
                val bcc: List<String> = listOf(),
                val attachments: List<File> = listOf()) {

    fun message(message: String) = apply {
        _message = message
    }

}