package com.example.cmmdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
expect fun nativeCameraAccess()