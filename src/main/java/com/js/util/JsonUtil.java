package com.js.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtil {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static String objectToJson(Object data) {
        try {
            String json = MAPPER.writeValueAsString(data);
            return json;
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
        try {
            T t = MAPPER.readValue(jsonData, beanType);
            return t;
        } catch (Exception e) {
            return null;
        }
    }

    public static String formatJson(String jsonStr) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Object obj = mapper.readValue(jsonStr, Object.class);
            String value = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
            return value;
        } catch (IOException e) {
            return null;
        }
    }
}
