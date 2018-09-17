public class Magicien extends Sorcier implements SuperPouvoir{

    public Magicien(float pdv, String nom){
        super(pdv, nom);
    }

    public double sort(){
        return this.getPouvoir()*Math.random();
    }
    public float getPouvoir(){
        return extra*this.pouvoir;
    }

    public float subitCharme(float coup) {
        //this.addVie(-coup);//normalement 0 mais sinon c'est cheaté
        if(this.mort()) {
            return -coup*(float)sort();
        }
        else{return 0;}
    }
}
