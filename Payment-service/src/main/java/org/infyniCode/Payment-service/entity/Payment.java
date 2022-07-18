package org.application.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(name="PaymentInfo")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_seq")
    @SequenceGenerator(name = "payment_seq",initialValue = 1000,sequenceName = "payment_seq_name")
    private Integer id;
    private String transactionId;
    private String orderId;
    private Double amount;
    private String paymentStatus;
}
