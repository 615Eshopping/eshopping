package com.eshopping.dto;

import java.util.List;

/**EasyUIGrid框架标准返回格式
 * Created by AnKh on 2017/3/5.
 */
public class EUDataGridResult {
    private long total;
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
