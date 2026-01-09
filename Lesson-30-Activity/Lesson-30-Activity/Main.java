class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o); }
  void printt(Object o){ System.out.print(o); }

  void init(){

    Car car1 = new Car("Toyota", "Red", "Camry", 2018, 15000);
    Car car2 = new Car("Honda", "Blue", "Civic", 2016, 9000);

    print(car1.brand);
    print(car1.model);
    print(car1.value);

    print("");

    print(car2.brand);
    print(car2.model);
    print(car2.value);
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
}
