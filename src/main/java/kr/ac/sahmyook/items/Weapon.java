package kr.ac.sahmyook.items;

public class Weapon {

    private String name = "없음";
    private int upgradeLevel = -1;
    private int price = 0;

    public void setUpgradeLevel(int upgradeLevel) {
        System.out.println("****************");
        System.out.print(this.name + " +" + this.upgradeLevel +" -> ");
        this.upgradeLevel = upgradeLevel;
        this.setName();
        this.setPrice();
        if (this.upgradeLevel > 0) System.out.println(this.name + " +" + this.upgradeLevel);
        else System.out.println(this.name);
        System.out.println("****************");
    }

    public void setName() {
        switch (this.upgradeLevel){
            case 0 : this.name = "무인검"; break;
            case 1 : this.name = "은검"; break;
            case 2 : this.name = "차가운 칼날"; break;
            case 3 : this.name = "뒷골목의 섬광"; break;
            case 4 : this.name = "제례검"; break;
            case 5 : this.name = "칠흑검"; break;
            case 6 : this.name = "매의검"; break;
            case 7 : this.name = "오래된 자유의 서약"; break;
            case 8 : this.name = "잎을 가르는 빛"; break;
            case 9 : this.name = "하란 월백의 후츠"; break;
            case 10 : this.name = "안개를 가르는 회광"; break;
            default: this.name = "없음";
        }
    }

    public void setPrice() {
        switch (this.upgradeLevel){
            case 0 : this.price = 100; break;
            case 1 : this.price = 1000; break;
            case 2 : this.price = 2000; break;
            case 3 : this.price = 5500; break;
            case 4 : this.price = 10000; break;
            case 5 : this.price = 20000; break;
            case 6 : this.price = 50000; break;
            case 7 : this.price = 100000; break;
            case 8 : this.price = 250000; break;
            case 9 : this.price = 750000; break;
            case 10 : this.price = 5000000; break;
            default: this.price = 0;
        }
    }

    public int getUpgradeLevel() {
        return upgradeLevel;
    }

    public int getPrice() {
        return price;
    }

    public void showWeapon(){
        if(this.upgradeLevel >= 0) System.out.println(this.name + " +" + this.upgradeLevel + " " + this.price);
        else System.out.println("없음");

    }
}
