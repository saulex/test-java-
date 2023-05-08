package com.example.demo.services;

import com.example.demo.models.ShippingAddress;
import com.example.demo.repositories.ShippingAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ShippinAddressService {

    @Autowired
    ShippingAddressRepository shippingAddressRepository;

    public ArrayList<ShippingAddress> saveShippingAddress() {
        return (ArrayList<ShippingAddress>) shippingAddressRepository.findAll();
    }

    public ShippingAddress saveShippingAddress(ShippingAddress usuario) {
        return shippingAddressRepository.save(usuario);
    }

    public Optional<ShippingAddress> getShippingAddressById(Integer id) {
        return shippingAddressRepository.findById(id);
    }

    public boolean deleteShippingAddress(Integer id) {
        try {
            shippingAddressRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
