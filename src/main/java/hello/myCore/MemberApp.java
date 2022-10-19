package hello.myCore;

import hello.myCore.member.Grade;
import hello.myCore.member.Member;
import hello.myCore.member.MemberService;
import hello.myCore.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "MemberA", Grade.Vip);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);

        System.out.println(member.getName());
        System.out.println(findMember.getName());

    }
}
