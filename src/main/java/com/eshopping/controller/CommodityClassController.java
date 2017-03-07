package com.eshopping.controller;

import com.eshopping.dto.EUDataGridResult;
import com.eshopping.entity.CommodityClass;
import com.eshopping.enums.ExceptionEnums;
import com.eshopping.service.CommodityClassService;
import com.eshopping.util.Page;
import com.eshopping.util.ResultInfo;
import com.github.pagehelper.PageInfo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by AnKh on 2017/3/5.
 */
@Controller
@RequestMapping(value = "/commodityClass")
public class CommodityClassController {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    CommodityClassService commodityClassService;

    @RequestMapping(value = "/{commodityClassId}",method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo findByCommodityClassId(@PathVariable("commodityClassId") Integer commodityClassId){
        ResultInfo resultInfo;
        try {
            CommodityClass commodityClass = commodityClassService.findByCommodityClassId(commodityClassId);
            resultInfo = new ResultInfo(true,commodityClass);
            return resultInfo;
        }catch (RuntimeException e1){
            return new ResultInfo(false,e1.getMessage());
        }
    }

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo save(@RequestBody CommodityClass commodityClass){
        ResultInfo resultInfo;
        try {
            commodityClassService.save(commodityClass);
            resultInfo = new ResultInfo(true, ExceptionEnums.SAVE_SUCCESS.getStateInfo());
            return resultInfo;
        }catch(RuntimeException e1){
            return new ResultInfo(false,e1.getMessage());
        }
    }

    @RequestMapping(value = "/{commodityClassId}/delete",method = RequestMethod.DELETE)
    @ResponseBody
    public ResultInfo deleteByCommodityClassId(@PathVariable("commodityClassId") Integer commodityClassId){
        ResultInfo resultInfo;
        try{
            commodityClassService.deleteByCommodityClassId(commodityClassId);
            resultInfo = new ResultInfo(true,ExceptionEnums.DELETE_SUCCESS.getStateInfo());
            return  resultInfo;
        }catch (RuntimeException e1){
            return new ResultInfo(false,e1.getMessage());
        }
    }

    @RequestMapping(value = "/{commodityClassId}/update",method = RequestMethod.PUT,produces = "application/json;charset=utf-8")
    @ResponseBody
    public ResultInfo updateByCommodityClassId(@PathVariable("commodityClassId") Integer commodityClassId,
                                               @RequestBody CommodityClass commodityClass) {
        ResultInfo resultInfo;
        commodityClass.setCommodityClassId(commodityClassId);
        try{
            commodityClassService.updateByCommodityClassId(commodityClass);
            resultInfo = new ResultInfo(true,ExceptionEnums.DELETE_SUCCESS.getStateInfo());
            return  resultInfo;
        }catch (RuntimeException e1) {
            return new ResultInfo(false,e1.getMessage());
        }
    }


    @RequestMapping(value = "/list" ,method = RequestMethod.GET)
    @ResponseBody
    public EUDataGridResult findByPage(Integer pageNums, Integer rows){
        EUDataGridResult result = commodityClassService.findAll(pageNums,rows);
        return result;
    }

}
