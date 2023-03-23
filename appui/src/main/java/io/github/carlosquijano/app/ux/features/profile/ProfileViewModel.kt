package com.github.carlosquijano.androidjetpacktemplate.app.ui.features.profile

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.carlosquijano.app.domain.model.UserContext
import io.github.carlosquijano.app.domain.repository.UserProfileRepository
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val userProfileRepository: UserProfileRepository,
) : ViewModel() {
    fun username(context: UserContext): String {
        return context.username ?: "n/a"
    }

    fun profile(context: UserContext) {
        userProfileRepository.profile(context)
    }
}
