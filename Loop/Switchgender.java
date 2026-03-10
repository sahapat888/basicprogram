void main(){
    char gender = 'M';
    String genderString ;

    switch (gender){
        case 'M': genderString ="Male"; break ;
        case 'F': genderString ="Female"; break ;
        default :genderString = "LGBTQ+" ;break ;
    }

    IO.println (genderString) ;



}