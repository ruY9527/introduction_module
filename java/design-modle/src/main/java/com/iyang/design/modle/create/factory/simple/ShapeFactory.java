package com.iyang.design.modle.create.factory.simple;

import com.iyang.design.modle.create.factory.simple.obj.Circle;
import com.iyang.design.modle.create.factory.simple.obj.Rectangle;
import com.iyang.design.modle.create.factory.simple.obj.Square;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Yang
 * @date 2020/8/6 / 14:46
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){

        if(StringUtils.isEmpty(shapeType)){
            return null;
        }
        if("CIRCLE".equalsIgnoreCase(shapeType)){
            return new Circle();
        } else if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        } else if("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }

}
