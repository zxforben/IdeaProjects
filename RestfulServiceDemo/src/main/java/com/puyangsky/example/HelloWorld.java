package com.puyangsky.example;
import javax.ws.rs.*;
//Path注解来设置url访问路径
@Path("/hello")
public class HelloWorld {
    //GET注解设置接受请求类型为GET
    @GET
    //Produces表明发送出去的数据类型为text/plain
    // 与Produces对应的是@Consumes，表示接受的数据类型为text/plain
    @Produces("text/plain")
    public String getString() {
        return "hello jersey!";
    }
}
