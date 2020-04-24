package Lab2.CodeChallenge2;

public class Main {
    public static void main(String[] args) {

        Premiu oscar1990 = new Premiu("oscar",1990);
        Premiu oscar2000 = new Premiu("oscar",2000);
        Premiu oscar2010 = new Premiu("oscar",2010);
        Premiu oscar2018 = new Premiu("oscar",2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri",35, new Premiu[]{oscar1990,oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000",55,new Premiu[]{oscar2000});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018",23,new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01",33,new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02",60,new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 01",20,new Premiu[]{});

        Film film1 = new Film(1990,"film cu actori de oscar", new Actor[]{actorOscar1990,actorFaraPremii01});
        Film film2 = new Film(2010,"film cu actori fara premii2",new Actor[]{actorFaraPremii01,actorFaraPremii02,actorFaraPremii03});
        Film film3 = new Film(2010,"film cu actori fara premii3", new Actor[]{actorFaraPremii01,actorFaraPremii02,actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar 2018", new Actor[]{actorOscar2010,actorOscar2018,actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02,actorFaraPremii03});

        Studio studio1 = new Studio("MGM",new Film[]{film1,film2});
        Studio studio2 = new Studio("Disney",new Film[]{film3,film4,film5});

        Studio[] studioDatabase = new Studio[]{studio1,studio2};


        //Cerinta 1. Get all studio names that have published more that 2 movies
        System.out.print("Studio-uri cu mai mult de 2 filme: ");
        for(int i=0; i<studioDatabase.length;i++){
            if( studioDatabase[i].filme.length > 2){
                System.out.println(studioDatabase[i].nume+" ");
            }
        }
        //Cerinta 2. Get the studio names in which play the actor with name"actor cu 2 oscaruri"
        System.out.print("Numele studio-urilor care contin actorul: ");
        for(int i=0;i<studioDatabase.length;i++){
            for(int j=0;j<studioDatabase[i].filme.length;j++){
                for(int k=0;k<studioDatabase[i].filme[j].actori.length;k++){
                    if(studioDatabase[i].filme[j].actori[k].nume =="actor cu 2 oscaruri"){
                        System.out.println(studioDatabase[i].nume+" ");
                    }
                }
            }
        }
        //Cerinta 3. Get movie names in which plays at least an actor with age above 50
        System.out.print("Numele filmelor in care joaca un actor cu varsta de peste 50 de ani: ");
        for(int i=0;i<studioDatabase.length;i++){
            for(int j=0;j<studioDatabase[i].filme.length;j++){
                for(int k=0;k<studioDatabase[i].filme[j].actori.length;k++){
                    if(studioDatabase[i].filme[j].actori[k].varsta > 50){
                        System.out.print(studioDatabase[i].filme[j].nume+", ");
                    }
                }
            }
        }
        System.out.println();
    }
}
