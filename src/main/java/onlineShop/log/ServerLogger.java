package onlineShop.log;

import org.springframework.stereotype.Component;

@Component(value = "serverLogger") //This is a bean name'severLogger'
public class ServerLogger implements Logger {
    public void log(String info) {
        System.out.println("server log = " + info);
    }
}
