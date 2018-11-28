package com.study.test;

import java.util.*;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-04 19:36
 */
public class demo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("记录数：");
        int num = scanner.nextInt();
        System.out.println("时间值A：");
       int time = scanner.nextInt();
        System.out.println("订单号 ");
        List<Map<String, Integer>> datas = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Map<String, Integer> data = new HashMap<String, Integer>() {{
                String input = scanner.next();
                String[] arr = input.split(" ");
                put("id", Integer.parseInt(arr[0]));
                put("start", Integer.parseInt(arr[1]));
                put("end", Integer.parseInt(arr[2]));
            }};
            datas.add(data);
        }
        System.out.println(search(datas, time));
        //System.out.println(search1(arr,1,0,arr.length-1));
    }


    public static int search(List<Map<String, Integer>> arr, int n)//非递归
    {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (n <= arr.get(mid).get("end") && n >= arr.get(mid).get("start")) {
                return arr.get(mid).get("id");
            }
            if (arr.get(mid).get("start") > n) {
                low = mid - 1;

            } else if (arr.get(mid).get("end") < n) {
                low = mid + 1;
            }
        }
        return -1;

    }
}
