package com.br.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {
		public static void main(String args[]) {
			System.out.println("Hello !!");
			List<String> greetings = new ArrayList<String>();
			System.out.println("Split Count : "+StringUtils.split("abc def",' ').length);
			
		}
}