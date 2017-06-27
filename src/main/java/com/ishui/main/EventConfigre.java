package com.ishui.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ishui.beans")
@ComponentScan("com.ishui.main")
public class EventConfigre {

}
