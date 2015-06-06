package me.danielhall.unitconverter.conversion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by daniel on 6/06/15.
 */
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
        //LayoutInflater inflator = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //View newView = inflator.inflate(resource, parent, false);
        TextView txtView = new TextView(context);
        txtView.setText(categories.get(position).getCategoryName());

        return txtView;
    }
}
