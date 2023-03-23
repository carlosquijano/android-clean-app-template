package io.github.carlosquijano.app.data

interface AuthExternalService {
    fun login()
    fun logout()
    fun signup()
}