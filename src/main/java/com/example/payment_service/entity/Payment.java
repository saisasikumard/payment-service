package com.example.payment_service.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="PAYMENT_TB")
@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment {
    @Id
    @GeneratedValue
    int paymentId;
    String paymentStatus;
    String TranscationId;

}
