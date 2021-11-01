package com.tolulonge.cryptotracker.domain.model

import com.tolulonge.cryptotracker.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId: String? = null,
    val name: String? = null,
    val description: String? = null,
    val symbol: String? = null,
    val rank: Int? = null,
    val isActive: Boolean? = null,
    val tags: List<String>? = null,
    val team: List<TeamMember>? = null
)


