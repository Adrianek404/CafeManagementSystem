package pl.adrianek.cafe_management_system.service;

import org.springframework.http.ResponseEntity;
import pl.adrianek.cafe_management_system.POJO.Bill;

import java.util.List;
import java.util.Map;

public interface BillService {
    ResponseEntity<String> generateReport(Map<String, Object> requestMap);

    ResponseEntity<List<Bill>> getBills();

    ResponseEntity<byte[]> getPdf(Map<String, Object> requestMap);

    ResponseEntity<String> deleteBill(Integer id);
}
