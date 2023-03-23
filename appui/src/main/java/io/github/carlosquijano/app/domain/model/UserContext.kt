package io.github.carlosquijano.app.domain.model

import java.util.UUID

data class UserContext(
    val contextId: String = UUID.randomUUID().toString(),
    val username: String? = null,
    val firstname: String? = null,
    val lastname: String? = null,
) : java.io.Serializable
