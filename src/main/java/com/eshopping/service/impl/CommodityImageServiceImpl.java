package com.eshopping.service.impl;

import com.eshopping.dao.CommodityImageDao;
import com.eshopping.entity.CommodityImage;
import com.eshopping.enums.ExceptionEnums;
import com.eshopping.exception.ResourceNotFoundException;
import com.eshopping.exception.ResourceOperationFailException;
import com.eshopping.service.CommodityImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.cci.RecordTypeNotSupportedException;
import org.springframework.stereotype.Service;

/**
 * Created by AnKh on 2017/3/8.
 */
@Service
public class CommodityImageServiceImpl implements CommodityImageService{
    @Autowired
    CommodityImageDao commodityImageDao;

    public void save(CommodityImage commodityImage) {
        if(commodityImageDao.getImage(commodityImage.getCommodityId()) != null){
            int upadteCount = commodityImageDao.updateImage(commodityImage);
            if (upadteCount <= 0){
                throw new ResourceOperationFailException(ExceptionEnums.UPDATE_FAIL.getStateInfo());
            }
        }else{
            int addCount = commodityImageDao.addImage(commodityImage);
            if (addCount <= 0){
                throw new ResourceOperationFailException(ExceptionEnums.SAVE_FAIL.getStateInfo());
            }
        }
    }

    public CommodityImage findImageByCommodityId(Integer commodityId) {
        CommodityImage commodityImage = commodityImageDao.getImage(commodityId);
        if(commodityImage == null) {
            throw new ResourceNotFoundException("ImageNotFound");
        }else {
            return  commodityImage;
        }

    }
}
