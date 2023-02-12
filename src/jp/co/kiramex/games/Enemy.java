package jp.co.kiramex.games;

public class Enemy extends Character {
    
    private String type; // 種別名

    // getter
    public String getType() {
        return type;
    }

    // setter
    public void setType(String type) {
        this.type = type;
    }

    // 引数なしのコンストラクタ
    public Enemy() {
    }

    // 引数ありのコンストラクタ
    public Enemy(String name, int hp, int offense, int defense, String type) {
        super(name, hp, offense, defense);
        this.type = type;
    }
}