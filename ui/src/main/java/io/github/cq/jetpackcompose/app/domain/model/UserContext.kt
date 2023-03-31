package io.github.cq.jetpackcompose.app.domain.model

import java.util.*

data class UserContext(
    val contextId: String = UUID.randomUUID().toString(),
    val username: String? = null,
    val firstname: String? = null,
    val lastname: String? = null,
) : java.io.Serializable
