package cn.wolfcode.crm.mapper;

import cn.wolfcode.crm.qo.PotenialCustomerReportObject;

import java.util.List;
import java.util.Map;

public interface ReportMapper {
  List<Map<String, Object>> selectPotentialCustomerData(PotenialCustomerReportObject qo);
}