package com.myapp.appassembler.tool;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class SortStringToken {
    public SortStringToken() {
    }

    public LinkedHashMap<String, Integer> sort(String values) {

        String[] lists = null;
        lists = values.split(" ");
        LinkedHashMap<String, Integer> linkMap = new LinkedHashMap<>();

        String val = null;
        for (int i = 0; i < lists.length; i++) {
            val = lists[i];
            if (linkMap.containsKey(val)) {
                linkMap.replace(val,linkMap.get(val) + 1);
            } else {
                linkMap.put(val, 1);
            }
        }

        return linkMap;
    }
}
