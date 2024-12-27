public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal(); 
        Cow cow = new Cow();
        Owl owl = new Owl(); 
        Pig pig = new Pig();
        Duck duck = new Duck("jame");
        Duck duck2 = new Duck("bond");
       duck.sound();
       cow.sound();
       pig.sound();
       owl.sound();
       duck.clean(duck2);
       duck2.fly();
       duck.glide();
       Duck curry = new PekingDuck("chef curry");
       curry.clean(duck2);
      
       curry.beCrispy();
        

    }
    
}