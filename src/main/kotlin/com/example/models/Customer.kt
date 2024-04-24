package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Customer(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String
)

/**
 * No, we wouldn't actually store data this way, we would use a database. This is simply a
 * tutorial focused on routing, request handling, and responses
 */

val customerStorage = mutableListOf<Customer>()