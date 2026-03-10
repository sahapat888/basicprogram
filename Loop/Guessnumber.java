
void main(){
    Scanner sc = new Scanner(System.in);
    int inputNumber ;
    int guessNumber = 50;
    boolean result = true ;

    while (result){
        IO.print("Input Guess Number");
        inputNumber =sc.nextInt();
        if(inputNumber > guessNumber)  {
            IO.println("TOO Much");
        }else if (inputNumber < guessNumber) {
            IO.println("Lower Number");
        }else {result = false ;
        }

    }
    IO.println(" Congratulation \n correct number  is "+guessNumber);

}