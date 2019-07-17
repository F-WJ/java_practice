package cn.wolfcode.crm.serivce.impl;

import cn.wolfcode.crm.mapper.ReportMapper;
import cn.wolfcode.crm.qo.PotenialCustomerReportObject;
import cn.wolfcode.crm.serivce.IPotenialCustomerReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class PotenialCustomerReportServiceImpl implements IPotenialCustomerReportService {
    @Autowired
    private ReportMapper reportMapper;

    @Override
    public List<Map<String, Object>> listPotentialCustomerData(PotenialCustomerReportObject qo) {
        List<Map<String, Object>> data = reportMapper.selectPotentialCustomerData(qo);
        return data;
    }
}
