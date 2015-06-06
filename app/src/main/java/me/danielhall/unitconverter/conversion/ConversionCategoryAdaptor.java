package me.danielhall.unitconverter.conversion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

import me.danielhall.unitconverter.R;

public class ConversionCategoryAdaptor extends BaseAdapter {
    private List<ConversionCategory> categories;
    private Context context;

    public ConversionCategoryAdaptor(Context context) {
        categories = ConversionData.getCategoryList();
        this.context = context;
    }

    @Override
    public int getCount() {
        return categories.size();
    }

    @Override
    public Object getItem(int position) {
        return categories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflator = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View newView = inflator.inflate(android.R.layout.simple_list_item_1, parent, false);

        TextView txtView = (TextView) newView;
        txtView.setText(categories.get(position).getCategoryName());

        return txtView;
    }
}
