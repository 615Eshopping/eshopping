package com.eshopping.util;

/**这个应该在dto中
 * Created by AnKh on 2017/3/3.
 */
//// TODO: 2017/3/7 需要改造
public class ResultInfo {
    private boolean success;
    private Object data;
    private String message;
    private long total;

    public ResultInfo(boolean success, Object data) {
        this.success = success;
        this.data = data;
    }

    public ResultInfo(boolean success, Object data, long total) {
        this.success = success;
        this.data = data;
        this.total = total;
    }

    public ResultInfo(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
