package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态
 */

@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String messsage;

    ProductStatusEnum(Integer code, String messsage) {
        this.code = code;
        this.messsage = messsage;
    }
}
