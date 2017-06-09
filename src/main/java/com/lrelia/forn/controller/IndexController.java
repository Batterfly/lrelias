package com.lrelia.forn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a href="mailto:yinjunfeng@vpgame.cn">Yinjf</a>
 * @date 2017年5月25日
 */
@Controller
public class IndexController {
	@RequestMapping("/")
    public String index() {
        return "index";
    }
	

}
