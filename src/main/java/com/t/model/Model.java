package com.t.model;

import java.util.Date;

import com.t.annotation.Table;
import com.t.annotation.TableFiled;

/**
 * 这是个模板,参照此文件生成 hmb.xml,DTO,Dao,Bpo,Facade,Service,ServiceImpl,sql
 * 
 * @author: shuyi
 * @date 2019/1/23 14:31
 */
@Table(clazzName = "Tb2bUserDTO", tableName = "B2B_USER", comment = "用户信息表")
public class Model {

    @TableFiled(comment = "主键")
    String id;
    @TableFiled(comment = "用户名", length = "100")
    String userName;
    @TableFiled(comment = "年龄")
    Integer userAge;
    @TableFiled(comment = "创建时间")
    Date createTime;
    @TableFiled(comment = "财产")
    Double userMoney;

}
