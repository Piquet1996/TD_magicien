public class Monstre extends Personnage {



    public Monstre(float pdv, String nom){
        super(pdv, nom);
    }

    public void attaque(Victime v){
        if(this.mort()) {
            float coup=this.PDV / 2;
            this.addVie(v.subitFrappe(coup));
        }
    }

    public float subitFrappe(float coup) {
        this.addVie(-coup);
        if(this.mort()) {
            return -this.PDV / 2;
        }
        else{
            return 0;
        }
    }
    public float subitCharme(float coup) {
        this.addVie(-coup);
        if(this.mort()) {
            return this.PDV / 2;
        }
        else{return 0;}
    }

}
