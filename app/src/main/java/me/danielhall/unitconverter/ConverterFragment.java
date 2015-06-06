package me.danielhall.unitconverter;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import me.danielhall.unitconverter.conversion.ConversionCategory;
import me.danielhall.unitconverter.conversion.ConversionData;
import me.danielhall.unitconverter.conversion.ConversionUnitAdaptor;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ConverterFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ConverterFragment extends Fragment {
    private static final String ARG_CATEGORY_NAME = "category_name";

    private ConversionCategory category;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param category The unit conversion category to use.
     * @return A new instance of fragment ConverterFragment.
     */
    public static ConverterFragment newInstance(ConversionCategory category) {
        ConverterFragment fragment = new ConverterFragment();
        Bundle args = new Bundle();
        args.putString(ARG_CATEGORY_NAME, category.getCategoryName());
        fragment.setArguments(args);
        return fragment;
    }

    public ConverterFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            category = ConversionData.getCategoryByName(getArguments().getString(ARG_CATEGORY_NAME));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View me = inflater.inflate(R.layout.fragment_converter, container, false);

        ListAdapter toUnitAdaptor = new ConversionUnitAdaptor(getActivity().getApplicationContext(), category);
        ListAdapter fromUnitAdaptor = new ConversionUnitAdaptor(getActivity().getApplicationContext(), category);

        ListView unitsFrom = (ListView) me.findViewById(R.id.list_units_from);
        ListView unitsTo = (ListView) me.findViewById(R.id.list_units_to);

        unitsFrom.setAdapter(toUnitAdaptor);
        unitsTo.setAdapter(fromUnitAdaptor);

        // Inflate the layout for this fragment
        return me;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
