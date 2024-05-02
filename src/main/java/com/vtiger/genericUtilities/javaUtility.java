package com.vtiger.genericUtilities;

import java.security.DrbgParameters.NextBytes;
import java.util.Random;

public class javaUtility {
public  int getRandamnumber() {
	Random ran=new Random();
	return ran.nextInt(100);
	System.out.println("hi");
}
}
