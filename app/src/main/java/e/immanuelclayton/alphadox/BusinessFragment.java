package e.immanuelclayton.alphadox;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BusinessFragment extends Fragment {


    public BusinessFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_business, container, false);

        Button button13 = view.findViewById(R.id.button13);
        Button button14 = view.findViewById(R.id.button14);
        Button button15 = view.findViewById(R.id.button15);

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in13 = new Intent(getActivity(),BusKnecActivity.class);
                in13.putExtra("some13","KNEC Programme");
                startActivity(in13);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in14 = new Intent(getActivity(),BusTtableActivity.class);
                in14.putExtra("some14","Timetable");
                startActivity(in14);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in15 = new Intent(getActivity(),BusNotificationActivity.class);
                in15.putExtra("some15","Notification");
                startActivity(in15);
            }
        });
        return view;
    }

}
