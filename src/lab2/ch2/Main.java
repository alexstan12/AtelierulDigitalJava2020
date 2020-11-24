package lab2.ch2;

public class Main {
    public static void main(String[] args) {

        boolean hasActor50;
        boolean studioHasActor;

        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35,
                new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu un premiu", 30,
                new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu un oscar din 2018",60,
                new Premiu[]{oscar2018});
        Actor actorFaraOscar = new Actor("actor fara oscar 1", 24,
                new Premiu[]{});

        Film starWars4 = new Film(1977,"Star Wars: Episode IV – A New Hope",
                new Actor[]{actorOscar1990,actorFaraOscar});
        Film film2 = new Film(1990, "random film",
                new Actor[]{actorOscar2010,actorFaraOscar});
        Film film3 = new Film(2010,"film cu actori fara premii3",
                new Actor[]{actorFaraOscar, actorOscar2018});
        Film film4 = new Film(2018, "film cu actori de oscar",
                new Actor[]{actorOscar2010, actorOscar2018, actorFaraOscar});
        Film film5 = new Film(2018, "film cu actori fara premii5",
                new Actor[]{actorFaraOscar});

        Studio studio1 = new Studio("LucasArts", new Film[]{starWars4,film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1,studio2};

        for(int i=0; i< studioDatabase.length; i++) {
            if (studioDatabase[i].getFilme().length > 2) {
                System.out.println(studioDatabase[i].getNume() + " published more than 2 movies");
            }
        }
        for(int i=0; i< studioDatabase.length; i++) {
            studioHasActor = false;
            for (int j = 0; j < studioDatabase[i].getFilme().length; j++) {
                hasActor50 = false;
                for(int k = 0; k<studioDatabase[i].getFilme()[j].getActori().length; k++){
                    if(studioDatabase[i].getFilme()[j].getActori()[k].getNume() == "actor fara oscar 1"){
                        studioHasActor = true;
                    }
                    if(studioDatabase[i].getFilme()[j].getActori()[k].getVarsta() > 50){
                        hasActor50 = true;
                    }
                }
                if(hasActor50) System.out.println(studioDatabase[i].getFilme()[j].getNume() + " has actors above 50");
            }
            if(studioHasActor) System.out.println(studioDatabase[i].getNume() + " has 'actor fara oscar 1' playing");
        }


    }
}
