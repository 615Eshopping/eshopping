for work
需要修改 sql中 commodity的详细评价和图片需要分表
           user中的注册ip需要分表
           这样子 sql中有如下几个表
           users
           admins
           commodity
           commodityPicture
           commodityDepict
           commodityClass
           orderForm
           orderList
           这样修改免得数据库存取一次都来的超级慢，有的也不必要展示在列表中