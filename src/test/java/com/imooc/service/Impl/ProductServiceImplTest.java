package com.imooc.service.Impl;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;


    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("1");
        Assert.assertEquals("1", productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotEquals(0, productInfoList.size());
    }

//    @Test
//    public void findAll() {
//        Sort sort = Sort.by(Sort.Order.desc("create_date"));
//        Pageable pageable =PageRequest.of(Integer.parseInt("0"), Integer.parseInt("2"), sort);
//        Page<ProductInfo> productInfos = productService.findAll((java.awt.print.Pageable) pageable);
//        System.out.println(productInfos.getTotalElements());
//    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("2");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(32.5));
        productInfo.setProductStock(200);
        productInfo.setProductIcon("http://yyy.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(3);
        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);

    }
}