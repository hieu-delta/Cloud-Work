package Others;
import java.util.Scanner;

public class chess {
    public static Scanner in = new Scanner(System.in);

    public static int[][] board = new int[9][9];

    public static void display(){
        for (int i=1; i<=19; i++)
            System.out.print("-");
        System.out.println();
        for (int i=8; i>=1; i--){
            System.out.print("| "+i+" ");
            for (int j=1; j<=8; j++)
                if (board[i][j] > 1)
                    System.out.print((char) board[i][j] + " ");
                else System.out.print("  ");
            System.out.println("|");
        }
        System.out.print("   ");
        for (int i=1; i<=8; i++)
            System.out.print(i+" ");
        System.out.println("|");
        for (int i=1; i<=19; i++)
            System.out.print("-");
        System.out.println();
    }

    public static void initialize(){
        board[1][1]=board[1][8]=board[8][1]=board[8][8]=82;
        board[1][2]=board[1][7]=board[8][2]=board[8][7]=75;
        board[1][3]=board[1][6]=board[8][3]=board[8][6]=66;
        board[1][4]=board[8][4]=81;
        board[1][5]=board[8][5]=64;
        for (int i=1; i<=8; i++){
            board[2][i]=80;
            board[7][i]=80;
        }
    }

    // public static void check(){
    //     for (int i=1; i<=8; i++) //refresh
    //         for (int j=1; j<=8; j++)
    //             if (board[i][j]==1)
    //                 board[i][j]=0;

    //     for (int i=1; i<=8; i++) 
    //         for (int j=1; j<=8; j++){
    //             if (board[i][j]==82) //Rook
    //                 for (int x=1; x<=8; x++){
    //                     if (board[x][j]==0)
    //                         board[x][j]=1;
    //                     if (board[i][x]==0)
    //                         board[i][x]=1;
    //                 }
    //             else if (board[i][j]==75){ //Knight
    //                 if (i<8 && j>2)
    //                     if (board[i+1][j-2]==0)
    //                         board[i+1][j-2]=1;
    //                 if (i<8 && j<7)
    //                 if (board[i+1][j+2]==0)
    //                     board[i+1][j+2]=1;
    //                 if (i>1 && j>2)
    //                     if (board[i-1][j-2]==0)
    //                         board[i-1][j-2]=1;
    //                 if (i>1 && j<7)
    //                     if (board[i-1][j+2]==0)
    //                         board[i-1][j+2]=1;
    //                 if (i<7 && j>1)
    //                     if (board[i+2][j-1]==0)
    //                         board[i+2][j-1]=1;
    //                 if (i<7 && j<8)
    //                 if (board[i+2][j+1]==0)
    //                     board[i+2][j+1]=1;
    //                 if (i>2 && j>1)
    //                     if (board[i-2][j-1]==0)
    //                         board[i-2][j-1]=1;
    //                 if (i>2 && j<8)
    //                     if (board[i-2][j+1]==0)
    //                         board[i-2][j+1]=1;
    //             } 
    //             else if (board[i][j]==66){ //Bishop
    //                 int x=1;
    //                 while(i+x<=8 && j+x<=8){
    //                     if (board[i+x][j+x]==0)
    //                         board[i+x][j+x]=1;
    //                     x++;
    //                 }
    //                 x=1;
    //                 while(i-x>=1 && j-x>=1){
    //                     if (board[i-x][j-x]==0)
    //                         board[i-x][j-x]=1;
    //                     x++;
    //                 }
    //             } 
    //             else if (board[i][j]==81){ //Queen
    //                 for (int x=1; x<=8; x++){
    //                     if (board[x][j]==0)
    //                         board[x][j]=1;
    //                     if (board[i][x]==0)
    //                         board[i][x]=1;
    //                 }
    //                 int x=1;
    //                 while(i+x<=8 && j+x<=8){
    //                     if (board[i+x][j+x]==0)
    //                         board[i+x][j+x]=1;
    //                     x++;
    //                 }
    //                 x=1;
    //                 while(i-x>=1 && j-x>=1){
    //                     if (board[i-x][j-x]==0)
    //                         board[i-x][j-x]=1;
    //                     x++;
    //                 }
    //             }
    //             else if (board[i][j]==64){ //King
                    
    //             }
    //             else if (board[i][j]==80){ //Pawn
    //                 if (board[i+1][i+1]==0)
    //                     board[i+1][j+1]=0;
    //                 if (board[i+1][j-1]==0)
    //                     board[i+1][j-1]=1;
    //             }

    //         }
    // }
    public static void main(String[] args) {
        initialize();
        display();
        int mate=0;
        while(mate==0){
            int p1=in.nextInt(), p2=in.nextInt();
            int x1=p1/10, y1=p1%10, x2=p2/10, y2=p2%10;
            board[x2][y2]=board[x1][y1];
            board[x1][y1]=0;

            display();
        }
    }
}
