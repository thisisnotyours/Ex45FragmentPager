package com.suek.ex45fragmentpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


//액티비티에 다른 액티비티를 넣을수가 없어서 Fragment 를 사용한다...

public class page1Fragment extends Fragment {

    TextView tv;
    Button btn;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_page1, container, false);

        //인플레이터 끝나고 id 찾아주고
        tv= view.findViewById(R.id.tv);   //인플레이터를 한 녀석(view)에게 id 찾기
        btn= view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("글씨 바꾸기 Hello Android");

            }
        });


        return view;
    }
}
