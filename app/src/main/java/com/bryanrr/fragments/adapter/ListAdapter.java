package com.bryanrr.fragments.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bryanrr.fragments.models.Contacto;

import java.util.List;

public class ListAdapter extends ArrayAdapter<Contacto> {

    private static class ViewHolder {
        TextView tvName;
    }

    public ListAdapter(@NonNull Context context, int resource, @NonNull List<Contacto> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Contacto contacto = getItem(position);
        ViewHolder viewHolder;


        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_activated_1, parent, false);
            viewHolder.tvName = convertView.findViewById(android.R.id.text1);
            convertView.setTag(viewHolder);
        } else {

            viewHolder = (ViewHolder) convertView.getTag();

        }

        viewHolder.tvName.setText(contacto.getName());
        return convertView;
    }
}
