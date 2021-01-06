package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest{

    @Autowired
    private ProductCategoryRepository repository;


    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findById(1).orElse(null);
//        System.out.println(productCategory1);
        System.out.println(productCategory.toString());

    }

    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("男生最爱", 4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2, 3, 4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }

    @Test
    public void findByCategoryIdIn(){
        List<Integer> list = Arrays.asList(1, 7);
        List<ProductCategory> result = repository.findByCategoryIdIn(list);
        Assert.assertNotEquals(0, result);
    }
    @Test
    public void updateTest(){
        ProductCategory productCategory = repository.findById(2).orElse(null);
        productCategory.setCategoryType(11);
        productCategory.setCategoryName("男生最爱4");
        repository.save(productCategory);
    }



}