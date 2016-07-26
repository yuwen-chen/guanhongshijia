package cn.com.dyninfo.o2o.communication;

import cn.com.dyninfo.o2o.communication.common.BaseRequest;

/**
 * 二级类别列表请求类
 * request URL: https://serverurl/app/subCategory
 * request method: post
 */
public class SubCategoryRequest extends BaseRequest {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}