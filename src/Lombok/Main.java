package Lombok;

public class Main {

    public static void main(String[] args) {
        Champion champion = Champion.builder()
                .name("thang")
                .type("Test")
                .build();

        System.out.println(champion);
    }
}
