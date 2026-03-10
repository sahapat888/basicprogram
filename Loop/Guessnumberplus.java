
void main(){
    Scanner sc = new Scanner(System.in);
    Random randomNum = new Random();
    int inputNumber ;
    int guessNumber = randomNum.nextInt(100);
    boolean result = true ;
    int count =0 ;
    int score =100 ;

    while (result){
        IO.print("Input Guess Number");
        inputNumber =sc.nextInt();
        if(inputNumber > guessNumber)  {
            IO.println("TOO Much");
            count++;
        }else if (inputNumber < guessNumber) {
            IO.println("Lower Number");
            count++;
        }else {result = false ;
        }

    }
    IO.println(" Congratulation \n correct number  is "+guessNumber);

}