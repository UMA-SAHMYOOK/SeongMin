package kr.ac.sahmyook.blacksmith;

import kr.ac.sahmyook.Application;
import kr.ac.sahmyook.items.*;

public class Selling {

    public void sellWeapon(Weapon weapon){
        if(weapon.getUpgradeLevel() > -1) {
            System.out.println("이런 걸작을 팔아줘서 고맙네!");
            Application.setMoney(Application.getMoney() + weapon.getPrice());
            weapon.setUpgradeLevel(-1);
        }
        else {
            System.out.println("자네.. 정신차리게 자네는 검이 없네..");
        }
    }

    public void sellArmours(Armours armours, int type){
        if(armours.getUpgradeLevel() > -1) {
            System.out.println("이런 걸작을 팔아줘서 고맙네!");
            Application.setMoney(Application.getMoney() + armours.getPrice());
            armours.setUpgradeLevel(-1, type);
        }
        else {
            System.out.println("자네.. 정신차리게 자네는 "+ armours.showType(type) + "이 없네..");
        }
    }
}
