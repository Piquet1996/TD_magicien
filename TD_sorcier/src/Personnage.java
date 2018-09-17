public abstract class Personnage implements Victime {
    protected float PDV;
    protected String name;

    public Personnage(float pdv, String nom){
        this.PDV=pdv;
        this.name=nom;
    }

    public String toString(){
        return "je m'appelle "+this.name+" et j'ai "+this.PDV+" points de vie.";
    }

    public void affiche(){
        if(this.mort()){
        System.out.println("Je m'appelle "+this.name+" et j'ai "+this.PDV+" point de vie");
        }
        else{
            System.out.println("Je m'appelle "+this.name+" et Je suis mort");
        }
    }

    public String getNom(){
        return this.name;
    }
    public boolean mort(){
        return this.PDV>0;
    }
    public float getVie(){
        return this.PDV;
    }
    public void addVie(float num){
        this.PDV+=num;
    }
    public abstract void attaque(Victime v);



}
