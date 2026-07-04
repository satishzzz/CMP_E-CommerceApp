package com.example.data.repository

import com.example.data.data_source.RemoteDataSource
import com.example.domain.model.RegisterModel
import com.example.domain.model.UserModel
import com.example.domain.repository.auth.AuthRepository
import com.example.domain.repository.coin_list.CoinRepository

class AuthRepositoryImpl(val apiService: RemoteDataSource): AuthRepository {
    override suspend fun login(
        email: String,
        password: String
    ): Result<UserModel> {

        TODO("Provide the return value")
    }

    override suspend fun register(request: RegisterModel): Result<UserModel> {
        TODO("Not yet implemented")
    }

}