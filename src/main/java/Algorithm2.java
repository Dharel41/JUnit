import java.util.List;

public class Algorithm2 {
    /* Return the smallest integer (but greater than 0) which not occur in list
    * Constraints:
    * Max list size=100 000
    * -1 000 000 <= element size <= 1 000 000
    * */

    private int min=1;

    int solution(List<Integer> list){

        if(list.isEmpty() || list.size()>100000){
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int i :list) {
            if (i > 1000000 || i < -1000000) {
                throw new ArithmeticException("One of the element is too big");
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == min) {
                min++;
                i = 0;
            }
        }
        return min;
    }
}
