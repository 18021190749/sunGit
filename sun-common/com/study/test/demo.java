package com.study.test;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-04 19:14
 */
@Data
public class demo {
    public static int NumberOf1(long n) {
        int count = 0;
        while(n!= 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) throws ParseException{
        /*String str = "321282199102321415";
        String regex = "(^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)|" +
                "(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}$)";
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regex);
        // 忽略大小写的写法
        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        // 字符串是否与正则表达式相匹配
        boolean rs = matcher.matches();
        System.out.println(rs);*/
        Table table = HashBasedTable.create();
        table.put(0,"id","val");
        table.put(1,"id","val");
        table.put(2,"id","val");
        table.put(0,"name","val2");
        table.put(1,"name","val2");
        table.put(2,"name","val2");
        for(Object str:table.columnKeySet()){
            System.out.println(str);
        }
        table.rowMap().forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });

    }
}
