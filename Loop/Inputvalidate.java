void main(){
    Scanner sc = new Scanner(System.in);
    int age = -1 ;

    while (age < 0|| age > 150 ){
        IO.print("Input Age (0-150) : ");
        age = sc.nextInt();

    }
    IO.println("Register Succesfully!!!! \n your age is "+age);

}