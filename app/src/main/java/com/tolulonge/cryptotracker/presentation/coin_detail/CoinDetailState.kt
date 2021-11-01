package com.tolulonge.cryptotracker.presentation.coin_detail

import com.tolulonge.cryptotracker.domain.model.Coin
import com.tolulonge.cryptotracker.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
    )
