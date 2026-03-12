package org.example.cloudarchitecture.member.repository;

import org.example.cloudarchitecture.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
