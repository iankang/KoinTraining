package com.example.kointraining

class UserRepository(private val api:GithubApi) {
    fun getAllUsers() = api.getUsers()
}