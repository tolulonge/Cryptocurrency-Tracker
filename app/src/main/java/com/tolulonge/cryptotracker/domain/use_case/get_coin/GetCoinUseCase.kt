package com.tolulonge.cryptotracker.domain.use_case.get_coin

import com.tolulonge.cryptotracker.common.Resource
import com.tolulonge.cryptotracker.data.remote.dto.toCoin
import com.tolulonge.cryptotracker.data.remote.dto.toCoinDetail
import com.tolulonge.cryptotracker.domain.model.Coin
import com.tolulonge.cryptotracker.domain.model.CoinDetail
import com.tolulonge.cryptotracker.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading<CoinDetail>())
            val coins = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coins))
        }catch (e: HttpException){
            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "An unexpected error occured"))
        }catch (e: IOException){
            emit(Resource.Error<CoinDetail>("Couldn't reach server. Check your internet connection"))
        }
    }
}