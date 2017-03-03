package com.eshopping.service.impl;

import com.eshopping.dao.CommodityClassDao;
import com.eshopping.entity.CommodityClass;
import com.eshopping.exception.ResourceConflictException;
import com.eshopping.exception.ResourceNotFoundException;
import com.eshopping.exception.ResourceOperationFailException;
import com.eshopping.service.CommodityClassService;
import com.github.pagehelper.PageHelper;
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
        if(commodityClassDao.findById(commodityClass.getCommodityClassId()) != null){
            throw new ResourceConflictException("商品类别已经存在");
        }
        int saveCount = commodityClassDao.save(commodityClass);
        if(saveCount <= 0) {
            throw new ResourceOperationFailException("save fail");
        }

    }

    public void deleteByCommodityClassId(Integer commodityClassId) {
        if(commodityClassDao.findById(commodityClassId) == null){
            throw new ResourceNotFoundException("商品类别不存在");
        }else{
            int deleteCount = commodityClassDao.deleteById(commodityClassId);
            if(deleteCount <= 0){
                throw new ResourceOperationFailException("删除失败");
            }
        }
    }

    public void updateByCommodityClassId(CommodityClass commodityClass) {
        if(commodityClassDao.findById(commodityClass.getCommodityClassId()) == null){
            throw new ResourceNotFoundException("商品类别不存在");
        }else {
            int  updateCount = commodityClassDao.updateById(commodityClass);
            if(updateCount <= 0){
                throw new ResourceOperationFailException("更新失败");
            }
        }
    }

    public List<CommodityClass> findAll(int pageNums, int rows) {
        PageHelper.startPage(pageNums,rows);
        List<CommodityClass> commodityClassList = commodityClassDao.findAll();
        return commodityClassList;
    }
}
