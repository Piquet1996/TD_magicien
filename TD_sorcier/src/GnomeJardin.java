public class GnomeJardin extends NainJardin implements SuperPouvoir{

    public GnomeJardin(int sol){
        super(sol);
    }

    public double sort(){
        return this.solide*Math.random();
    }

    public float subitCharme(float coup) {

        if(this.solide>0) {

            if(sort()>coup){return -coup;}

            else{return -1;}
        }
        else{return 0;}
    }

}
