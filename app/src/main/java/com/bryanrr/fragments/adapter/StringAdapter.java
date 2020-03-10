package com.bryanrr.fragments.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bryanrr.fragments.FindingFragmentActivity;
import com.bryanrr.fragments.FragmentArgumentsActivity;
import com.bryanrr.fragments.FragmentDinamicActivity;
import com.bryanrr.fragments.FragmentMethodActivity;
import com.bryanrr.fragments.FragmentStaticActivity;

import java.util.List;

public class StringAdapter extends ArrayAdapter<String> {

    List<String> items;
    Context context;
    int resource;

    public StringAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);

        this.context = context;
        this.items = objects;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(resource, null, false);
        TextView textView = view.findViewById(android.R.id.text1);
        textView.setText(items.get(position));


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectActivity(position);
            }
        });

        return view;
    }

    private void selectActivity(int position) {
        Intent intent;
        switch(position){
            case 0:
                intent = new Intent(context, FragmentStaticActivity.class);
                context.startActivity(intent);
                break;
            case 1:
                intent = new Intent(context, FragmentDinamicActivity.class);
                context.startActivity(intent);
                break;

            case 2:
                intent = new Intent(context, FindingFragmentActivity.class);
                context.startActivity(intent);
                break;
            case 3:
                intent = new Intent(context, FragmentArgumentsActivity.class);
                context.startActivity(intent);
                break;
            case 4:
                intent = new Intent(context, FragmentMethodActivity.class);
                context.startActivity(intent);
                break;
        }
    }
}
