package com.util;


import com.google.common.base.Strings;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-06-22 10:43
 */
public class ExcelDemo {
    public static void main(String[] args) {
        excel();
    }

    public static void excel() {
        XSSFWorkbook work = null;
        try {
            work = new XSSFWorkbook(new FileInputStream("E:\\name.xlsx"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<String> sq = new ArrayList<>();
        List<String> zzs = new ArrayList<>();
        List<String> dys = new ArrayList<>();
        XSSFSheet sheet = work.getSheetAt(0);
        for (int i = 0; i < sheet.getLastRowNum() - 1; i++) {
            XSSFRow row = sheet.getRow(i);
            if (row != null) {
                XSSFCell l1 = row.getCell(0);
                XSSFCell l2 = row.getCell(1);
                XSSFCell l3 = row.getCell(2);
                if (l1 != null) {
                    dys.add(l1.getStringCellValue());
                }
                if (l2 != null) {
                    zzs.add(l2.getStringCellValue());
                }
                if (l3 != null) {
                    sq.add(l3.getStringCellValue());
                }
            }
        }
        Map<String, String> retVal = new HashMap<>();
        for (String s : sq) {
            List<String> need = new ArrayList<>();
            String newName = null;
            for (String zz : zzs) {
                if (zz.contains(s)) {
                    newName = zz;
                }
            }
            if (Strings.isNullOrEmpty(newName)) {
            } else {
                for (String dy : dys) {
                    if (dy.contains(s)) {
                        need.add(dy);
                        retVal.put(dy, newName);
                    }
                }
            }
        }
        XSSFWorkbook out = new XSSFWorkbook();
        XSSFSheet outsheet = out.createSheet();
        retVal.entrySet().forEach(stringStringEntry -> {
            System.out.println(stringStringEntry.getKey() + "%" + stringStringEntry.getValue());
        });
    }
}
