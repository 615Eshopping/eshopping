package com.eshopping.enums;

/**
 * Created by AnKh on 2017/3/5.
 */
public enum ExceptionEnums {
    SAVE_SUCCESS(1,"保存成功"),
    SAVE_FAIL(2,"保存失败"),
    DELETE_SUCCESS(3,"删除成功"),
    DELETE_FAIL(4,"删除失败"),
    COMMODITY_FOUND(5,"商品已经存在"),
    COMMODITY_NOT_FOUND(6,"商品不存在"),
    COMMODITYCLASS_FOUND(7,"商品类别已经存在"),
    COMMODITYCLASS_NOT_FOUND(8,"商品类别不存在"),
    UPADTE_SUCCESS(9,"更新成功"),
    UPDATE_FAIL(10,"更新失败"),
    PARAM_LACK(11,"参数缺失")
    ;

    private int state;
    private String stateInfo;

    ExceptionEnums(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public static ExceptionEnums stateOf(int index){
        for(ExceptionEnums state:values()){
            if (state.getState() == index)
                return state;
        }
        return null;
    }
}
