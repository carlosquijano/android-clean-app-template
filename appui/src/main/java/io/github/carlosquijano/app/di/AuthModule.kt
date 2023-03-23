package io.github.carlosquijano.app.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.carlosquijano.app.data.AuthExternalService
import io.github.carlosquijano.app.data.b4a.AuthExternalServiceImpl
import io.github.carlosquijano.app.domain.repository.UserProfileRepository
import io.github.carlosquijano.app.domain.repository.UserProfileRepositoryImpl

/**
 * This Dagger module is responsible for providing dependencies related to user authentication and
 * user profiles.
 *
 * The module is installed in the SingletonComponent, which ensures that a single
 * instance of the module is created and shared across the entire application.
 */
@InstallIn(SingletonComponent::class)
@Module
abstract class AuthModule {
    /**
     * This binding ensures that any time an instance of UserProfileRepository is required,
     * an instance of UserProfileRepositoryImpl will be provided.
     *
     * This allows for easy swapping of implementations at runtime, while still ensuring that
     * the correct UserProfileRepository interface is used throughout the application.
     */
    @Binds
    abstract fun bindsUserProfileRepository(
        userProfileRepository: UserProfileRepositoryImpl,
    ): UserProfileRepository

    /**
     * This binding ensures that any time an instance of AuthExternalService is required,
     * an instance of AuthExternalServiceImpl will be provided.
     *
     * This allows for easy swapping of implementations at runtime, while still ensuring that
     * the correct AuthExternalService interface is used throughout the application.
     */
    @Binds
    abstract fun bindsAuthExternalService(
        authExternalService: AuthExternalServiceImpl,
    ): AuthExternalService
}
