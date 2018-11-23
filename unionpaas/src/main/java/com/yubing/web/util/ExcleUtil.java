package com.yubing.web.util;

import com.yubing.util.JsonDateValueProcessor;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.util.ResourceUtils;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by wanglei on 2018/11/22.
 */
public class ExcleUtil {

    private static final Logger LOGGER = Logger.getLogger(ExcleUtil.class);

    public static void export(String templateName , List<?> values, HttpServletResponse response) throws Exception{
        if(null == values || values.size() < 1) {
            return;
        }
        File templateFile = null;
        JSONArray templateJsonObjs = null;
        try {
            templateFile = ResourceUtils.getFile("classpath:template/export/"+templateName);
            Long filelength = templateFile.length();
            byte[] filecontent = new byte[filelength.intValue()];

            FileInputStream in = new FileInputStream(templateFile);
            in.read(filecontent);
            in.close();

            String jsonTem = new String(filecontent,"utf-8");
            templateJsonObjs = JSONArray.fromObject(jsonTem);
        }catch (Exception e) {
            e.printStackTrace();
        }

        ServletOutputStream out = null;
        try {
            out = response.getOutputStream();
            //设置文件头：最后一个参数是设置下载文件名(这里我们叫：张三.pdf)
            response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(createFileName()+".xls", "UTF-8"));
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
            return;
        }

        try{
            if(null == templateFile) {
                return;
            }
            //处理日期格式，注册转换器
            JsonConfig jsonConfig = new JsonConfig();
            jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
            JSONArray valueJsonObjs = JSONArray.fromObject(values,jsonConfig);
            // 第一步，创建一个workbook，对应一个Excel文件
            HSSFWorkbook workbook = new HSSFWorkbook();
            // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
            HSSFSheet hssfSheet = workbook.createSheet("sheet1");
            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
            HSSFRow row = hssfSheet.createRow(0);
            // 第四步，创建单元格，并设置值表头 设置表头居中
            HSSFCellStyle hssfCellStyle = workbook.createCellStyle();
            HSSFCell hssfCell = null;
            for (int i = 0; i < templateJsonObjs.size(); i++) {
                JSONObject templateJsonObj = templateJsonObjs.getJSONObject(i);
                //列索引从0开始
                hssfCell = row.createCell(i);
                //列名1
                hssfCell.setCellValue(templateJsonObj.getString("title"));
                //列居中显示
                hssfCell.setCellStyle(hssfCellStyle);
            }

            for (int i = 0; i < valueJsonObjs.size(); i++) {
                JSONObject value = valueJsonObjs.getJSONObject(i);
                row = hssfSheet.createRow(i+1);
                //添加内容
                for (int fileIndex = 0; fileIndex < templateJsonObjs.size(); fileIndex++) {
                    row.createCell(fileIndex).setCellValue(value.getString(templateJsonObjs.getJSONObject(fileIndex).getString("key")));
                }
            }

            // 第七步，将文件输出到客户端浏览器
            try {
                workbook.write(out);
                out.flush();
                out.close();
            } catch (Exception e) {
                LOGGER.error(e);
            }
        }catch(Exception e){
            LOGGER.error(e);
            throw new Exception("导出信息失败！");
        }
    }

    private static String createFileName() throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return simpleDateFormat.format(new Date());
    }
}
