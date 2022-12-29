package com.example.googlechartgenerator

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class ChartController {

    @GetMapping("/chart")
    fun chart(): String {
        return "chart"
    }
}
