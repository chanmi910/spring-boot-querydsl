package com.example.querydsl.controller;

import com.example.querydsl.domain.Member;
import com.example.querydsl.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping
    public Member findById(Long id) {
        return memberService.findById(id);
    }
}
