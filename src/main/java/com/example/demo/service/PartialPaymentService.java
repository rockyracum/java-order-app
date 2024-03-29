package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import com.example.demo.api.dto.NewPartialPaymentDTO;
import com.example.demo.api.dto.UpdatePartialPaymentDTO;
import com.example.demo.domain.entity.PartialPayment;

public interface PartialPaymentService {

    public List<PartialPayment> getAll();

    public PartialPayment getById(UUID id) throws NoSuchElementException;

    public List<PartialPayment> getAllByCustomerId(UUID id) throws NoSuchElementException;

    public PartialPayment createPartialPayment(NewPartialPaymentDTO newPartialPaymentDTO) throws IllegalArgumentException;

    public void updatePartialPayment(UUID id, UpdatePartialPaymentDTO updatePartialPaymentDTO);

    public void deletePartialPaymentById(UUID id) throws IllegalArgumentException;

}
