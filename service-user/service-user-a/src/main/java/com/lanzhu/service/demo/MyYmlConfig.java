package com.lanzhu.service.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

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
    private Date dateValue;
    private Date timeValue;

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
        return dateValue;
    }

    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }

    public Date getTimeValue() {
        return timeValue;
    }

    public void setTimeValue(Date timeValue) {
        this.timeValue = timeValue;
    }
}
