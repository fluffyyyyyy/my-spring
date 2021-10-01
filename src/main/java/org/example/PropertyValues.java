package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyValues {
    private final List<PropertyValue> propertyValueList= new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        //可以加重复判断
        this.propertyValueList.add(pv);
    }
}
