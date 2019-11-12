package com.example.ic11_group33;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.List;

public class PhotosAdapter extends ArrayAdapter<Photos> {
    ImageView imageView;

    public PhotosAdapter(@NonNull Context context, int resource, @NonNull List<Photos> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Photos photo = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.photos, parent, false);
        }

        imageView = convertView.findViewById(R.id.imageView);
        Picasso.get().load(photo.url).into(imageView);

        return convertView;
    }
}
