import java.io.*;
         class moviemagic
{
        int year;
        float rating;
        String title;

        // default constructer
        moviemagic(){
        year=0;
        rating=0.0f;
        title="";
        }




    void accept() throws IOException{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the title of the movie");
            title=br.readLine();
            System.out.println("enter the year of the movie");
            year=Integer.parseInt(br.readLine());
            System.out.println("enter the rating of the movie");
            rating=Float.parseFloat(br.readLine());
        }
void display(){
            System.out.println("the title of the movie"+title);
            if(rating>=0 && rating<=2){
                System.out.println("movie is not good");
        }
        else if(rating>=2 && rating<=3){
                System.out.println("movie is ok ok");

        }
        else if(rating>=3 && rating<=5){
            System.out.println("movie is hit");
        }

        }


    public static void main(String args[]) throws IOException{
    moviemagic ob=new moviemagic();
    ob.accept();
    ob.display();

    }
}
