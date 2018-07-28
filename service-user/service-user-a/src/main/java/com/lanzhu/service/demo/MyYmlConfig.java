package com.lanzhu.service.demo;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "info")
public class MyYmlConfig {

    private String title;
    private String desc;
    private int numberValue1;
    private double numberValue2;
    private boolean booleanvalue;
    private Object nullValue;
    private Map<String, String> objectValue;
    private List<String> listValue;
    private Integer[] arryValue;
    private String dateValue;
    private String timeValue;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getNumberValue1() {
        return numberValue1;
    }

    public void setNumberValue1(int numberValue1) {
        this.numberValue1 = numberValue1;
    }

    public double getNumberValue2() {
        return numberValue2;
    }

    public void setNumberValue2(double numberValue2) {
        this.numberValue2 = numberValue2;
    }

    public boolean isBooleanvalue() {
        return booleanvalue;
    }

    public void setBooleanvalue(boolean booleanvalue) {
        this.booleanvalue = booleanvalue;
    }

    public Object getNullValue() {
        return nullValue;
    }

    public void setNullValue(Object nullValue) {
        this.nullValue = nullValue;
    }

    public Map<String, String> getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(Map<String, String> objectValue) {
        this.objectValue = objectValue;
    }

    public List<String> getListValue() {
        return listValue;
    }

    public void setListValue(List<String> listValue) {
        this.listValue = listValue;
    }

    public Integer[] getArryValue() {
        return arryValue;
    }

    public void setArryValue(Integer[] arryValue) {
        this.arryValue = arryValue;
    }

    public Date getDateValue() {
        if (StringUtils.isNotEmpty(this.dateValue)) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd").parse(this.dateValue);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void setDateValue(String dateValue) {
        this.dateValue = dateValue;
    }

    public Date getTimeValue() {
        if (StringUtils.isNotEmpty(this.timeValue)) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(this.timeValue);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void setTimeValue(String timeValue) {
        this.timeValue = timeValue;
    }
}
