package com.aoto.library.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * author:chenyu
 * createdData
 * describe:
 */
public class GsonUtil {
    /**
     *  将Json数据解析成相应的映射对象
     * @param json
     * @param classname
     * @param <T>
     * @return
     */
    public static <T> T jsonToObject(String json, Class<T> classname) {
        Gson gson = new Gson();
        T t = gson.fromJson(json, classname);
        return t;
    }

    /**
     *     将Json数组解析成相应的映射对象列表
     */
    public static <T> List<T> parseJsonArrayWithGson(String jsonData, Class<T> type) {
        Gson gson = new Gson();
        List<T> result = gson.fromJson(jsonData, new TypeToken<List<T>>() {
        }.getType());
        return result;
    }
}
