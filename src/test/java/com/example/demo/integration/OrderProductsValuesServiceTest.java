package com.example.demo.integration;

import com.example.demo.models.Customer;
import com.example.demo.models.Order;
import com.example.demo.models.OrderProductsValues;
import com.example.demo.models.Product;
import com.example.demo.repositories.OrderRepository;
import com.example.demo.services.OrderProductsValuesService;
import com.example.demo.services.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Optional;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@ActiveProfiles("testh2")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class OrderProductsValuesServiceTest {


}