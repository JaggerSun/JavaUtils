package JaggeSun.JavaUtils.io.nio;

import java.util.Scanner;  
/** 
 * 测试方法 
 * @author Jagger 
 * @version 1.0 
 */  
public class Test2 {  
    //测试主方法  
    @SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{  
        //运行服务器  
//        Server.start();  
        
        //避免客户端先于服务器启动前执行代码  
//        Thread.sleep(100);  
        
        //运行客户端   
        Client.start();  
        
        // 轮询
        while(Client.sendMsg(new Scanner(System.in).nextLine()));  
    }  
}  