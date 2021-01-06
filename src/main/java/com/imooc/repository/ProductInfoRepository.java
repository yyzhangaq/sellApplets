package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

/**
 *
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer status);


    Page<ProductInfo> findAll(Pageable pageable);
}
