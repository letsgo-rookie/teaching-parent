package com.atonline.servicebase.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor  //生成有参数构造方法
@NoArgsConstructor   //生成无参数构造
public class onlineException extends RuntimeException {

    private Integer code;//状态码
    private String msg;//异常信息

    @Override
    public String toString() {
        return "onlineException{" +"message=" + this.getMessage() +", code=" + code +'}';
    }
}
