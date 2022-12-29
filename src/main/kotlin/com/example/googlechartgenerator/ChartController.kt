package com.example.googlechartgenerator

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody


@Controller
class ChartController {
    @GetMapping("/charts/barchart_material")
    fun chart(@RequestBody requestString: String): String {
        val convert = requestString.convert()
        return "barchart_material"
    }
}

private fun String.convert(): BarchartMaterialRequest =
    split("\n").let {
        BarchartMaterialRequest(
            title = it[0],
            header = it[1],
            body = it.drop(2)
        )
    }
