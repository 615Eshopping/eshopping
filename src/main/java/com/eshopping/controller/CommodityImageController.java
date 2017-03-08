package com.eshopping.controller;

import com.eshopping.dao.CommodityImageDao;
import com.eshopping.entity.CommodityImage;
import com.eshopping.service.impl.CommodityImageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by AnKh on 2017/3/8.
 */
@Controller
@RequestMapping(value = "/commodity")
public class CommodityImageController {
    @Autowired
    CommodityImageServiceImpl commodityImageService;

    @RequestMapping(value = "/{commodityId}/uploadPicture", method = RequestMethod.POST)
    @ResponseBody
    public void uploadPicture(@RequestParam("file") MultipartFile file, @PathVariable("commodityId")Integer commodityId) throws IOException{
        CommodityImage commodityImage = new CommodityImage();
        commodityImage.setCommodityId(commodityId);
        commodityImage.setImage(file.getBytes());
        commodityImageService.save(commodityImage);
    }
}
