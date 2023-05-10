package kr.ac.sahmyook.blacksmith;

import kr.ac.sahmyook.Application;
import kr.ac.sahmyook.items.*;


public class Upgrading {

    private int tmpLevel = 0;

    private int upgradeProbability = 0;

    private int success = 0;
    private int fail = 0;

    public void upgradeWeapon(Weapon weapon){
        if(weapon.getUpgradeLevel() == -1){
            System.out.println("자네 강화할 검을 가져오게");
        }
        else {
            if(Application.getMoney() < 1000){
                System.out.println("자네 강화는 공짜가 아닐세");
            } else if (weapon.getUpgradeLevel() == 10) {
                System.out.println("더이상 강화할 수 없네");
            }else {
                Application.setMoney(Application.getMoney() - 1000);
                this.tmpLevel = weapon.getUpgradeLevel();

                System.out.println("강화중...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                variableProbability(this.tmpLevel);
                this.upgradeProbability = (int)((Math.random() * 100) + 1);
                System.out.println("확률 : " + this.upgradeProbability + " 성공 : " + this.success + " 실패 : " + this.fail);                //log
                upgrade();

                weapon.setUpgradeLevel(this.tmpLevel);
            }
        }
    }

    public void upgradeArmours(Armours armours, int type){
        if(armours.getUpgradeLevel() == -1){
            System.out.println("자네 강화할 "+ armours.showType(type) + "을 가져오게");
        }
        else {
            if(Application.getMoney() < 1000){
                System.out.println("자네 강화는 공짜가 아닐세");
            } else if (armours.getUpgradeLevel() == 10) {
                System.out.println("더이상 강화할 수 없네");
            } else {
                Application.setMoney(Application.getMoney() - 1000);
                this.tmpLevel = armours.getUpgradeLevel();

                System.out.println("강화중...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                variableProbability(this.tmpLevel);
                this.upgradeProbability = (int)((Math.random() * 100) + 1);
                System.out.println("확률 : " + this.upgradeProbability + " 성공 : " + this.success + " 실패 : " + this.fail);                //log
                upgrade();

                armours.setUpgradeLevel(this.tmpLevel, type);
            }
        }
    }

    public void variableProbability(int level){
        switch (level){
            case 0 : setSuccess(90); setFail(10); break;
            case 1 : setSuccess(75); setFail(25); break;
            case 2 : setSuccess(60); setFail(40); break;
            case 3 : setSuccess(45); setFail(55); break;
            case 4 : setSuccess(30); setFail(70); break;
            case 5 : setSuccess(25); setFail(70); break;
            case 6 : setSuccess(20); setFail(75); break;
            case 7 : setSuccess(15); setFail(75); break;
            case 8 : setSuccess(10); setFail(80); break;
            case 9 : setSuccess(5); setFail(80); break;
        }
    }

    public void upgrade(){
        if(this.upgradeProbability <= this.success){
            this.tmpLevel += 1;
            System.out.println(this.tmpLevel);
            System.out.println("강화에 성공했네!");
            System.out.println("내가 나만 믿으라하지 않았는가!");
        } else{
            if(this.upgradeProbability > this.success && this.upgradeProbability < this.success + this.fail){
                if (this.tmpLevel > 5) this.tmpLevel -= 1;
                System.out.println("미..미안하네.. 강화에 실패했네..");
                System.out.println("다음번엔 성공해보겠네.. 정말이네..! 한번만 더 믿어주게...!");
            }
            else if(this.upgradeProbability > this.success + this.fail){
                this.tmpLevel = -1;
                System.out.println("미..미안하네.. 실수로 손이 미끄러 부러지고 말았네..");
                System.out.println("정말 미안하네...");
            }
        }
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public int getFail() {
        return fail;
    }

    public void setFail(int fail) {
        this.fail = fail;
    }

}
