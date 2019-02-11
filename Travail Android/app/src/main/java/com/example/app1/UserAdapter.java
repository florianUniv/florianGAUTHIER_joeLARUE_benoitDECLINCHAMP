package com.example.app1;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.icu.util.ValueIterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter(Context context, List<User> userList){
        super(context, 0 , userList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.useritem, parent, false);
        }

        UserItemHolder viewHolder = (UserItemHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new UserItemHolder();
            viewHolder.Prenom = (TextView) convertView.findViewById(R.id.firstName);
            viewHolder.Nom = (TextView) convertView.findViewById(R.id.lastName);
            viewHolder.avatar = (ImageView) convertView.findViewById(R.id.avatar);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        User user = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.Prenom.setText(user.getPremon());
        viewHolder.Nom.setText(user.getNom());
        viewHolder.avatar.setImageDrawable(new ColorDrawable(user.getColor()));

        return convertView;
    }


}
