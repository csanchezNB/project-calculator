package com.sanitas.calculator.utils;

/**
 * @author csanchez
 *
 */
public class Constants {

	public static final String MASK_DATE_COMPLETE_JSON_ES = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";// yyyy-MM-dd HH:mm:ss

	public static final String ADD = "ADD";
	public static final String SUB = "SUB";
	
	public static final String ERROR = "Error";
	public static final String WARNING = "Warning";

	public static final String DESCRIPTION_ERROR = "Se ha producido un error general en el servidor";
	public static final String DESCRIPTION_ERROR_PARAMS = "Parámetros incorrectos.";
	public static final String DESCRIPTION_ERROR_PARAMS_OPERATOR = "Parámetros incorrectos. El operador debe ser suma (ADD) o resta (SUB)";

	public static final String CODE_200 = "200";
	public static final String CODE_500 = "500";
	public static final String CODE_406 = "406";

	public static final String CODE_200_DESC = "Operation done";
	public static final String CODE_500_DESC = "Error executing operation";
	public static final String CODE_406_DESC = "Wrong parameters";

	public static final String EXECUTE_DESC = "Get result of an operation of two numbers.";

	public static final String LOG_CALCULATOR_EXECUTE = " -- CalculatorController - execute - EndWithStatus :: ";
	public static final String LOG_CALCULATOR_CHECK = " -- CalculatorController - checkParams - EndWithStatus :: ";


}
