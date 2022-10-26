package xyz.mwszksnmdys.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.mwszksnmdys.domain.Order;

import javax.annotation.ManagedBean;

@Mapper
public interface OrderDao {

   void create(Order order);

   void update(@Param("userId") Long userId, @Param("status") Integer status);
}
