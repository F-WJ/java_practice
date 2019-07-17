package cn.wolfcode.crm.serivce;

import cn.wolfcode.crm.domain.Customer;
import cn.wolfcode.crm.qo.CustomerObject;
import cn.wolfcode.crm.qo.QueryObject;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ICustomerService {
    //保存
    void save(Customer customer);
    //删除
    void delate(Long id);
    //修改
    void update(Customer customer);
    //查单个
    Customer get(Long id);
    //查多个
    List<Customer> getAll();

    PageInfo query(CustomerObject qo);

    void updateCustomerStatus(Long customerId, Integer status);

    void updateSellerById(Long customerId, Long sellerId);

    void listBy(CustomerObject qo);
}
