package headFirst;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck(){}
    public void display(){}
    public void performFly(){
        flyBehavior.fly();
    }
    public void perfomQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks swim, even decoys!!!");
    }
    
}
