package com.chenxx.imports;

import com.chenxx.dao.ImportDao1;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector1  implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{ImportDao1.class.getName()};
	}
}
