package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * 类目
 * springboot类名和表名一致
 * 若表名s_product_category如果类名和表名不一致，
 * 类名称加上@Table(name=s_product_category)
 */

@Entity
@DynamicUpdate
@Data
public class ProductCategory {

      /** 类目id.*/
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategory() {
    }
}
