void main(){
    int day =1;
    String dayString ;
    switch (day){
        case 1: dayString = "Monday";
        break;
        case 2: dayString = "Tuesday";
        break;
        case 3: dayString = "Wednesday";
        break;
        case 4: dayString = "Thursday";
        break;
        case 5: dayString = "Friday";
        break;
        case 6: dayString = "Saturday";
        break;
        case 7: dayString = "Sunday";
        break;
        default: dayString = "Not valid Day";
        break;

    }
    IO.print(day+" Day String : " + dayString);
}