class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    
    
  }


  String spaces(int N){
   String s = "";
    for(int i=0; i<N; i++){
     s = s + " ";
  }
  return s + "DONE";
}

double harmonic(int N){
  double sum = 0;
   for(int i=1; i<=N; i++){
    sum = sum + 1.0/i;
  }
  return sum;
}

void fib(int N){
  int a = 0;
  int b = 1;
  for(int i=1; i<=N; i++){
    System.out.print(a + " ");
    int c = a + b;
    a = b;
    b = c;
  }
}


}