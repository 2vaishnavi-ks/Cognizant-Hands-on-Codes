package module3;

interface Playable{
    void play();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("I play guitar, which is my hobby");
    }
}
class Piano implements Playable{
    public void play(){
        System.out.println("I play Piano, which is what i learnt from my brother");

    }
}
public class interfaceExample {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        Piano p = new Piano();

        g.play();
        p.play();
    }
}
