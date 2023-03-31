package io.github.cq.jetpackcompose.app.ux.features.profile

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.cq.jetpackcompose.app.domain.model.UserContext
import io.github.cq.jetpackcompose.app.domain.repository.UserProfileRepository
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
