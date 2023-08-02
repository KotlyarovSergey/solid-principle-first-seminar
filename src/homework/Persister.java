package homework;

public class Persister{
//    private final User user;
    private final Persistarable persisterable;
    public Persister(Persistarable persisterable){
        this.persisterable = persisterable;
    }

    //public void save(){
    //    System.out.println("Save user: " + user.getName());
    //}
    public void save(User user){
        this.persisterable.save(user);
    }

}
