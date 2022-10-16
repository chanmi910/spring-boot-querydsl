package com.example.querydsl.repository;

import com.example.querydsl.domain.Member;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import static com.example.querydsl.domain.QMember.member;

@Repository
public class MemberRepository extends QuerydslRepositorySupport {
    private final JPAQueryFactory jpaQueryFactory;

    public MemberRepository(JPAQueryFactory jpaQueryFactory) {
        super(Member.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }

    public Member findById(Long id) {
        return jpaQueryFactory
                .select(Projections.fields(Member.class,
                        member.id
                        , member.age
                        , member.userName
                ))
                .from(member)
                .where(member.id.eq(id))
                .fetchOne();
    }
}
