package a;

import lombok.Builder;

@Builder
public class A {
    private String a;
    public static void main(String [] args) {
        A.builder().a("a").build();
    }
}