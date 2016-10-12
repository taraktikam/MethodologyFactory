package com.index.methodology.service;

import com.index.methodology.constants.MethodologyNames;
import com.index.methodology.factory.IMethodology;
import com.index.methodology.factory.impl.CustomMethodologyA;
import com.index.methodology.factory.impl.CustomMethodologyB;

/*
 * Calculation service for custom methodologies
 * Returns corresponding class.
 */
public class CalculationService {
	
	public IMethodology getMethodology(String type){
		switch (type) {
		case MethodologyNames.CUSTOM_A:
			return new CustomMethodologyA();
		case MethodologyNames.CUSTOM_B:
			return new CustomMethodologyB();
		default:
			break;
		}
		return null;
	}
}
