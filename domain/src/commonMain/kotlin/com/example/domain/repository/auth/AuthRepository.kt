package com.example.domain.repository.auth

import com.example.domain.model.RegisterModel
import com.example.domain.model.UserModel

interface AuthRepository {
    suspend fun login(email: String, password: String): Result<UserModel>
    suspend fun register(request: RegisterModel): Result<UserModel>
}