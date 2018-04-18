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
public class HtmFragment extends Fragment {


    public HtmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_htm, container, false);

        Button button10 = view.findViewById(R.id.button10);
        Button button11 = view.findViewById(R.id.button11);
        Button button12 = view.findViewById(R.id.button12);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in10 = new Intent(getActivity(),HtmKnecActivity.class);
                in10.putExtra("some10"," KNEC Programme");
                startActivity(in10);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in11 = new Intent(getActivity(),HtmTtableActivity.class);
                in11.putExtra("some11","Timetable");
                startActivity(in11);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in12 = new Intent(getActivity(),HtmNotificationActivity.class);
                in12.putExtra("some12","Notification");
                startActivity(in12);
            }
        });

        return view;
    }

}
