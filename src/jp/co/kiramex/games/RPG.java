package jp.co.kiramex.games;

public class RPG {

    public static void main(String[] args) {
        // 勇者と敵のキャラクターを生成
        Hero hero = new Hero("勇者", 10, 5, 3, 1);
        Enemy slime = new Enemy("スライム", 5, 2, 2, "スライム");

        //hero.attack(slime); // 勇者 が スライム に攻撃する
        //slime.attack(hero); // スライム が 勇者 に攻撃する
        
        hero.magic_attack(slime);
    }

}