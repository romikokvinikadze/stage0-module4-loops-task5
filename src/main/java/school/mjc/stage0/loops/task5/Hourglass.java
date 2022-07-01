package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        for (int i=0; i<height; i++){
            for (int j=0; j<height; j++){
                int k = getK(height, i);
                if (k <= j && j <= height - k - 1){
                    System.out.print("8");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int getK(int height, int current) {
        if (current < height / 2) return current;
        return height - 1 - current;
    }

    public static void main(String[] args) {
        new Hourglass().printHourglassOfGivenSize(4);
    }
}
