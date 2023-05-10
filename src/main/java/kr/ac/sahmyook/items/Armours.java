package kr.ac.sahmyook.items;

public class Armours {

    private String name = "없음";
    private int upgradeLevel = -1;
    private int price = 0;
    private int type = 0;
    public void setUpgradeLevel(int upgradeLevel, int type) {
        System.out.println("****************");
        System.out.print(this.name + " +" + this.upgradeLevel +" -> ");
        this.upgradeLevel = upgradeLevel;
        this.setName(type);
        this.setPrice();
        if (this.upgradeLevel > 0) System.out.println(this.name + " +" + this.upgradeLevel);
        else System.out.println(this.name);
        System.out.println("****************");
    }

    public void setName(int armourType) {
        if(armourType == 1) {
            switch (this.upgradeLevel){
                case 0 : this.name = "모험가의 모자"; break;
                case 1 : this.name = "행운아의 모자"; break;
                case 2 : this.name = "방랑자의 모자"; break;
                case 3 : this.name = "교관의 모자"; break;
                case 4 : this.name = "수호자의 모자"; break;
                case 5 : this.name = "전투광의 모자"; break;
                case 6 : this.name = "검투사의 모자"; break;
                case 7 : this.name = "피에 물든 기사의 모자"; break;
                case 8 : this.name = "옛 왕실의 모자"; break;
                case 9 : this.name = "잃어버린 낙원의 모자"; break;
                case 10 : this.name = "불타오르는 화염 마녀의 모자"; break;
                default: this.name = "없음";
            }
        } else if (armourType == 2) {
            switch (this.upgradeLevel){
                case 0 : this.name = "모험가의 옷"; break;
                case 1 : this.name = "행운아의 옷"; break;
                case 2 : this.name = "방랑자의 옷"; break;
                case 3 : this.name = "교관의 옷"; break;
                case 4 : this.name = "수호자의 옷"; break;
                case 5 : this.name = "전투광의 옷"; break;
                case 6 : this.name = "검투사의 옷"; break;
                case 7 : this.name = "피에 물든 기사의 옷"; break;
                case 8 : this.name = "옛 왕실의 옷"; break;
                case 9 : this.name = "잃어버린 낙원의 옷"; break;
                case 10 : this.name = "불타오르는 화염 마녀의 옷"; break;
                default: this.name = "없음";
            }
        } else if (armourType == 3) {
            switch (this.upgradeLevel){
                case 0 : this.name = "모험가의 바지"; break;
                case 1 : this.name = "행운아의 바지"; break;
                case 2 : this.name = "방랑자의 바지"; break;
                case 3 : this.name = "교관의 바지"; break;
                case 4 : this.name = "수호자의 바지"; break;
                case 5 : this.name = "전투광의 바지"; break;
                case 6 : this.name = "검투사의 바지"; break;
                case 7 : this.name = "피에 물든 기사의 바지"; break;
                case 8 : this.name = "옛 왕실의 바지"; break;
                case 9 : this.name = "잃어버린 낙원의 바지"; break;
                case 10 : this.name = "불타오르는 화염 마녀의 바지"; break;
                default: this.name = "없음";
            }
        } else if (armourType == 4) {
            switch (this.upgradeLevel){
                case 0 : this.name = "모험가의 장갑"; break;
                case 1 : this.name = "행운아의 장갑"; break;
                case 2 : this.name = "방랑자의 장갑"; break;
                case 3 : this.name = "교관의 장갑"; break;
                case 4 : this.name = "수호자의 장갑"; break;
                case 5 : this.name = "전투광의 장갑"; break;
                case 6 : this.name = "검투사의 장갑"; break;
                case 7 : this.name = "피에 물든 기사의 장갑"; break;
                case 8 : this.name = "옛 왕실의 장갑"; break;
                case 9 : this.name = "잃어버린 낙원의 장갑"; break;
                case 10 : this.name = "불타오르는 화염 마녀의 장갑"; break;
                default: this.name = "없음";
            }
        } else if (armourType == 5) {
            switch (this.upgradeLevel){
                case 0 : this.name = "모험가의 신발"; break;
                case 1 : this.name = "행운아의 신발"; break;
                case 2 : this.name = "방랑자의 신발"; break;
                case 3 : this.name = "교관의 신발"; break;
                case 4 : this.name = "수호자의 신발"; break;
                case 5 : this.name = "전투광의 신발"; break;
                case 6 : this.name = "검투사의 신발"; break;
                case 7 : this.name = "피에 물든 기사의 신발"; break;
                case 8 : this.name = "옛 왕실의 신발"; break;
                case 9 : this.name = "잃어버린 낙원의 신발"; break;
                case 10 : this.name = "불타오르는 화염 마녀의 신발"; break;
                default: this.name = "없음";
            }
        }
        setType(armourType);
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

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public String showType(int type){
        switch (type){
            case 1 : return "모자";
            case 2 : return "갑옷";
            case 3 : return "바지";
            case 4 : return "장갑";
            case 5 : return "신발";
        }
        return "";
    }

    public int getUpgradeLevel() {
        return upgradeLevel;
    }

    public int getPrice() {
        return price;
    }

    public void showArmours(int armourType){
        if(this.upgradeLevel >= 0) System.out.println(this.name + " +" + this.upgradeLevel + " " + this.price);
        else System.out.println("없음");
    }
}
