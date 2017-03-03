package com.eshopping.service.impl;

import com.eshopping.dao.CommodityClassDao;
import com.eshopping.dao.CommodityDao;
import com.eshopping.entity.Commodity;
import com.eshopping.exception.ResourceConflictException;
import com.eshopping.exception.ResourceNotFoundException;
import com.eshopping.exception.ResourceOperationFailException;
import com.eshopping.service.CommodityService;
import com.github.pagehelper.PageHelper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        if(commodity.getCommodityId() == commodityDao.findById(commodity.getCommodityId()).getCommodityId()){
            throw new ResourceConflictException("商品已经存在");
        }
        if (commodityClassDao.findById(commodity.getCommodityClass().getCommodityClassId()) == null){
            throw new ResourceNotFoundException("商品类别不存在");
        }
        int saveCount = commodityDao.save(commodity);

        if (saveCount <= 0 )throw new ResourceOperationFailException("保存失败");

    }

    @Transactional
    public void deleteById(Integer commodityId) {
        if(commodityDao.findById(commodityId) == null){
            throw new ResourceNotFoundException("商品不存在");
        }
        int deleteCount = commodityDao.deleteById(commodityId);
        if(deleteCount <= 0){
            throw new ResourceOperationFailException("删除失败");
        }

    }

    @Transactional
    public void updateById(Commodity commodity) {
        if(commodityDao.findById(commodity.getCommodityId()) == null){
            throw new ResourceNotFoundException("商品不存在");
        }
        int updateCount = commodityDao.updateById(commodity);
        if(updateCount <= 0){
            throw new ResourceOperationFailException("更新失败");
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
            throw new ResourceNotFoundException("商品不存在");
        }
        return  commodity;
    }
}
