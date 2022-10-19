package hello.myCore.discount;

import hello.myCore.member.Grade;
import hello.myCore.member.Member;

public class FixedDiscountPolicy implements DiscountPolicy{
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.Vip) return 1000;
        return 0;
    }
}
