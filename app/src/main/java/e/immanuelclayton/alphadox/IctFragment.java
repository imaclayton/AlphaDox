package e.immanuelclayton.alphadox;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class IctFragment extends Fragment {

    public IctFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ict, container, false);
        Button button2 = view.findViewById(R.id.button2);
        Button button3 = view.findViewById(R.id.button3);
        Button button4 = view.findViewById(R.id.button4);
        Button button5 = view.findViewById(R.id.button5);
        Button button6 = view.findViewById(R.id.button6);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getActivity(),ItKnecActivity.class);
                in2.putExtra("some2"," KNEC Programme");
                startActivity(in2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(getActivity(),ItStPaulActivity.class);
                in3.putExtra("some3"," St.Paul University Programme");
                startActivity(in3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(getActivity(), ItIntCertificationActivity.class);
                in4.putExtra("some4", " International Certification");
                startActivity(in4);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(getActivity(), ItTimetableActivity.class);
                in5.putExtra("some5"," ICT Timetable");
                startActivity(in5);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6 = new Intent(getActivity(), ItNotificationActivity.class);
                in6.putExtra("some6","ICT Notifications");
                startActivity(in6);
            }
        });
        return view;
    }
}
