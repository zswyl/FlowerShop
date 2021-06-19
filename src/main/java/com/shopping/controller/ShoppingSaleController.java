
package com.shopping.controller;

import com.alibaba.fastjson.JSONArray;
import com.shopping.entity.ShoppingSale;
import com.shopping.service.ShoppingRecordService;
import com.shopping.service.ShoppingSaleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import javax.annotation.Resource;

@Controller
class ShoppingSaleController {
    @Resource
    private ShoppingRecordService shoppingRecordService;
    @Resource
    private ShoppingSaleService shoppingSaleService;

    @ResponseBody
    @RequestMapping(value = "/getAllSales")
    public Map<String, Object> getAllSales() {
        System.out.println("我接收到了获取用户请求");
        List<ShoppingSale> shoppingSaleList = new ArrayList<>();
        shoppingSaleList = shoppingSaleService.getAllSale();
        String allSales = JSONArray.toJSONString(shoppingSaleList);
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("allSales", allSales);
        return resultMap;
    }
}