package com.br.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {
		
		public int countWords(String word) {
			String[] split1 = StringUtils.split(word,' ');
			return (split1 == null ? 0: split1.length);
		}
		
		public static void main(String args[]) {
			System.out.println("Hello !!");
			List<String> greetings = new ArrayList<String>();
			System.out.println("Split Count : "+StringUtils.split("abc def",' ').length);
			
		}
}