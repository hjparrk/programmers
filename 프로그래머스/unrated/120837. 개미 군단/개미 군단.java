class Solution {
    public int solution(int hp) {
        int general = hp / 5;
        int soldier = (hp % 5) / 3;
        int worker = (hp % 5) % 3;
        return general + soldier + worker;
    }
}