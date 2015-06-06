package me.danielhall.unitconverter.conversion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ConversionUnitAdaptor extends BaseAdapter {
    private List<ConversionUnit> units;
    private Context context;

    public ConversionUnitAdaptor(Context context, ConversionCategory category) {
        units = category.getUnits();
        this.context = context;
    }

    @Override
    public int getCount() {
        return units.size();
    }

    @Override
    public Object getItem(int position) {
        return units.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflator = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View newView = inflator.inflate(android.R.layout.simple_list_item_single_choice, parent, false);

        TextView txtView = (TextView) newView;
        txtView.setText(units.get(position).getUnitName());

        return txtView;
    }
}
