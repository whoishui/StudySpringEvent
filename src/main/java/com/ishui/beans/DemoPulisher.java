package com.ishui.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
@Service
public class DemoPulisher {
 @Autowired	
 ApplicationContext applicationContext;
 
 public void pulisher(String msg){
	 //System.out.println("pulisher:"+this.toString());
	 applicationContext.publishEvent(new DemoEvent(this, msg));
 }
}
