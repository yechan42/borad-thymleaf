package idusw.springboot.boradthymleaf.service;

import idusw.springboot.boradthymleaf.domain.Memo;
import idusw.springboot.boradthymleaf.entity.MemoEntity;
import idusw.springboot.boradthymleaf.repository.MemoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service

public class MemoServiceImpl implements MemoService {
    MemoRepository memoRepository;
    public MemoServiceImpl(MemoRepository memoRepository) { // constructor DI
        this.memoRepository = memoRepository;
    }


    @Override
    public int creat(Memo m) {
        return 0;
    }

    @Override
    public Memo read(Memo m) {
        return null;
    }

    @Override
    public List<Memo> readList() {
        List<Memo> result = new ArrayList<>(); //Memo 객체를 요소로 하는 ArrayList 객체를 생성하고, 참조변수에 배정
         List<MemoEntity> entities = memoRepository.findAll(); // MemoEntity 리스트 객체를 반환함
         for(MemoEntity memoEntity : entities){
             Memo memo = new Memo();
             memo.setMno(memoEntity.getMno());
             memo.setMemoText(memoEntity.getMemoText());
             result.add(memo);
         }

        return null;
    }

    @Override
    public int update(Memo m) {
        return 0;
    }

    @Override
    public int delete(Memo m) {
        return 0;
    }

    @Override
    public List<Memo> initailize() {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            MemoEntity memo = MemoEntity.builder().memoText("sample" + i).build();
            memoRepository.save(memo);
        });
        return null;
    }
}
