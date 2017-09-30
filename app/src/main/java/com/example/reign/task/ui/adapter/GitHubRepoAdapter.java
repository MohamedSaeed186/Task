package com.example.reign.task.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.reign.task.R;
import com.example.reign.task.api.model.GitHubRepo;

import java.util.List;

/**
 * Created by Reign on 29-Sep-17.
 */

    public class GitHubRepoAdapter extends ArrayAdapter<GitHubRepo> {

        private Context context;
        private List<GitHubRepo> values;

        public GitHubRepoAdapter(Context context, List<GitHubRepo> values) {
            super(context, R.layout.activity_list_item_pagination, values);

            this.context = context;
            this.values = values;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;

            if (row == null) {
                LayoutInflater inflater =
                        (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(R.layout.activity_list_item_pagination, parent, false);
            }

            TextView textView = (TextView) row.findViewById(R.id.list_item_pagination_text);

            GitHubRepo item = values.get(position);
            String message = item.getName();
            textView.setText(message);

            return row;
        }



    }
