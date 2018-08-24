package com.francis.spring_mvc.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hzzhugequn
 * @date 2018/8/24
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

    /**
     * 该方法没有标注路径，因此使用类级别的路劲/anno
     *
     * @param request
     * @return
     */
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String index(HttpServletRequest request) {
        return "url: " + request.getRequestURL() + " can access";
    }

    @RequestMapping(value = "/pathvar/{a}", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String demoPathVar(@PathVariable("a") String string, HttpServletRequest request) {
        return "url: " + request.getRequestURL() + " can access, str " + string;
    }

    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String passRequestParam(@RequestParam("id") long id, HttpServletRequest request) {
        return "url: " + request.getRequestURL() + " can access, id " + id;
    }

    @RequestMapping(value = {"/name1","/name2"}, produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String remove(HttpServletRequest request) {
        return "url: " + request.getRequestURL() + " can access";
    }

}
