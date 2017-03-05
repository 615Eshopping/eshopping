package com.eshopping.util;

/**分页好像还是需要这么个工具类。。
 * Created by AnKh on 2017/3/5.
 */
public class Page {
    private Integer pageNums;
    private Integer rows;

    public Integer getPageNums() {
        return pageNums;
    }

    public void setPageNums(Integer pageNums) {
        this.pageNums = pageNums;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
