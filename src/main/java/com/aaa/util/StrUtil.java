package com.aaa.util;

import java.util.ArrayList;
import java.util.List;

public class StrUtil {
    public static List<Integer> parseToInteger(String[] strs){
        List<Integer> list = new ArrayList<Integer>();
        for (String string : strs) {
            list.add(Integer.parseInt(string));
        }
        return list;
    }
}
