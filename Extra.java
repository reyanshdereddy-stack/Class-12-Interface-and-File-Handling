interface cat {
    public void eat();
    public void walk();
}
class Animal implements cat {
    public void eat(){
        System.out.println("Eat");
    }
    public void walk(){
        System.out.println("Walk");
    }
}
class Extra {
    public static void main(String[] args) {
       cat a = new Animal();
    a.eat();
    a.walk(); 
    }
    
}


