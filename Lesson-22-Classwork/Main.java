class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   String[] friends = {"Alex", "Sam", "Jordan", "Maria"};

   double[] tempC = {-4.5,0,23,34,5,10};
   
   double[] tempF = convert(tempC);
}

    
  }

 double[] convert(double[] c){
    double[] tmp = new double[c.length];
    for (int i=0; i<tempF.length; i++){}
      print(tempF[i]);
  }
  

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}