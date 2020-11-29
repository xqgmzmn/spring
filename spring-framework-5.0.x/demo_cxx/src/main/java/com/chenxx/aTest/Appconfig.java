package com.chenxx.aTest;

import com.chenxx.anno.EnableCxxImport;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"com.chenxx","com.chenxx.dao"})
@EnableCxxImport

@EnableAspectJAutoProxy()

public class Appconfig {
}
