package com.example.googlechartgenerator.controller

import com.example.googlechartgenerator.controller.request.BarchartMaterialRequest
import com.example.googlechartgenerator.controller.request.Body
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.ModelAndView

@Controller
class ChartController {
    @GetMapping("/charts/barchart_material")
    fun chart(
        @RequestParam requestString: String,
        model: Model
    ): ModelAndView {
        val request = requestString.convert()

        val mav = ModelAndView()
        mav.addObject("request", request)
        mav.viewName = "barchart_material"

        return mav
    }
}

private fun String.convert(): BarchartMaterialRequest =
    split("\r\n").let {
        val drop = it.drop(2)
            .map { it2 ->
                val split = it2.split(",")
                Body(split[0], split[1].toLong(), split[2].toLong())
            }
        BarchartMaterialRequest(
            title = it[0],
            header = it[1].split(","),
            body = drop
        )
    }
