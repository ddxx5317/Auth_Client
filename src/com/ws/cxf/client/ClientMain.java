package com.ws.cxf.client;
import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import com.ws.cxf.Cat;
import com.ws.cxf.HelloWord;
import com.ws.cxf.User;
import com.ws.cxf.impl.HelloWordImpl;
import com.ws.cxf.interceptor.AuthHeaderInterceptor;

public class ClientMain {

	public static void main(String[] args) {


		HelloWordImpl helloWordImpl = new HelloWordImpl(); 
		HelloWord helloWord = helloWordImpl.getHelloWordImplPort();
		
		//添加客户端拦截器
		Client client = ClientProxy.getClient(helloWord);
		client.getOutInterceptors().add(new AuthHeaderInterceptor("ABC","123"));
		client.getOutInterceptors().add(new LoggingOutInterceptor());
		
		String result = helloWord.sayHi("大圣");
		System.out.println(result);
		
		User user = new User();
		user.setId(1);
		user.setName("B");
		user.setPass("456");
		user.setAddr("海盗船");
		List<Cat> catList = helloWord.getCatsByUser(user);
		for(Cat cat : catList){
			System.out.println(cat.getName()+" "+cat.getColor());
		}
	}

}
