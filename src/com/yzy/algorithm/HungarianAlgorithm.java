package com.yzy.algorithm;

import com.yzy.exception.CustomException;

/**
 * 匈牙利算法
 */
public class HungarianAlgorithm {

    public static int[] find(int[][] arrays) {
        if (arrays == null) {
            throw new CustomException(400, "the array is empty");
        }
        // 匈牙利算法要求矩阵长宽一致
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length != arrays.length) {
                throw new CustomException(400, "Illegal Param");
            }
        }
        //
        return null;
    }
}
