package com.hlkj.springcloud;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Lixiangping
 * @createTime 2022年05月14日 19:31
 * @decription:
 */
@Data
public class Friend implements Serializable {

    private String name;
    private String port;

}
