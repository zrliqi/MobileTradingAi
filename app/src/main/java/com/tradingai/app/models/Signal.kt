package com.tradingai.app.models

data class Signal(
    val id: String = "",
    val symbol: String = "",
    val type: String = "BUY", // BUY or SELL
    val entryPrice: String = "",
    val stopLoss: String = "",
    val target: String = "",
    val timestamp: String = ""
)
