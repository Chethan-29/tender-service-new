package com.dxc.eproc.tender.cucumber;

import com.dxc.eproc.tender.TenderServiceNewApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = TenderServiceNewApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
