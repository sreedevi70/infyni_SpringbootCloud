package org.application.repo;

import org.application.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {
 //   Optional<Payment> findByPaymentId(String paymentRepo);
}
