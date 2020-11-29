package com.chenxx.anno;

import com.chenxx.imports.MyImportSelector1;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyImportSelector1.class)
public @interface EnableCxxImport  {
}
