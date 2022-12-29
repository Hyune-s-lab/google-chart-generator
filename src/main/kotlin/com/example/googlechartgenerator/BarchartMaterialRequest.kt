package com.example.googlechartgenerator

data class BarchartMaterialRequest(
    val title: String,
    val header: List<String>,
    val body: List<Body>
)

data class Body(
    val first: String,
    val second: Long,
    val third: Long
)
