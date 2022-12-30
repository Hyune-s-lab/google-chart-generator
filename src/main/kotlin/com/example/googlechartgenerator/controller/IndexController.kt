package com.example.googlechartgenerator.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class IndexController {
    @GetMapping("/index")
    fun chart(model: Model): ModelAndView {
        val mav = ModelAndView()
        mav.viewName = "index"

        return mav
    }
}
