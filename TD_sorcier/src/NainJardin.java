public class NainJardin implements Victime {
    protected int solide;

    public NainJardin(int sol){
            this.solide=sol;
    }

    public float subitFrappe(float coup) {
        if(coup>=this.solide){
            int solideAvantCoup=this.solide;
            this.solide=0;
            return solideAvantCoup;
        }
        else {//cas ou  (coup<this.solide)
            this.solide-=coup;
            return -coup;
        }
    }
    public float subitCharme(float coup) {

        if(this.solide>0) {
            return -1;
        }
        else{return 0;}
    }
}
