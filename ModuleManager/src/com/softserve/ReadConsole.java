package com.softserve;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class ReadConsole {
    
    protected static BufferedReader br() {
	return new BufferedReader(new InputStreamReader(System.in));
    }
    
}
  
