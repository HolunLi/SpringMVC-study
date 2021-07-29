package com.holun.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.text.SimpleDateFormat;

public class JsonUtil {

    public static String getJsonString(Object object) {
        return getJsonString(object, "yyyy-MM-dd HH:mm:ss");
    }

    public static String getJsonString(Object object, String format) {
        ObjectMapper objectMapper = new ObjectMapper();
        //不使用时间戳,即Date对象转换成json字符串,不再是以时间戳的形式呈现
        objectMapper.configure(SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS, false);
        //自定义日期格式
        objectMapper.setDateFormat(new SimpleDateFormat(format));
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
