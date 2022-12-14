package hello.myCore.order;

import hello.myCore.discount.DiscountPolicy;
import hello.myCore.discount.FixedDiscountPolicy;
import hello.myCore.member.Member;
import hello.myCore.member.MemberRepository;
import hello.myCore.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixedDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
