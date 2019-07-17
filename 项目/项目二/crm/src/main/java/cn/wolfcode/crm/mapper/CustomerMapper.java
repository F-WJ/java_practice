package cn.wolfcode.crm.mapper;

import cn.wolfcode.crm.domain.Customer;
import cn.wolfcode.crm.qo.CustomerObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Customer record);

    Customer selectByPrimaryKey(Long id);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);

    List<Customer> queryForList(CustomerObject qo);

    void updateCustomerStatus(@Param("customerId") Long customerId, @Param("status") Integer status);

    void updateSellerById(@Param("customerId") Long customerId, @Param("sellerId") Long sellerId);
}