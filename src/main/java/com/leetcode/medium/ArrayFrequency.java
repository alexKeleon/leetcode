package com.leetcode.medium;

import java.util.*;

/**
 * Created by yichaowu on 16/5/25.
 */
public class ArrayFrequency {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; ++i) {
            Integer x = Integer.valueOf(nums[i]);
            if (map.get(x) == null) {
                map.put(x, 1);
            } else {
                map.put(x, (Integer)map.get(x) + 1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<Map.Entry<Integer, Integer>>(nums.length, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() > o2.getValue()) {
                    return -1;
                } else if (o1.getValue() < o2.getValue()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.offer(entry);
        }

        for (int j = 0; j < k; ++j) {
            list.add(heap.poll().getKey());
        }
        return list;
    }
}
