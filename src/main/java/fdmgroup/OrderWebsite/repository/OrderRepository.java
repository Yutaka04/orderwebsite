package fdmgroup.OrderWebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fdmgroup.OrderWebsite.model.customer.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
