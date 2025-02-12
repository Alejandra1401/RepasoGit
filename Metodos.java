import java.util.Scanner;

public class Metodos 
{
    public int solicitarDimesion()
    {
        Scanner sc = new Scanner(System.in);
        int d = 0; 
        System.out.println("Porfavor ingrese la dimesion de la matriz");
        d= sc.nextInt();
        return d;
    }
    public int[][] llenarMatriz (int d)
    {
        int [][] matriz = new int[d][d];
        for (int i = 0; i < matriz.length; i++ )
        {
            for(int j = 0; j < matriz.length; j++ )
            {
                matriz[i][j] = (int)(Math.random()*50+1);

            }   
        }
        return matriz;
    }
}
