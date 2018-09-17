import java.lang.Math;

public class Sorcier extends Personnage {
    protected float pouvoir=(float)Math.random();

    public float getPouvoir(){
        return this.pouvoir;
    }

    public Sorcier(float pdv, String nom){
        super(pdv, nom);
    }

    public void attaque(Victime v){
        if(this.mort()) {
            float coup=this.PDV*this.getPouvoir();
            this.addVie(v.subitCharme(coup));
        }
    }

    public float subitFrappe(float coup) {
        this.addVie(-coup);
        if(this.mort()) {
            return -this.PDV * this.getPouvoir();
        }
        else{return 0;}
    }
    public float subitCharme(float coup) {
        //this.addVie(-coup);////normalement 0 mais sinon c'est cheaté
        return 0;
    }
}
