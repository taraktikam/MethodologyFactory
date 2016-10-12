package com.index.methodology.demo;

import com.index.methodology.constants.MethodologyNames;
import com.index.methodology.factory.IMethodology;
import com.index.methodology.service.CalculationService;

public class CalculateMethodology {

	public static void main(String[] args) {
		CalculationService service = new CalculationService();
		
		IMethodology customMethodologyA = service.getMethodology(MethodologyNames.CUSTOM_A);
		customMethodologyA.calculate();
		
	}
}
