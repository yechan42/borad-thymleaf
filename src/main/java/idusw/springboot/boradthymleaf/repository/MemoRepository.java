package idusw.springboot.boradthymleaf.repository;

import idusw.springboot.boradthymleaf.entity.MemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MemoRepository extends JpaRepository<MemoEntity, Long> {
    //Repository 는 Data를 Access 하는 객체, Entities

}
