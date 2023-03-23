package io.github.carlosquijano.app.domain.repository

import io.github.carlosquijano.app.data.AuthExternalService
import io.github.carlosquijano.app.domain.model.UserContext
import javax.inject.Inject

interface UserProfileRepository {
    fun profile(context: UserContext)
    fun login(context: UserContext)
    fun logout(context: UserContext)
}

class UserProfileRepositoryImpl @Inject constructor() : UserProfileRepository {

    @Inject lateinit var authExternalService: AuthExternalService

    override fun profile(context: UserContext) {
        TODO("Not yet implemented")
    }

    override fun login(context: UserContext) {
        authExternalService.login()
    }

    override fun logout(context: UserContext) {
        TODO("Not yet implemented")
    }
}
