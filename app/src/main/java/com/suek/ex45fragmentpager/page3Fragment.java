package com.suek.ex45fragmentpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class page3Fragment extends Fragment {

    //페이지3 에서 보여줄 대량의 String 데이터들
    ArrayList<String> datas= new ArrayList<>();

    ListView listView;
    ArrayAdapter adapter;

    //프레그먼트가 처음 생성될 때만 호출됨
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //대량의 데이터를 DB나 Network 에서 가져오는 작업은
        //보통 처음 한번만 실행함
        datas.add(new String("aaa"));
        datas.add(new String("nnn"));
        datas.add(new String("hhh"));
    }

    //프레그먼트가 화면에 보여지려고 만들어질때 마다마다 호출됨
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_page3, container, false);

        //대량의 데이터 추가   ---> 사실 데이터를 추가할 때는 onCreateView 보다는 onCreate 에서만 하는것이 좋다.
        /*datas.add(new String("aaa"));
        datas.add(new String("bbb"));
        datas.add(new String("ccc"));*/

        listView= view.findViewById(R.id.listview);
        adapter= new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, datas);
        listView.setAdapter(adapter);


        return view;
    }
}
