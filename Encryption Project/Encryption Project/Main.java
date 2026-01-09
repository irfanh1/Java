class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o); }
  void printt(Object o){ System.out.print(o); }

  void init(){

    // This example we are substituting all lower case
    // letters to another lower case letter.
    char[] sub = new char[5];
    sub[0] = 'a';
    sub[1] = 'e';
    sub[2] = 'i';
    sub[3] = 'o';
    sub[4] = 'u';

    char[] sub2 = new char[5];
    sub2[0] = '\u2663';  // Club
    sub2[1] = '\u2660';  // Spade
    sub2[2] = '\u2665';  // Heart
    sub2[3] = '\u2666';  // Diamond
    sub2[4] = '\u2836';  // Braille

    // Encoding 
    String file = Input.readFile("test.txt");

    String encoded1 = reverse(file);                 // Level 1
    String encoded2 = encode(encoded1);               // Level 2
    String encoded3 = subEncryption(encoded2, sub, sub2); // Level 3

    Input.writeFile("Encode.txt", encoded3);

    // Decoding 
    String file2 = Input.readFile("Encode.txt");

    String decoded1 = subEncryption(file2, sub2, sub); // undo level 3
    String decoded2 = decode(decoded1);                 // undo level 2
    String decoded3 = reverse(decoded2);                // undo level 1

    Input.writeFile("Decode.txt", decoded3);
  }

  // ================= LEVEL 1 =================
  // Reverse string
  String reverse(String txt){
    String bld = "";
    for(int i = txt.length() - 1; i >= 0; i--){
      bld += txt.charAt(i);
    }
    return bld;
  }

  // ================= LEVEL 2 =================
  //  Caesar shift (+1)
  String encode(String txt){
    String bld = "";
    for(int i = 0; i < txt.length(); i++){
      char c = txt.charAt(i);
      bld += (char)(c + 1);
    }
    return bld;
  }

  String decode(String txt){
    String bld = "";
    for(int i = 0; i < txt.length(); i++){
      char c = txt.charAt(i);
      bld += (char)(c - 1);
    }
    return bld;
  }

  // ================= LEVEL 3 =================
  // Substitution (lowercase vowels only)
  String subEncryption(String s, char[] sub, char[] sub2){
    String bld = "";

    for(int i = 0; i < s.length(); i++){
      char c = s.charAt(i);
      boolean replaced = false;

      for(int j = 0; j < sub.length; j++){
        if(c == sub[j]){
          bld += sub2[j];
          replaced = true;
          break;
        }
      }
      if(!replaced){
        bld += c;
      }
    }

    return bld;
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
}
