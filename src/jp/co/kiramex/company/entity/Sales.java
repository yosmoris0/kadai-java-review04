package jp.co.kiramex.company.entity;

public class Sales extends Employee {
    // フィールド
    private String appointment;

    // コンストラクタ
    public Sales() {
    }

    // 引数ありコンストラクタ
    public Sales(int employeeId, String employeeName, int vitality) {
        // スーパークラスのコンストラクタを呼び出す
        super(employeeId, employeeName, "営業部", vitality);
        this.appointment = "未定";
    }

    // 報告するメソッド
    public void report() {
        super.setVitality(super.getVitality() - 10);
        System.out.println("今日は10件アポイント取りました");
    }

    @Override
    // 自己紹介メソッド
    public void introduce() {
        super.setVitality(super.getVitality() - 10);
        System.out.println("私の名前は" + super.getEmployeeName() + "です。");
        System.out.println("所属部署は" + super.getDivisionName() + "です。");
        System.out.println("今日のアポイント先は" + appointment + "です。");
    }

    @Override
    // 挨拶をするメソッド、スーパークラスのメソッドをオーバーライド
    public void greeting() {
        super.setVitality(super.getVitality() - 10);
        System.out.println(super.getDivisionName() + "の皆さん" + "おはようございます");
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }
}