package org.la.student.test.dome;

public class UserInput {
    
    public static class TextInput {
    	
    	StringBuilder sb = new StringBuilder();
    	
    	public void add(char c) {
    		sb.append(c);
    	}
    	
    	public String getValue() {
    		return sb.toString(); 
    	}
    }

    public static class NumericInput extends TextInput{
    	
    	StringBuilder sb = new StringBuilder();
    	
    	@Override
    	public void add(char c) {
    		if(c>='0' && c<='9') {
    			sb.append(c);
    		}
    	}
    	
    	@Override
    	public String getValue() {
    		return sb.toString(); 
    	}
    	
    }

    public static void main(String[] args) {
    	TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}