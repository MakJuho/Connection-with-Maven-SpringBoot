package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);
        boolean end = false;

        // calcUserMoney method test
//        int userMoney = 1000;
//        int totalPrice = 1500;
//        int calcMoney = calcUserMoney(userMoney, totalPrice);
//        System.out.println("userMoney: " + userMoney + ", totalPrice: " + totalPrice);
//        System.out.println("after calculate");
//        System.out.println("price: " + calcMoney);
        int button;
        while (!end) {
            printMenu();
            button = in.nextInt();
            if (button = 1) {

            }
            else if (buttonn = 2) {

            }
            else if (button = 3) {

            }
            else if (button = 4) {

            }
            else if (button = 0) {
                end = true;
                System.out.println("이용해주셔서 감사합니다.");
            }
            else {
                System.out.println("올바른 명령어를 입력하세요");
            }

        }



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
        System.out.println("----------------------------------------------------");
        System.out.println("1.콜라 1000");
        System.out.println("2.사이다 900");
        System.out.println("3.환타 700");
        System.out.println("4.포카라 스웨트 900");
        System.out.println("5.조지아 800");
        System.out.println("----------------------------------------------------");
    }
}
