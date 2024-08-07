package pl.adrianek.cafe_management_system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import pl.adrianek.cafe_management_system.POJO.Bill;

import java.util.List;

public interface BillDao extends JpaRepository<Bill, Integer> {

    List<Bill> getAllBills();

    List<Bill> getBillByUserName(@Param("username") String currentUser);
}
