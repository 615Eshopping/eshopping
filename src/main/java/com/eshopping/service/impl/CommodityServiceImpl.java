package com.eshopping.service.impl;

import com.eshopping.dao.CommodityClassDao;
import com.eshopping.dao.CommodityDao;
import com.eshopping.entity.Commodity;
import com.eshopping.enums.ExceptionEnums;
import com.eshopping.exception.RequestParamException;
import com.eshopping.exception.ResourceConflictException;
import com.eshopping.exception.ResourceNotFoundException;
import com.eshopping.exception.ResourceOperationFailException;
import com.eshopping.service.CommodityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by AnKh on 2017/3/3.
 */
@Service
public class CommodityServiceImpl implements CommodityService {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CommodityDao commodityDao;

    @Autowired
    CommodityClassDao commodityClassDao;

    @Transactional
    public void save(Commodity commodity) {
        /*if(commodity.getCommodityId() == commodityDao.findById(commodity.getCommodityId()).getCommodityId()){
            throw new ResourceConflictException("商品已经存在");
        }*/
        /// TODO: 2017/3/4判断对象 分离出详情描述以及图片
        if(commodity.getCommodityAmount() == null|| commodity.getCommodityClass() == null || commodity.getCommodityName() == null
                || commodity.getCommodityLeaveNum() == null || commodity.getManufacturer() == null
                || commodity.getCommodityPrice() == null || commodity.getFcPrice() == null){
            /*System.out.println(commodity.getCommodityAmount());
            System.out.println(commodity.getCommodityClass());
            System.out.println(commodity.getCommodityName());
            System.out.println(commodity.getCommodityLeaveNum());
            System.out.println(commodity.getManufacturer());
            System.out.println(commodity.getCommodityPrice());
            System.out.println(commodity.getFcPrice());*/
            throw new RequestParamException(ExceptionEnums.PARAM_LACK.getStateInfo());
        }

        if (commodityClassDao.findById(commodity.getCommodityClass().getCommodityClassId()) == null){
            throw new ResourceNotFoundException(ExceptionEnums.COMMODITYCLASS_NOT_FOUND.getStateInfo());
        }

        Date nowDate = new Date();

        commodity.setRegTime(nowDate);

        int saveCount = commodityDao.save(commodity);

        if (saveCount <= 0 )throw new ResourceOperationFailException(ExceptionEnums.SAVE_FAIL.getStateInfo());

    }

    @Transactional
    public void deleteById(Integer commodityId) {
        if(commodityDao.findById(commodityId) == null){
            throw new ResourceNotFoundException(ExceptionEnums.COMMODITY_NOT_FOUND.getStateInfo());
        }
        int deleteCount = commodityDao.deleteById(commodityId);
        if(deleteCount <= 0){
            throw new ResourceOperationFailException(ExceptionEnums.DELETE_FAIL.getStateInfo());
        }

    }

    @Transactional
    public void updateById(Commodity commodity) {
        if(commodityDao.findById(commodity.getCommodityId()) == null){
            throw new ResourceNotFoundException(ExceptionEnums.COMMODITY_NOT_FOUND.getStateInfo());
        }
        int updateCount = commodityDao.updateById(commodity);
        if(updateCount <= 0){
            throw new ResourceOperationFailException(ExceptionEnums.UPDATE_FAIL.getStateInfo());
        }
    }

    public List<Commodity> findAll(int pageNums, int rows) {
        PageHelper.startPage(pageNums,rows);
        List<Commodity> commodityList = commodityDao.findAll();
        return commodityList;
    }

    public Commodity findByCommodityId(Integer commodityId) {
        Commodity commodity = commodityDao.findById(commodityId);
        if (commodity == null){
            throw new ResourceNotFoundException(ExceptionEnums.COMMODITY_NOT_FOUND.getStateInfo());
        }
        return  commodity;
    }
}
