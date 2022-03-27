public class Task3Array10x10
{
    public static void main(String[] args) {
        int [][] matrix = new int[10][10];
        int sum = 0;

        for(int row = 0; row < 10; row++){
            for(int column = 0; column < 10; column++){
                if( row == column){
                    matrix[row][column] = row;
                    sum+= matrix[row][column];
                }
                else {
                   matrix[row][column] = 0;
                }
                System.out.print(matrix[row][column] );
            }
            System.out.println();
        }
        System.out.println("This program will show diagonal matrix = " +sum +'\n'  );
        System.out.println();
    }
}
