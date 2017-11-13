package jp.ac.uryukyu.ie.e175718;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {
    public Enemy(String e_name,int e_hitpoint,int e_attack){
        super(e_name,e_hitpoint,e_attack);
    }
}
