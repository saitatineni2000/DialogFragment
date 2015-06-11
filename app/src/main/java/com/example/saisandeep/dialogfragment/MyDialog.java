package com.example.saisandeep.dialogfragment;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by saisandeep on 2/2/2015.
 */
public class MyDialog extends DialogFragment implements View.OnClickListener{

    Button yes,no;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View view= inflater.inflate(R.layout.mydialog,null);
        yes= (Button) view.findViewById(R.id.yes);
        //no= (Button) view.findViewById(R.id.no);
        yes.setOnClickListener(this);
       // no.setOnClickListener(this);
            setCancelable(false);
        return view;

    }


    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.yes)
        {
            dismiss();
            Toast.makeText(getActivity(),"Yes button was clicked",Toast.LENGTH_SHORT).show();
        }
       /* else
        {
            dismiss();
            Toast.makeText(getActivity(),"No button was clicked",Toast.LENGTH_SHORT).show();
        }*/
    }
}
