package com.rxf113.converter.core.visitors;

import com.alibaba.druid.sql.visitor.SQLASTVisitor;
import com.rxf113.converter.core.enums.FieldControlTypeEnum;
import com.rxf113.converter.core.unit.Table;

import java.util.List;
import java.util.Map;

/**
 * 自定义的接口 扩展两个方法
 *
 * @author rxf113
 */
public interface CusSelectFieldVisitorAdapter extends SQLASTVisitor {
    /**
     * 获取表信息
     * @return 表信息
     */
    List<Table> getTables();

    /**
     * 设置组装字段集
     * @param assembledFields 字段集
     */
    void setAssembledFields(Map<FieldControlTypeEnum, List<String>> assembledFields);
}