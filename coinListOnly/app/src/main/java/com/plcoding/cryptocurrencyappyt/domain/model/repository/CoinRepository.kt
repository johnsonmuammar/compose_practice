package com.plcoding.cryptocurrencyappyt.domain.get_coins.repository

import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>
}