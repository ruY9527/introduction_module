package com.iyang.design.modle.create.prototype;

/**
 * @author Yang
 * @date 2020/8/6 / 20:09
 */
public abstract class ShapePrototype implements Cloneable {

    public String id;
    public String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    abstract void draw();

    /**
     * clone 方法
     * @return
     */
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clone;
    }

}
