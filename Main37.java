import java.util.Random;
import java.util.Scanner;

public class Main37 {
    public static void main(String[] args){
        //タイトルを表示する
        System.out.println("*************************");
        System.out.println("        戦艦ゲーム        ");
        System.out.println("*************************");

        //ターンと現状を表示
        //for(int i=1; i<=50; i++){
            //System.out.println("--------[ターン" + i + "]--------");
        //}

        //入力を促すメッセージと入力値の取得部分を作る
        //x座標
        Scanner sc1 = new Scanner(System.in);
        System.out.println("爆弾のx座標を入力してください(1-5)");
        int x = sc1.nextInt();
        sc1.close();
        //y座標
        Scanner sc2 = new Scanner(System.in);
        System.out.println("爆弾のy座標を入力してください(1-5)");
        int y = sc2.nextInt();
        sc2.close();

        //ランダムに船を3つ配置する
        //配列を全て0で初期化
        int[][] arr = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        //乱数
        Random rndx = new Random();
        int valuex = rndx.nextInt(5);
        Random rndy = new Random();
        int valuey = rndy.nextInt(5);
        System.out.println(valuex);
        System.out.println(valuey);
    }
}
