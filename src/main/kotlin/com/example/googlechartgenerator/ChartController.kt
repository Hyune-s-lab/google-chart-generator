package com.example.googlechartgenerator

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class ChartController {

    @GetMapping("/charts/barchart_material")
    fun chart(): String {
        return "barchart_material"
    }
}
