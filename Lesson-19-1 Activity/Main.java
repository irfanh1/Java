class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){


    
  }

String rollDice(){
  int die1 = (int)(Math.random()*6) + 1;
  int die2 = (int)(Math.random()*6) + 1;
  return die1 + " " + die2;
}

String lotto(){
  String result = "";
  for(int i=1; i<=5; i++){
    int num = (int)(Math.random()*48) + 1;
    result = result + num + " ";
  }
  return result;
}

void diceDistribution(int N){
  int c1=0, c2=0, c3=0, c4=0, c5=0, c6=0;

  for(int i=1; i<=N; i++){
    int roll = (int)(Math.random()*6) + 1;

    if(roll==1) c1++;
    else if(roll==2) c2++;
    else if(roll==3) c3++;
    else if(roll==4) c4++;
    else if(roll==5) c5++;
    else c6++;
  }

  System.out.println("1: " + c1);
  System.out.println("2: " + c2);
  System.out.println("3: " + c3);
  System.out.println("4: " + c4);
  System.out.println("5: " + c5);
  System.out.println("6: " + c6);
}

String additionTutor(){
  int a = (int)(Math.random()*10) + 1;
  int b = (int)(Math.random()*10) + 1;
  int sum = a + b;
  int guess = 5; 
  if(guess == sum)
    return "Correct!";
  else
    return "Incorrect";
}



}