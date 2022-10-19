package hello.myCore.member;

public interface MemberService { // 회원가입, 회원조회

    public void join(Member member);

    public Member findMember(Long MemberId);
}
