class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}


class Warrior extends Fighter{
    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable(){
        return false;
    } 

    @Override
    int getDamagePoints(Fighter warrior) {
        return warrior.isVulnerable()?10:6;
    }
}


class Wizard extends Fighter{

    private boolean spell = false;
    
    public String toString(){
        return "Fighter is a Wizard";
    } 

    void prepareSpell(){
        spell = true;
    }

    @Override
    boolean isVulnerable() {
        return !spell;
    }

    @Override
    int getDamagePoints(Fighter wizard) {
       return spell?12:3;
    }    
}
