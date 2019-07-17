package cn.wolfcode.crm.serivce;

import cn.wolfcode.crm.qo.PotenialCustomerReportObject;

import java.util.List;
import java.util.Map;

public interface IPotenialCustomerReportService {
    List<Map<String, Object>> listPotentialCustomerData(PotenialCustomerReportObject qo);
}
