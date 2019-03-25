package com.onlineclassroom.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.onlineclassroom.account" })
public class OnlineClassRoomServer {

	public static void main(String args[]) {
		try {
			SpringApplication.run(OnlineClassRoomServer.class, args);		
		}catch(Exception x) {
			x.printStackTrace();
			System.out.println("Drive Server Startup Error.........");	
		}
		
	}
}
