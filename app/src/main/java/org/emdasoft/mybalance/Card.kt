package org.emdasoft.mybalance

data class Card(
    val cardName: String,
    val amount: Double,
    val currency: String,
    val cardImageId: Int,
    val description: String
    )
