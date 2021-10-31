package com.tolulonge.cryptotracker.data.repository

import com.tolulonge.cryptotracker.data.remote.CoinPaprikaApi
import com.tolulonge.cryptotracker.data.remote.dto.CoinDetailDto
import com.tolulonge.cryptotracker.data.remote.dto.CoinDto
import com.tolulonge.cryptotracker.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}