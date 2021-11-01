package com.tolulonge.cryptotracker.presentation.coin_list

import com.tolulonge.cryptotracker.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
    )
