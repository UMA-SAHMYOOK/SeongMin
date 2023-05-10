package kr.ac.sahmyook;

import kr.ac.sahmyook.blacksmith.*;
import kr.ac.sahmyook.items.Armours;
import kr.ac.sahmyook.items.Weapon;

import java.util.*;


public class Application {
    static Scanner sc = new Scanner(System.in);
    static int no = 0;
    static int exit = 0;
    static int money = 10000;

    static Weapon weapon = new Weapon();
    static Armours helmet = new Armours();
    static Armours armor = new Armours();
    static Armours pants = new Armours();
    static Armours gloves = new Armours();
    static Armours shoes = new Armours();
    static Upgrading upgrade = new Upgrading();
    static Buying buy = new Buying();
    static Selling sell = new Selling();

    public static void main(String[] args) {
        
        do {
            System.out.println("*** 성민 대장간 입구 ***");
            System.out.println("1. 들어가기");
            System.out.println("2. 떠나기");
            System.out.print("선택 : ");
            no = sc.nextInt();
            sc.nextLine();
            
            switch (no){
                case 1 : no = 0; blacksmithMenu(); break;
                case 2 :
                    System.out.println("정말 떠나려고 하는가...?");
                    try {
                        Thread.sleep(1000); //1초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("이번에는 정말 성공할 것 같네!");
                    try {
                        Thread.sleep(1000); //1초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("정말이네! 믿어주게! (예 : y / 아니요 : n)");
                    System.out.print("선택 : ");
                    exit = (int)sc.nextLine().charAt(0);
                    if(exit == 121 || exit == 89) {
                        System.out.println("에잉 쯧쯧 요즘것들은 근성이 없어!");
                        try {
                            Thread.sleep(1000); //1초 대기
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("근성이!!");
                        return;
                    } else if (exit == 110 || exit == 78) {
                        System.out.println("정말인가? 고맙네!");
                        System.out.println("내 꼭 강화를 성공시켜보겠네!");
                        no = 0;
                        break;
                    }
                default: no = 0;
            }
        } while (true);
    }

    public static void blacksmithMenu(){
        do {
            System.out.println("***** 성민 대장간 *****");
            System.out.println("소지금 : " + money);
            System.out.println("*****************");
            weapon.showWeapon();
            helmet.showArmours(1);
            armor.showArmours(2);
            pants.showArmours(3);
            gloves.showArmours(4);
            shoes.showArmours(5);
            System.out.println("*****************");
            System.out.println("1. 강화하기");
            System.out.println("2. 구매하기");
            System.out.println("3. 판매하기");
            System.out.println("4. 나가기");
            System.out.print("선택 : ");
            no = sc.nextInt();
            sc.nextLine();

            switch (no){
                case 1 : no = 0; upgradingMenu(); break;
                case 2 : no = 0; buyingMenu(); break;
                case 3 : no = 0; sellingMenu(); break;
                case 4 : no = 0; return;
                default: no = 0;
            }
        } while (true);
    }

    public static void upgradingMenu(){
        do {
            System.out.println("***** 성민 대장간 모루 앞 *****");
            System.out.println("소지금 : " + money);
            System.out.println("*****************");
            weapon.showWeapon();
            helmet.showArmours(1);
            armor.showArmours(2);
            pants.showArmours(3);
            gloves.showArmours(4);
            shoes.showArmours(5);
            System.out.println("*****************");
            System.out.println("1. 무기 강화하기 (강화비용 : 1000)");
            System.out.println("2. 모자 강화하기 (강화비용 : 1000)");
            System.out.println("3. 갑옷 강화하기 (강화비용 : 1000)");
            System.out.println("4. 바지 강화하기 (강화비용 : 1000)");
            System.out.println("5. 장갑 강화하기 (강화비용 : 1000)");
            System.out.println("6. 신발 강화하기 (강화비용 : 1000)");
            System.out.println("7. 돌아가기");
            System.out.print("선택 : ");
            no = sc.nextInt();
            sc.nextLine();

            switch (no){
                case 1 :
                    upgrade.upgradeWeapon(weapon); break;
                case 2 : upgrade.upgradeArmours(helmet, 1); break;
                case 3 : upgrade.upgradeArmours(armor, 2); break;
                case 4 : upgrade.upgradeArmours(pants, 3); break;
                case 5 : upgrade.upgradeArmours(gloves, 4); break;
                case 6 : upgrade.upgradeArmours(shoes, 5); break;
                case 7 : no = 0; return;
                default: no = 0;
            }
        } while (true);
    }

    public static void buyingMenu(){
        do {
            System.out.println("***** 성민 대장간 가판대 앞 *****");
            System.out.println("소지금 : " + money);
            System.out.println("*****************");
            weapon.showWeapon();
            helmet.showArmours(1);
            armor.showArmours(2);
            pants.showArmours(3);
            gloves.showArmours(4);
            shoes.showArmours(5);
            System.out.println("*****************");
            System.out.println("1. 무기 구매하기 (0강 아이템 가격 : 500)");
            System.out.println("2. 모자 구매하기 (0강 아이템 가격 : 500)");
            System.out.println("3. 갑옷 구매하기 (0강 아이템 가격 : 500)");
            System.out.println("4. 바지 구매하기 (0강 아이템 가격 : 500)");
            System.out.println("5. 장갑 구매하기 (0강 아이템 가격 : 500)");
            System.out.println("6. 신발 구매하기 (0강 아이템 가격 : 500)");
            System.out.println("7. 돌아가기");
            System.out.print("선택 : ");
            no = sc.nextInt();
            sc.nextLine();

            switch (no){
                case 1 : buy.buyWeapon(weapon); break;
                case 2 : buy.buyArmours(helmet, 1); break;
                case 3 : buy.buyArmours(armor, 2); break;
                case 4 : buy.buyArmours(pants, 3); break;
                case 5 : buy.buyArmours(gloves, 4); break;
                case 6 : buy.buyArmours(shoes, 5); break;
                case 7 : no = 0; return;
                default: no = 0;
            }
        } while (true);
    }

    public static void sellingMenu(){
        do {
            System.out.println("***** 성민 대장간 계산대 앞 *****");
            System.out.println("소지금 : " + money);
            System.out.println("*****************");
            weapon.showWeapon();
            helmet.showArmours(1);
            armor.showArmours(2);
            pants.showArmours(3);
            gloves.showArmours(4);
            shoes.showArmours(5);
            System.out.println("*****************");
            System.out.println("1. 무기 판매하기 (판매비용 : " + weapon.getPrice() + ")");
            System.out.println("2. 모자 판매하기 (판매비용 : " + helmet.getPrice() + ")");
            System.out.println("3. 갑옷 판매하기 (판매비용 : " + armor.getPrice() + ")");
            System.out.println("4. 바지 판매하기 (판매비용 : " + pants.getPrice() + ")");
            System.out.println("5. 장갑 판매하기 (판매비용 : " + gloves.getPrice() + ")");
            System.out.println("6. 신발 판매하기 (판매비용 : " + shoes.getPrice() + ")");
            System.out.println("7. 돌아가기");
            System.out.print("선택 : ");
            no = sc.nextInt();
            sc.nextLine();

            switch (no){
                case 1 : sell.sellWeapon(weapon); break;
                case 2 : sell.sellArmours(helmet, 1); break;
                case 3 : sell.sellArmours(armor, 2); break;
                case 4 : sell.sellArmours(pants, 3); break;
                case 5 : sell.sellArmours(gloves, 4); break;
                case 6 : sell.sellArmours(shoes, 5); break;
                case 7 : no = 0; return;
                default: no = 0;
            }
        } while (true);
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Application.money = money;
    }
}
