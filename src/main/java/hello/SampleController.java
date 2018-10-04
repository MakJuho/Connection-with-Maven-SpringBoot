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
        int userMoney = 10000;
        int totalPrice = 0;
//        int calcMoney = calcUserMoney(userMoney, totalPrice);
//        System.out.println("userMoney: " + userMoney + ", totalPrice: " + totalPrice);
//        System.out.println("after calculate");
//        System.out.println("price: " + calcMoney);
        int button;
        System.out.println("사용자가 가지고 있는 액수 : " + userMoney);

        while (!end) {
            printMenu();
            button = in.nextInt();
            printMenu();
            if (userMoney < 0) {
                System.out.println("액수가 부족합니다.");
                end = true;
            }
            if (button == 1) {
                totalPrice += calcTotalPrice(1000, 1);
                userMoney = calcUserMoney(userMoney, totalPrice);
            }
            else if (buttonn == 2) {
                totalPrice += calcTotalPrice(1500, 1);
                userMoney = calcUserMoney(userMoney, totalPrice);
            }
            else if (button == 3) {
                totalPrice += calcTotalPrice(1300, 1);
                userMoney = calcUserMoney(userMoney, totalPrice);
            }
            else if (button == 4) {
                totalPrice += calcTotalPrice(1000, 1);
                userMoney = calcUserMoney(userMoney, totalPrice);
            }
            else if (button == 0) {
                end = true;
                System.out.println("구매금액 : " + totalPrice + " 잔액 : " + userMoney);
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

    private static int calcUserMoney(int userMoney, int totalPrice) {
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

    public static int calcTotalPrice(int price, int number){

        return price*number;

    }
}
