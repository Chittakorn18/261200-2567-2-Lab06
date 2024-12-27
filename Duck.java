public class Duck extends Animal implements Flyable {
    String name;

    public Duck(String name){
        this.name = name;
    }

    public String toString(){
        return "ped " + this.name;
    }

    void sound(){
        System.out.println("quack quack");

    }

    @Override
    public void fly() {
        System.out.println("<<< prp prp >>>");
    
    }

    public void glide(){
        System.out.println("ron <<|>>");
    }

    void clean(Animal animal){
        System.out.println(this.toString() + " is cleaning " + animal);
    }

    void beCrispy() {
        System.out.println("grup grup");
    }
    

}
