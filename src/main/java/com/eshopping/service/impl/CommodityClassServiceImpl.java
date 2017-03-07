package com.eshopping.service.impl;

import com.eshopping.dao.CommodityClassDao;
import com.eshopping.dto.EUDataGridResult;
import com.eshopping.entity.Commodity;
import com.eshopping.entity.CommodityClass;
import com.eshopping.enums.ExceptionEnums;
import com.eshopping.exception.ResourceConflictException;
import com.eshopping.exception.ResourceNotFoundException;
import com.eshopping.exception.ResourceOperationFailException;
import com.eshopping.service.CommodityClassService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AnKh on 2017/3/3.
 */
@Service
public class CommodityClassServiceImpl implements CommodityClassService {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CommodityClassDao commodityClassDao;

    public void save(CommodityClass commodityClass) {
        if(commodityClass.getCommodityClassName() == null){
            throw new ResourceNotFoundException(ExceptionEnums.PARAM_LACK.getStateInfo());
        }
        if(commodityClassDao.findById(commodityClass.getCommodityClassId()) != null){
            throw new ResourceConflictException(ExceptionEnums.COMMODITYCLASS_FOUND.getStateInfo());
        }
        int saveCount = commodityClassDao.save(commodityClass);
        if(saveCount <= 0) {
            throw new ResourceOperationFailException(ExceptionEnums.SAVE_FAIL.getStateInfo());
        }

    }

    public void deleteByCommodityClassId(Integer commodityClassId) {
        if(commodityClassDao.findById(commodityClassId) == null){
            throw new ResourceNotFoundException(ExceptionEnums.COMMODITYCLASS_NOT_FOUND.getStateInfo());
        }else{
            int deleteCount = commodityClassDao.deleteById(commodityClassId);
            if(deleteCount <= 0){
                throw new ResourceOperationFailException(ExceptionEnums.DELETE_FAIL.getStateInfo());
            }
        }
    }

    public void updateByCommodityClassId(CommodityClass commodityClass) {
        if(commodityClassDao.findById(commodityClass.getCommodityClassId()) == null){
            throw new ResourceNotFoundException(ExceptionEnums.COMMODITYCLASS_NOT_FOUND.getStateInfo());
        }else {
            int  updateCount = commodityClassDao.updateById(commodityClass);
            if(updateCount <= 0){
                throw new ResourceOperationFailException(ExceptionEnums.UPDATE_FAIL.getStateInfo());
            }
        }
    }

    public CommodityClass findByCommodityClassId(Integer commodityClassId) {
        CommodityClass commodityClass = commodityClassDao.findById(commodityClassId);

        if (commodityClass != null){
            return commodityClass;
        }else{
            throw new ResourceNotFoundException(ExceptionEnums.COMMODITYCLASS_NOT_FOUND.getStateInfo());
        }

    }

    public EUDataGridResult findAll(int pageNums, int rows) {
        PageHelper.startPage(pageNums,rows);
        List<CommodityClass> commodityList = commodityClassDao.findAll();
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(commodityList);
        PageInfo<CommodityClass> pageInfo = new PageInfo<CommodityClass>(commodityList);
        result.setTotal(pageInfo.getTotal());
        return result;
    }
}
