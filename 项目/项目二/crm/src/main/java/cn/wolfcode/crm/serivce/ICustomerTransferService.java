package cn.wolfcode.crm.serivce;

import cn.wolfcode.crm.domain.CustomerTransfer;
import cn.wolfcode.crm.qo.CustomerTransferObject;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ICustomerTransferService {
    //保存
    void save(CustomerTransfer customerTransfer);
    //删除
    void delate(Long id);
    //修改
    void update(CustomerTransfer customerTransfer);
    //查单个
    CustomerTransfer get(Long id);
    //查多个
    List<CustomerTransfer> getAll();

    PageInfo query(CustomerTransferObject qo);
    
}
