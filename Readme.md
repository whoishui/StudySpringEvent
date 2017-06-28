//监听器（DemoListener）的作用就是：只要继承了事件（DemoEvent）的监听器，在发布器发布事件的时候，都会自动收到事件的通知，事件数据的处理主要是在监听器中做处理
	//例如有两个监听器（DemoListener，DemoListener2）都继承了DemoEvent事件，发布器在发布了DemoEvent事件后，两个监听器分别处理了这个事件。
	//事件监听器的监听是按顺序进行，而不是异步。