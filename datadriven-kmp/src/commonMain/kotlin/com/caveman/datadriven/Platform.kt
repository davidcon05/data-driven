package com.caveman.datadriven

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform