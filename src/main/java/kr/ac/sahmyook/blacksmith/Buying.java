package kr.ac.sahmyook.blacksmith;

import kr.ac.sahmyook.items.*;
import kr.ac.sahmyook.Application;
public class Buying {

    public void buyWeapon(Weapon weapon){
        if(weapon.getUpgradeLevel() > -1) System.out.println("자네는 무기를 이미 가지고 있지 않나?");
        else {
            if(Application.getMoney() >= 500){
                System.out.println("여기 가능성이 무긍무진한 검일세!");
                Application.setMoney(Application.getMoney() - 500);
                weapon.setUpgradeLevel(0);
            }
            else System.out.println("자네.. 검을 공짜로 사려는 생각은 아니겠지..?");
        }
    }

    public void buyArmours(Armours armours, int type){
        if(armours.getUpgradeLevel() > -1) System.out.println("자네는 "+ armours.showType(type) + "을(를) 이미 가지고 있지 않나?");
        else {
            if(Application.getMoney() >= 500){
                System.out.println("여기 가능성이 무긍무진한 " + armours.showType(type) + "일세!");
                Application.setMoney(Application.getMoney() - 500);
                armours.setUpgradeLevel(0, type);
            }
            else System.out.println("자네.. "+ armours.showType(type) +"을(를) 공짜로 사려는 생각은 아니겠지..?");
        }
    }
}
