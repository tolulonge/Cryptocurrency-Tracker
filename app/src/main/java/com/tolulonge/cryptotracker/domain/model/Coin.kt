package com.tolulonge.cryptotracker.domain.model

import com.tolulonge.cryptotracker.data.remote.dto.CoinDto

data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String
)

