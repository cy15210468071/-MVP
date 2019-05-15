package com.aoto.library.mvp;

public class BaseEventbusBean<T> {
    private int type;
    private T obj;

    public BaseEventbusBean(int type, T obj) {
        this.type = type;
        this.obj = obj;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
