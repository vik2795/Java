public class Cloth {

        int DaysWorn;
        boolean needsToWashed;
        boolean ToBeRepaired;
        int wear;
        int wash;
        int repair;
        String getInfo;
        int condition;

    public int getWear() {
        return DaysWorn+1;
    }

    public int getWash() {

        return (this.DaysWorn=0 && this.condition-1);
    }

    public int getRepair() {
        return this.repair;
    }

    public String getGetInfo() {
        if (overwear = true) {
             System.out.println(overwear + " viselt" + DaysWorn + "napok óta, még " + condition + "mosási iklusok vannak hátra.");
        }
        else
            System.out.println(underwear + " viselt" + DaysWorn + "napok óta, még " + condition + "mosási iklusok vannak hátra.");
    }

    public boolean isToBeRepaired() {
       if(condition>5 && overwear=true){
           System.out.println("Javításra szorul");
       }
       else
           System.out.println("Nem javítható");

    }
}


