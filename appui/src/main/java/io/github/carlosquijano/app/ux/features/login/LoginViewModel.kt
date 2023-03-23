package io.github.carlosquijano.app.ux.features.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.carlosquijano.app.domain.model.UserContext
import io.github.carlosquijano.app.domain.repository.UserProfileRepository
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val userProfileRepository: UserProfileRepository,
) : ViewModel() {

    var username by mutableStateOf("")
    var password by mutableStateOf("")

    fun validate(): Boolean {
        return true
    }

    fun login(onSuccess: () -> Unit) {
        userProfileRepository.login(
            context = UserContext(
                username = username,
            ),
        )
    }
}
