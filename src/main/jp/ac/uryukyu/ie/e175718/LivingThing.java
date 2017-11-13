package jp.ac.uryukyu.ie.e175718;

public class LivingThing {
        String name;
        int hitPoint;
        int attack;
        boolean dead;

        /**
         * コンストラクタ。名前、最大HP、攻撃力を指定する。
         *
         * @param name      モンスター名
         * @param maximumHP モンスターのHP
         * @param attack    モンスターの攻撃力
         */
        public LivingThing(String name, int maximumHP, int attack) {
            this.name = name;
            hitPoint = maximumHP;
            this.attack = attack;
            dead = false;
            System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
        }

        /**
         * getterメソッドと同等。生死をboolean表現しているためメソッド名をisDead()とした。
         *
         * @return boolean
         */
        public boolean isDead() {
            return dead;
        }

        public String getName() {
            return name;
        }

        public void attack(LivingThing opponent) {
            if (hitPoint >= 0) {
                int damage = (int) (Math.random() * attack);
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
                opponent.wounded(damage);
            }
        }
        public void wounded(int damage) {
            hitPoint -= damage;
            if (hitPoint < 0) {
                dead = true;
                System.out.printf("%sは倒れた。\n", name);
            }
        }
    }