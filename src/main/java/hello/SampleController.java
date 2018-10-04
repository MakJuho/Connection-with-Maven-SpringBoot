package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {
    @Value("${environment.message}")
    private String message;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World! This is " + message ;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);

        // calcUserMoney method test
        int userMoney = 1000;
        int totalPrice = 1500;
        int calcMoney = calcUserMoney(userMoney, totalPrice);
        System.out.println("userMoney: " + userMoney + ", totalPrice: " + totalPrice);
        System.out.println("after calculate");
        System.out.println("price: " + calcMoney);
    }

    /*
     * calculate userMoney and totalPrice Method
     * if userMoney bigger than totalPrice, return positive numbers
     * else return negative numbers.
    */

    private static int calcUserMoney(int userMoney, int totalPrice){
        return userMoney - totalPrice;
    }

    private static void printMenu(){
        System.out.println("---------------------------");
        System.out.println("1.콜라 1000");
        System.out.println("2.환타 1500");
        System.out.println("3.사이다 1300");
        System.out.println("4.포카리스웨트 1000");
        System.out.println("5.조지아 1600");
        System.out.println("---------------------------");
    }
}