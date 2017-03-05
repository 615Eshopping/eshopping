package com.eshopping.controller;

import com.eshopping.dto.EUDataGridResult;
import com.eshopping.entity.Commodity;
import com.eshopping.enums.ExceptionEnums;
import com.eshopping.exception.ResourceNotFoundException;
import com.eshopping.service.CommodityService;
import com.eshopping.util.Page;
import com.eshopping.util.ResultInfo;
import com.github.pagehelper.PageInfo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by AnKh on 2017/3/3.
 */
@Controller
@RequestMapping("/commodity")
public class CommodityController {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CommodityService commodityService;

    @RequestMapping(value = "/{commodityId}",method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo getCommodityById(@PathVariable("commodityId") Integer commodityId){
        ResultInfo resultInfo;
        try {
            Commodity commodity = commodityService.findByCommodityId(commodityId);
            resultInfo = new ResultInfo(true,commodity);
        }catch (Exception e){
            resultInfo = new ResultInfo(false,e.getMessage());
            return  resultInfo;
        }
        return resultInfo;
    }

    @RequestMapping(value = "/{commodityId}/update",method = RequestMethod.PUT,produces = "application/json;charset=utf-8")
    @ResponseBody
    public ResultInfo updateCommodity(@PathVariable("commodityId") Integer commodityId, @RequestBody Commodity commodity){
        ResultInfo resultInfo = null;
        commodity.setCommodityId(commodityId);
        try {
            commodityService.updateById(commodity);
            resultInfo = new ResultInfo(true, ExceptionEnums.UPADTE_SUCCESS.getStateInfo());
        }catch (RuntimeException e1){
            return new ResultInfo(false,e1.getMessage());
        }
        return resultInfo;
    }

    @RequestMapping(value = "/{commodityId}/delete",method = RequestMethod.DELETE)
    @ResponseBody
    public ResultInfo deleteCommodity(@PathVariable("commodityId") Integer commodityId){
        ResultInfo resultInfo;
        try {
            commodityService.deleteById(commodityId);
            resultInfo = new ResultInfo(true,ExceptionEnums.DELETE_SUCCESS.getStateInfo());
        }catch (Exception e){
            resultInfo = new ResultInfo(false,e.getMessage());
            return resultInfo;
        }
        return resultInfo;
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo save(@RequestBody Commodity commodity){
        try{
            commodityService.save(commodity);
            return new ResultInfo(true,ExceptionEnums.SAVE_SUCCESS.getStateInfo());
        }catch (RuntimeException e1){
            return new ResultInfo(false,e1.getMessage());
        }
    }

    @RequestMapping(value = "/list" ,method = RequestMethod.GET)
    @ResponseBody
    public EUDataGridResult findByPage(Integer pageNums,Integer rows){
        EUDataGridResult result = commodityService.findAll(pageNums,rows);
        return result;
    }
}
