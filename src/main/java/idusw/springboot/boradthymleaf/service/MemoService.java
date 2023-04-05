package idusw.springboot.boradthymleaf.service;

import idusw.springboot.boradthymleaf.domain.Memo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemoService {
    int creat(Memo m);
    Memo read(Memo m); //m의 식별자인 mno 값도 가능
    List<Memo> readList();
    int update(Memo m); //m은 수정하고자 하는 필드 값을 전달
    int delete(Memo m); //m은 식별자인 mno 값도 가능

    List<Memo> initailize(); //초기화
    // 업무 프로세스(Business Process) 코드가 구현됨
}
