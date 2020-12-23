package com.LifeStylePlan.Common.utils.config;

import java.util.HashMap;
import java.util.Map;

public class RuntimePropertiesManager {
    private static RuntimePropertiesManager instance;
    private Map<String, String> propertyMap;

    private RuntimePropertiesManager() {
        this.propertyMap = new HashMap<>();
        System.getProperties().forEach((key, value) -> propertyMap.put(String.valueOf(key), String.valueOf(value)));
    }

    public static RuntimePropertiesManager getInstance() {
        if(instance == null) instance = new RuntimePropertiesManager();

        return instance;
    }

    public String getPropertyValue(String property) {
        if(!this.propertyMap.containsKey(property))
            return null;

        return this.propertyMap.get(property);
    }
}
