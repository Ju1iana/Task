package u.pankratova;

public class Calculate {
    public int amount(int[] number) {
        int sum = 0;
        for (int i : number) {
            sum += i;
        }
        return sum;
    }
}