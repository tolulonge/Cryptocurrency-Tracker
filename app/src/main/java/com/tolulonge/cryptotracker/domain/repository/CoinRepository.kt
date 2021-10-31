package com.tolulonge.cryptotracker.domain.repository

import com.tolulonge.cryptotracker.data.remote.dto.CoinDetailDto
import com.tolulonge.cryptotracker.data.remote.dto.CoinDto

interface CoinRepository {
    
    suspend fun getCoins() : List<CoinDto>

    suspend fun getCoinById(coinId: String) : CoinDetailDto

}