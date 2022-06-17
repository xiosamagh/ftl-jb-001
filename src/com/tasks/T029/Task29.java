package com.tasks.T029;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiFunction;

public class Task29 {
    public static void main(String[] args) {

        String[] array = new String[] {"Строка1","Строка2","Строка3","Строка4","Строка5","Строка1","Строка1"};

        Map<String,Integer> map = arrayToMap(array);

        String i = "";
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = it.next();
            i += pair.getKey() + " " + pair.getValue() + "\n";

        }

        System.out.println(i);
    }

    public static <K> Map<K, Integer> arrayToMap(K[] arrayK) {
        Map<K, Integer> map = new HashMap<>();
        for (K k : arrayK) {
            map.compute(k, new BiFunction<K, Integer, Integer>() {
                @Override
                public Integer apply(K k, Integer count) {
                    return count == null ? 1 : count + 1;
                }
            });
        }

        return map;
    }
}


