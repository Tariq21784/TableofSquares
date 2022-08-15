public class TableOfSquares {

    public static void main(String[] args) {
        short x = 1;
        short y = 1;
        short z = 1;

        System.out.println("----using for loop----");
        for(;x<=20;x++){

                System.out.println("Number:"+(x)+"\tSquare:"+(x*x));

        }
        System.out.println("\n----using while loop----");

        while (y<=20){

            System.out.println("Number:"+(y)+"\tSquare:"+(y*y));
            y++;
        }
        System.out.println("\n----using do...while loop----");
        do {

            System.out.println("Number:"+(z)+"\tSquare:"+(z*z));
            z++;

            }while(z<=20);
    }
}