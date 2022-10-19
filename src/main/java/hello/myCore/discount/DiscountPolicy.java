package hello.myCore.discount;

import hello.myCore.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
