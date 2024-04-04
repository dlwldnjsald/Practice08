package com.javaex.ex02;

import java.io.IOException;

public class FileApp {

	public static void main(String[] args) {

		// try~catch문을 사용하여 에러를 수정하세요
		
		try {
				fileRead();
			
			} catch (IOException e) {
				System.err.println("파일을 읽을 수 없습니다.");
				
				
			} catch (Exception e) {
				e.printStackTrace();
			
			}
		
	}


	private static void fileRead() throws IOException {
		// TODO Auto-generated method stub
		throw new IOException();
		
	}
	
}
	
	
	
	
	
	
	

